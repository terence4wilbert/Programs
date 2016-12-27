"""
Bubble sort O(n^2) average case notation
"""

def swap(lyst, i, j):
    temp = lyst[i]
    lyst[i] = lyst[j]
    lyst[j] = temp


def bubbleSort(lyst):
    n = len(lyst)
    while n > 1:
        i = 1
        while i < n:
            if lyst[i] < lyst[i - 1]:
                swap(lyst, i, i-1)
            i += 1
        n -= 1

def bubbleSortBesCase(lyst):
    n = len(lyst)
    while n > 1:
        swapped = False                         # Boolean Flag
        i = 1
        while i < n:
            if lyst[i] < lyst[i - 1]:           # exchange values if needed
                swap(lyst, i, i-1)
                swapped = True
            i += 1
        if not swapped:                         # return if no swaps
            return
        n -= 1