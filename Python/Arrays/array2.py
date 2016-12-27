# Arrays
from array3 import Array


#####################################################################################################################
# number of bytes used to store an object in python
import sys
data = []
n = 5
for k in range(n):
    a = len(data)
    b = sys.getsizeof(data)
    print('Length: {0:3d}; Size in bytes: {1:4d}'.format(a,b))
    data.append(None)

#####################################################################################################################
from time import time
def compute_average(n):
    """Peform n appends to an empty list and return average time elapsed."""
    data = []
    start = time()                                          # start time in secs
    for k in range(n):
        data.append(None)
    end = time()                                            # end time
    return (end - start) / n                                   # compute average time
#####################################################################################################################
def insert(self, k, value):
    """insert value at index k, shifting subsequent values rightward."""
    if self._n == self._capacity:                          # not enough room
        self._resize(2 * self._capacity)                   # double the capacity of the array
        for j in range(self._n, k, -1):                    # shift rightmost first
            self._A[j] = self._A[j - 1]
        self._A[k] = value                                 # store newest element
        self._n += 1
#####################################################################################################################
def remove(self, value):
    """Remove first occurance of value(or raise ValueError).."""
    # does not shrink
    for k in range(self._n):
        if self._A[k] == value:
            for j in range(k, self._n - 1):                     # shift others items to fill gap
                self._A[j] = self._A[j + 1]
            self._A[self._n - 1] = None                         # for garbage collection
            self._n -=1
            return
    raise ValueError('Value not found')                     # will reach if there is no match
#####################################################################################################################
logicalSize = N
if logicalSize == len(a):
    temp = Array(len(a) + 1)                                # create a new array
    for i in range(logicalSize):                            # copy the data from the old array
        temp[i] = a[i]                                      # array to the new array
    a = temp                                                # reset the old array variable to the new array
#####################################################################################################################
if logicalSize <= len(a) // 4 and len(a) >= DEFAULT_CAPACITY * 2:
    temp = Array(len(a) // 2)                               # Create new array
    for i in range(logicalSize):                            # Copy data from old array
        temp[i] = a[i]                                      # Reset old array variable to new array
    a = temp

