from Tkinter import *

class LabelDemo(Frame):

    def __init__(self):
        """Sets up the window and widgets"""
        Frame.__init__(self)
        self.master.title("Label Demo")
        self.grid()
        self._label = Label(self, text = "Hello Terence!")
        self._label.grid()

def main():
    """Instanitiate and pop up the window."""
    LabelDemo().mainloop()


if __name__ == '__main__':
    main()