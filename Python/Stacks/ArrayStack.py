class Empty(Exception):
    pass


class ArrayStack:
    """LIFO Stack implementation using a Python list as underlying storage."""

    def __init__(self):
        """Create an empty stack."""
        self._data = []                                                 # nonpublic list instance

    def __len__(self):
        """Return the number of elements in the stack."""
        return len(self._data)

    def is_empty(self):
        """Returns True if stack is empty"""
        return len(self._data) == 0

    def push(self, e):
        """Add element e to the top of the stack."""
        self._data.append(e)                                            # new item stored at teh end of the list

    def top(self):
        """Returns the top element of the stack.

        Raise Empty exception if the stack is empty."""
        if self.is_empty():
            raise Empty('Stack is empty')
        return self._data[-1]                                          # -1 last item in the list

    def pop(self):
        """Remove and return the element from the top of the stack LIFO"""
        if self.is_empty():
            raise Empty('Stack is empty')
        return self._data.pop()                                        # remove last item from list