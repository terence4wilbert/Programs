class stack:
    def __init__(self):
        self.items = []

    def isEmpty(self):
        return self.items == []

    def push(self, item):
        self.items.insert(0, item)

    def pop(self):
        return self.items.pop(0)

    def peek(self):
        return self.items[0]

    def size(self):
        return len(self.items)

s = stack()
s.push("hello")
s.push("true")
print(s.pop())


print("\n")

q = stack()
print(q.isEmpty())
q.push(4)
q.push("dog")
print(q.peek())
q.push(True)
print(q.size())
print(q.isEmpty())
q.push(8.4)
print(q.pop())
print(q.pop())
print(q.size())