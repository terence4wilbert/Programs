from sys import argv

script, filename = argv

txt = open(filename)
print 'contents of txt \n%s' % txt
print "Here's your file %r:\n" % filename
print txt.read()

print "Type the filename again:"
file_again = raw_input("> ")

txt_again = open(file_again)

print "%s" % txt_again.read()
