class A:
    a = []

b = A()
c = A()
b.a.append('blah')

def something(a = []):
    a.append('blah')
    return a


class B:
    def __init__(self):
        self.a = []
        self.a.append('blah')

    def something(a = None):
        if a == None:
            a = []
        a.append('blah')

