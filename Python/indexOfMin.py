"""
Function that finds the index of the smallest item in list
"""

def indexOfMin(lyst):
    """Retrns the index of the minimum item."""

    minIndex = 0
    currentIndex = 1
    while currentIndex < len(lyst):
        if lyst[currentIndex] < lyst[minIndex]:
            minIndex = currentIndex
        currentIndex += 1
    return minIndex


print indexOfMin([12,13,14,15,6])
print indexOfMin([55, 97, 40, 67])