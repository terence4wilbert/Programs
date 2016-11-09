# -*- coding: iso-8859-1 -*-

import Tkinter
from test2 import convert
import sys


class GUI_tk(Tkinter.Tk):
    def __init__(self,parent):
        Tkinter.Tk.__init__(self,parent)
        self.parent = parent
        self.initialize()


    def initialize(self):
        self.grid()
        self.minsize(width=250, height=100)
        self.inputentryVariable = Tkinter.StringVar()
        self.inputentry = Tkinter.Entry(self)
        self.inputentry.grid(column=1, row=0, sticky='EW')
        self.inputentry.bind("<Return>", self.OnPressEnter)
        self.inputentryVariable.set("inFile")

        label1 = Tkinter.Label(self, text=u"Input file:", anchor="w")
        label1.grid(column=0, row=0, columnspan=1, sticky='EW')

        self.outputentryVariable = Tkinter.StringVar()
        self.outputentry = Tkinter.Entry(self)
        self.outputentry.grid(column=1, row=1, sticky='EW')
        self.outputentry.bind("<Return>", self.OnPressEnter)
        self.outputentryVariable.set("outFile")

        label2 = Tkinter.Label(self, text=u"Output file:", anchor="w")
        label2.grid(column=0, row=1, columnspan=1, sticky='EW')

        button = Tkinter.Button(self, text=u"Convert", command = self.OnPressConvert)
        button.grid(column=0, row=2, sticky='W')

        self.resultlabelVariable = Tkinter.StringVar()
        resultlabel = Tkinter.Label(self, textvariable = self.resultlabelVariable, anchor="w", fg="blue", bg="white")
        resultlabel.grid(column=1, row=2, columnspan=1, sticky='EW')

        self.grid_columnconfigure(1,weight=1)
        self.resizable(True,False)

    def OnPressEnter(self, event):
        inFile = self.inputentry.get()
        outFile = self.outputentry.get()
        try:
            convert(inFile, outFile)
            self.resultlabelVariable.set("Your file has been converted, %s was created successfully" % (outFile))
        except:
            self.resultlabelVariable.set(" %s not in the current directory." % (inFile))
            print "Please input a valid file"


    def OnPressConvert(self):
        inFile = self.inputentry.get()
        outFile = self.outputentry.get()
        try:
            convert(inFile, outFile)
            self.resultlabelVariable.set("Your file has been converted, %s was created successfully" % (outFile))
        except:
            self.resultlabelVariable.set(" %s not in the current directory." % (inFile))
            print "Please input a valid file"


if __name__ == "__main__":
    app = GUI_tk(None)
    app.title('Convert to HTML')
    app.mainloop()
