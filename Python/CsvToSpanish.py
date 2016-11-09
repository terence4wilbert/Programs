#!/usr/bin/env python
import sys
import urllib2
import csv
import time
import xml.dom.minidom as DOM
import Q2API.xml.base_xml as BX

def naively_get_node_text(node):
    # Discard all whitespace-only text blocks (which can get inserted by minidom for "pretty"
    # printing) and concatenate the rest.  This assumes there is pure text within the node.
    return ''.join(filter(bool, (childNode.nodeValue.strip() for childNode in node.childNodes)))

def build_xml_node(info):
    ##Take the information that we've gained from the geocoding and build an xml node for that branch
    ##eventually we'll string them all into the root node
    
 ##Lobby
    
    mlo = BX.XMLNode('Open', None, info['Monday Open'], None)
    mlc = BX.XMLNode('Close', None, info['Monday Close'], None)
    mlt = BX.XMLNode('monday', None, None, [mlo,mlc])
    
    tulo = BX.XMLNode('Open', None, info['Tuesday Open'], None)
    tulc = BX.XMLNode('Close', None, info['Tuesday Close'], None)
    tult = BX.XMLNode('tuesday', None, None, [tulo,tulc])
    
    wlo = BX.XMLNode('Open', None, info['Wednesday Open'], None)
    wlc = BX.XMLNode('Close', None, info['Wednesday Close'], None)
    wlt = BX.XMLNode('wednesday', None, None, [wlo,wlc])
    
    thlo = BX.XMLNode('Open', None, info['Thursday Open'], None)
    thlc = BX.XMLNode('Close', None, info['Thursday Close'], None)
    thlt = BX.XMLNode('thursday', None, None, [thlo,thlc])
    
    flo = BX.XMLNode('Open', None, info['Friday Open'], None)
    flc = BX.XMLNode('Close', None, info['Friday Close'], None)
    flt = BX.XMLNode('friday', None, None, [flo,flc])
    
    salo = BX.XMLNode('Open', None, info['Saturday Open'], None)
    salc = BX.XMLNode('Close', None, info['Saturday Close'], None)
    salt = BX.XMLNode('saturday', None, None, [salo,salc])
    
    sulo = BX.XMLNode('Open', None, info['Sunday Open'], None)
    sulc = BX.XMLNode('Close', None, info['Sunday Close'], None)
    sult = BX.XMLNode('sunday', None, None, [sulo,sulc])
    
    lb_nodes = [mlt, tult, wlt, thlt, flt, salt, sult]
    
    lb = BX.XMLNode('Lobby', None, None, lb_nodes)
	
    ##Drive-Thru Hours
    mdo = BX.XMLNode('Open', None, info['Monday Open DT'], None)
    mdc = BX.XMLNode('Close', None, info['Monday Close DT'], None)
    mdt = BX.XMLNode('monday', None, None, [mdo,mdc])
    
    tudo = BX.XMLNode('Open', None, info['Tuesday Open DT'], None)
    tudc = BX.XMLNode('Close', None, info['Tuesday Close DT'], None)
    tudt = BX.XMLNode('tuesday', None, None, [tudo,tudc])
    
    wdo = BX.XMLNode('Open', None, info['Wednesday Open DT'], None)
    wdc = BX.XMLNode('Close', None, info['Wednesday Close DT'], None)
    wdt = BX.XMLNode('wednesday', None, None, [wdo,wdc])
    
    thdo = BX.XMLNode('Open', None, info['Thursday Open DT'], None)
    thdc = BX.XMLNode('Close', None, info['Thursday Close DT'], None)
    thdt = BX.XMLNode('thursday', None, None, [thdo,thdc])
    
    fdo = BX.XMLNode('Open', None, info['Friday Open DT'], None)
    fdc = BX.XMLNode('Close', None, info['Friday Close DT'], None)
    fdt = BX.XMLNode('friday', None, None, [fdo,fdc])
    
    sado = BX.XMLNode('Open', None, info['Saturday Open DT'], None)
    sadc = BX.XMLNode('Close', None, info['Saturday Close DT'], None)
    sadt = BX.XMLNode('saturday', None, None, [sado,sadc])
    
    sudo = BX.XMLNode('Open', None, info['Sunday Open DT'], None)
    sudc = BX.XMLNode('Close', None, info['Sunday Close DT'], None)
    sudt = BX.XMLNode('sunday', None, None, [sudo,sudc])
    
    dt_nodes = [mdt, tudt, wdt, thdt, fdt, sadt, sudt]
    
    dt = BX.XMLNode('Drivethru', None, None, dt_nodes)
    
   
        
    
    lat = BX.XMLNode('lat', None, info['Latitude'], None)
    lon = BX.XMLNode('lon', None, info['Longitude'], None)
    tit = BX.XMLNode('title', None, info['Title'], None)
    add = BX.XMLNode('address', None, info['StreetAddress'], None)
    csz = BX.XMLNode('citystatezip', None, info['CityStateZip'], None)
    phn = BX.XMLNode('phone', None, info['Phone'], None)
    typ = BX.XMLNode('type', None, info['Type'], None)
    
    
    hr_nodes = [lb, dt]
    hr = BX.XMLNode('Hours', None, None, hr_nodes)
    
    
    ret_nodes = [lat, lon, tit, add, csz, phn, typ, hr]
    
    return BX.XMLNode('branchlocation', None, None, ret_nodes)

