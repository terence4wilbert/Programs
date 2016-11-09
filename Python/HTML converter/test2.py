# coding=utf-8
import sys
import codecs
import htmlentry as entry


def convert(input_file, output_file):

    t = u""

    try:
        with codecs.open(input_file, encoding='utf-8') as text:
            newtext = text.read()
    except:
        print "There was a problem opening \"%s\"." % input_file
        sys.exit(0)

    for i in newtext:
        if ord(i) in entry.codepoint2name:
            name = entry.codepoint2name.get(ord(i))
            t += "&" + name + ";"
        else:
            t += i
    # print '%r' % t.encode('utf-8').replace('\r', '')

    try:
        out_file = open(output_file, 'w')
        sss1 = t.encode('utf-8').replace('\r', '')
        out_file.write(sss1)
        out_file.close()
        print "\"%s\" was created successfully!" % output_file
    except:
        print "There was a problem writing to, or creating \"%s\"." % output_file
        sys.exit(0)

# if __name__=='__main__':
#     Convert2HTML()
