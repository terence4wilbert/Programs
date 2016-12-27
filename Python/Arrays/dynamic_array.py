import ctypes

class DynamicArray:
    """A dynamic array class"""

    def __init__(self):
        """Create an empty array."""
        self._n = 0                                                    # count actual elements
        self.capacity = 1                                              # default array capacity
        self._A = self._make_array(self._capacity)                     # low level array

    def __len__(self):
        """Return number of elements stored in the array."""
        return self._n

    def getitem(self, k):
        """Return element at index k"""
        if not 0 <= k< self._n:
            raise IndexError('invalid index')
        return self._A[k]                                              # retrieve from array

    def append(self, obj):
        """Add object to end of the array."""
        if self._n == self._capacity:
            self._resize(2 * self._capacity)                            # double capcaity
        self._a[self._n] = obj
        self._n += 1

    def _resize(self, c):                                              # Nonpunblic utility
        """Resize internal array to capacity c."""
        B = self._make_array(c)
        for k in range(self._n):
            B[k] = self._A
        self._A = B
        self.capacity = c

    def _make_aray(self, c):                                           # Nonpublic utility
        """Return new array with capactiy c."""
        return (c * ctypes.pyobject)()