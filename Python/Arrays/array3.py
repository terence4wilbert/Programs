"""
File: array3.py

An Array is like a list but the client can use only []]
le, ier, and str.

to instantiate, use
<variable> = Array(<capacity>, <optional fill value>)
The fill value is None by default.

Data structure - Arrays practice
"""


class Array(object):
    """Represents and array."""
    def __init__(self, capacity, fillValue=None):
        """Capacity is the static size of the array.
        fillValue is placed at each position."""
        self._items = list()
        for count in range(capacity):
            self._items.append(fillValue)

    def __len__(self):
        """-> The capacity of the array."""
        return len(self._items)

    def __str__(self):
        """-> The string representation of the array."""
        return str(self._items)

    def __iter__(self):
        """Supports traversal with a for l9op."""
        return iter(self._items)

    def __getitem__(self, index):
        """Subscript operator for access at index."""
        return self._items[index]

    def __setitem__(self, index, newItem):
        """Subscript operator for replacement at index."""
        self._items[index] = newItem

if __name__ == '__main__':
    Array()

