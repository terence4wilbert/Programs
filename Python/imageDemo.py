from Tkinter import *


class ImageDemo(Frame):

    def __init__(self):
        """Sets up the window and widgets."""
        Frame.__init__(self)
        self.master.title("Image Demo")
        self.grid()
        self._image = PhotoImage(file = 'nike.gif')
        self._imageLabel = Label(self, image = self._image)
        self._imageLabel.grid()
        self._textLabel = Label(self, text = 'Just Do It!')
        self._textLabel.grid()


def main():
    """Instanitiate and pop up the window."""
    ImageDemo().mainloop()


if __name__ == '__main__':
    main()