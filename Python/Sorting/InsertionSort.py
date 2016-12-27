

def insertionSort(lyst):
    i = 1
    while i < len(lyst):
        itemTOInsert = lyst[i]
        j = i - 1
        while j >= 0:
            if itemTOInsert < lyst[j]:
                lyst[j + 1] = lyst[j]
                j -=1
            else:
                break
        lyst[j + 1] = itemTOInsert
        i +=1
