class Circle:
    pi = 3.14159

    def __init__(self, radius):
        self.radius = radius

    def area(self):
        return Circle.pi * self.radius * self.radius

Circle.pi
## 3.14159

c = Circle(10)
print("PI Constent ", c.pi)
## 3.14159
print(c.area())
## 314.159

