class MyClass:
    limit = 10

    def __init__(self):
        self.data = []
    def item(self, i):
        return self.data[i]
    def add(self, e):
        if len(self.data) >= self.limits:
            raise Exception("Too many elements")
        self.data.append(e)

print(MyClass.limit)