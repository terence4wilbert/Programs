# coding=utf-8
import sys
import codecs
import htmlentry as entry
from sys import argv

script, inputfile, output = argv
t = u""

try:
    with codecs.open(inputfile, encoding='utf-8') as text:
        newtext = text.read()
except:
    print "There was a problem opening \"%s\"." % inputfile
    sys.exit(0)

for i in newtext:
    if ord(i) in entry.codepoint2name:
        name = entry.codepoint2name.get(ord(i))
        t += "&" + name + ";"
    else:
        t += i
print '%r' % t.encode('utf-8').replace('\r', '')

out_file = open(output, 'w')
sss1 = t.encode('utf-8').replace('\r', '')
out_file.write(sss1)
out_file.close()
