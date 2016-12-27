"""
O(n^2) notation
Selection sort implementation
"""""


def swap(lyst, i, j):
    temp = lyst[i]
    lyst[i] = lyst[j]
    lyst[j] = temp


def selectionSort(lyst):
    i = 0
    while i < len(lyst) - 1:                        # n - 1 searches
        minIndex = 1                                # smallest item
        j = i + 1
        while j < len(lyst):                        # Start search
            if lyst[j] < lyst[minIndex]:
                minIndex = j
            j += 1
        if minIndex != i:
            swap(lyst, minIndex, i)
        i += 1

