from sys import argv

script, first, second, third = argv

print "The script is called:", script
print "Your first variable is:", first
print "Your second variable is:", second
print "Your third variable us:", third

x = int(raw_input("Give me a number to multply by: "))
y = int(raw_input("Give me a second number:"))

print "you just calculated the following %d." % (x * y)
