from array import array

def mergeSort(lyst):
    # lyst List to be sorted
    # CopyBuffer- Temporary space needed during merge
    copyBuffer = array(len(lyst))
    mergeSortHelper(lyst, copyBuffer, 0, len(lyst)-1)

def mergeSortHelper(lyst, copyBuffer, low, high):
    # lyst - list being sorted
    # copyBuffer- temp space needed during merge
    # low, high- bounds of sublist
    # middle - midpoint of sublist
    if low < high:
        middle = (low + high) // 2
        mergeSortHelper(lyst, copyBuffer, low, middle)
        mergeSortHelper(lyst, copyBuffer, middle + 1, high)
        merge(lyst, copyBuffer, low middle, high)
