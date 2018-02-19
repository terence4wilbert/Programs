class Stack:
    def __init__(self):
        self.items = []
        self.currentMax = None

    def push(self, data):
        self.items.append(data)
        if self.currentMax:
            if data > self.currentMax:
                self.currentMax = data
        else:
            self.currentMax = data

    def pop(self):
        if not self.items:
            return self.items.pop()
        return None

    def peek(self):
        if not self.items:
            return self.items[-1]
        return None

    def getMax(self):
        return self.currentMax

    def __repr__(self):
        return str(self.items)

