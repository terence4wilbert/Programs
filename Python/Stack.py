
class Node(object):
    def __init__(self, data, next=None):
        self.data = data
        self.next = next

class Stack(object):

    def __init__(self, head=None):
        self.head = head

    def push(self, data):
        self.head = Node(data, self.head)

    def pop(self):
        if self.is_empty():
            raise Exception("Stack is empty.")
        else:
            data = self.head.data
            self.head = self.head.next
            return data

    def peek(self):
        if self.is_empty():
            raise Exception("Stack is empty.")
        else:
            return self.head.data

    def is_empty(self):
        return self.head is None


class MyQueue(object):
    def __init__(self):
        self.enqueue_order = Stack()
        self.dequeue_order = Stack()
        self.is_in_enqueued_order = True

    # def enqueue(self, data):
    #     if not self