args = sys.argv
if len(args) < 2:
    print 'Error!  Please provide input file name.'
    exit()
#print args

print 'Opening ' + args[1]
x_h = open(args[1], 'rU')
csv_in = x_h.read()
x_h.close()
actual = csv_in.split('Title')
csv_in = 'Title' + actual[1]

csv_in = csv_in.split('\n')

fields = ['Title','StreetAddress','CityStateZip','Phone','Type','Latitude','Longitude','Monday Open',
          'Monday Close','Tuesday Open','Tuesday Close','Wednesday Open','Wednesday Close','Thursday Open',
          'Thursday Close','Friday Open','Friday Close','Saturday Open','Saturday Close','Sunday Open',
          'Sunday Close','Monday Open DT','Monday Close DT','Tuesday Open DT','Tuesday Close DT','Wednesday Open DT','Wednesday Close DT',
          'Thursday Open DT','Thursday Close DT','Friday Open DT','Friday Close DT','Saturday Open DT','Saturday Close DT','Sunday Open DT','Sunday Close DT']
reader = csv.DictReader(csv_in, fields)
i = 0
output = []

print 'Data imported and cleaned.  Beginning GeoCoding:'

for line in reader:
    if not line['StreetAddress']:
        pass
    elif i != 0:
        print line['StreetAddress'].replace(' ','+'),line['CityStateZip'].replace(' ','+') 
        time.sleep(1)
        url = urllib2.urlopen('http://maps.googleapis.com/maps/api/geocode/xml?address=%s,%s&sensor=false'%(line['StreetAddress'].replace(' ','+'),line['CityStateZip'].replace(' ','+') ))
        geo_results =  url.read()
        xml = DOM.parseString(geo_results)
        try:
            line['Latitude'] = naively_get_node_text(xml.getElementsByTagName('lat')[0])
            line['Longitude'] = naively_get_node_text(xml.getElementsByTagName('lng')[0])
        except IndexError:
            print geo_results
            print xml.getElementsByTagName('lat')
            print xml.getElementsByTagName('lng')
            print i
            
        print line['Latitude'] +','+line['Longitude']
        output.append(build_xml_node(line))
        
    i += 1

print 'Geocoding complete.  Building output file.'
fini = BX.XMLNode('locationCollection', None, None, output)

try:
    print 'Saving to ' + args[2]
except IndexError:
    file_name = args[1].split('.')
    #print file_name
    args.append(file_name[0] + '.xml')
    print 'Saving to ' + args[2] 
    
o_h = open(args[2], 'w')
o_h.write(fini.flatten_self())
#print fini.flatten_self()
o_h.close()



