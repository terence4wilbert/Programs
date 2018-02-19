class P:
    def __init__(self, x):
        self.__x = x

    def get_x(self):
        return self.__x

    # def set_x(self, value):
    #     self.__x = value

    def set_x(self, x):
        if x < 0:
            self.__x = 0
        elif x > 1000:
            self.__x = 1000
        else:
            self.__x = x


# pythonic class
class R:
    def __init__(self, x):
        self.x = x

# with properties
class S:
    def __init__(self, x):
        self.x = x

    @property
    def x(self):
        return self.__x

    @x.setter
    def x(self, x):
        if x < 0:
            self.__x = 0
        elif x > 1000:
            self.__x = 1000
        else:
            self.__x = x


