import re

phoneNumRegex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
#print phoneNumRegex
mo = phoneNumRegex.search('My number is 415-555-4242.')
#print mo
print('Phone number found: ' + mo.group())



phoneNumRegex = re.compile(r'(\d\d\d)-(\d\d\d-\d\d\d\d)')
mo = phoneNumRegex.search('My number is 415-555-4242')
print ('\n')
print mo.group()
print ('\n')
print mo.group(0)
print ('\n')
print mo.group(1)
print ('\n')
print mo.group(2)
print ('\n')
print mo.groups()

areaCode, mainNumber = mo.groups()

print('You area code is: ' + areaCode)
print('Your area code is ' + areaCode + ' The whole number is: ' + areaCode + '-' + mainNumber)


print ('\n')

batRegex = re.compile(r'Bat(wo)+man')
mo1 = batRegex.search('The Adventures of Batwoman')
print mo1.group()
mo2 = batRegex.search('The Adventures of Batwowowowowoman')
print mo2.group()
mo3 = batRegex.search('The Adventures of Batman')
print mo3 == None

print('\n')


thep = 'hahahahaahahhahahahaaaaaahahahahhhhhhahahahahahaha'
haRegex = re.compile(r'(ha){3,}')
mo1 = haRegex.search(thep)
print mo1.group()


thep = 'hahahahaahahhahahahaaaaaahahahahhhhhhahahahahahaha'
haRegex = re.compile(r'(ha){3,}?')
mo1 = haRegex.search(thep)
print mo1.group()

text = 'Cell: 415-555-9999 Work: 212-555-0000'
phoneNumRegex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
mo = phoneNumRegex.search(text)
print mo.group()

print('\n')

text = 'Cell: 415-555-9999 Work: 212-555-0000'
phoneNumRegex = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
mo = phoneNumRegex.findall(text)
print mo[0], mo[1]

print('\n')

text2 = 'Cell: 415-555-9999 Work: 212-555-0000'
phoneNumRegex = re.compile(r'(\d\d\d)-(\d\d\d)-(\d\d\d\d)')
print phoneNumRegex.findall(text2)

print('\n')

xmasRegex = re.compile(r'\d+\s\w+')
print xmasRegex.findall('12 drummers, 11 pipers, 10 lords, 9 ladies, 8 maids, 7 swans, 6 geese, 5 rings, 4 birds, 3 hens, 2 doves, 1 partridge')

vowelRegex = re.compile(r'[aeiouAEIOU]')
stfr = vowelRegex.findall('RoboCop eats baby food. BABY FOOD.')
print stfr
print ('There are ' + str(len(stfr)) + ' vowels in your string') 

print ('\n')

agentNamesRegex = re.compile(r'Agent (\w)(\w)\w*')
agentSent = agentNamesRegex.sub(r'*\2****', 'Agent Alice told Agent Carol that Agent Eve knew Agent Bob was a double agent.')
print agentSent


phoneRegex = re.compile(r'''(
    (\d{3}|\(\d{3}\))?           #area code
    (\s|-|\.)?                  #separator
    \d{3}                       #first 3 digits
    (\s|-|\.)                   #seperator
    \d{4}                       #last 4 digits
    (\s*(ext|x|ext.)\s*\d{2,5})?#extension
    )''', re.VERBOSE)