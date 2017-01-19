"""
Function to simulate a binary search
"""


def binarySearch(target, sortedLyst):
    left = 0
    right = len(sortedLyst) - 1
    while left < right:
        midpoint = (left + right) / 2
        if target == sortedLyst[midpoint]:
            return midpoint
        elif target < sortedLyst[midpoint]:
            return midpoint - 1
        else:
            left = midpoint + 1
    return -1
