#!/usr/bin/env python
import sys
import xlrd
import xlwt


def word_split_0(spanish):

    if ":" in spanish:
        spanish_split = spanish.split(":", 1)

        return "%s:" % (spanish_split[0])
    else:
        return spanish

def word_split_1(spanish):

    if ":" in spanish:
        spanish_split = spanish.split(":", 1)

        return "%s" % (spanish_split[1])
    else:
        return ""

args = sys.argv
if len(args) < 2:
    print 'Error! Please provide a input file and output file name.'
    exit()
elif len(args) < 3:
    print 'Error!  Please provide output file name if you have provided a input file name already.'
    exit()
print args

file_handle = xlrd.open_workbook(args[1])

sheet = file_handle.sheet_by_index(0)

book = xlwt.Workbook(encoding="utf-8")
#sheet1 = book.add_sheet("Python Sheet 1")
sheet1 = book.add_sheet("Sheet 1")

for i in range(sheet.nrows):
    line = sheet.row_values(i)
    lines = sheet.cell(i, 0).value
    #print word_split_0(lines)

#print "\n"

for i in range(sheet.nrows):
    line = sheet.row_values(i)
    lines = sheet.cell(i, 0).value
    #print word_split_1(lines)



for i in range(sheet.nrows):
    lines = sheet.cell(i, 0).value
    sheet1.write(i, 0, word_split_0(lines))
    sheet1.write(i, 1, word_split_1(lines))
book.save(args[2])
