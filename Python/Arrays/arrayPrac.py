def array_test():
    ar = [3, 2, 4, 5]

    ar.pop()

    ar.append(6)

    print ar
    print("Index of 4:", ar.index(4))       # index of given value

    ar.remove(4)                            # remove item with given value
    print 'Removed 4: ', ar

    ar.reverse()
    print "Reversed the array: ", ar
    print "Reversed Soreted return: ", sorted(ar)

    ar.sort()
    print "Sorted in place: ", ar

    ar.append(12)
    print "WE appended 12: ", ar

    print "__sizeof__ returns", ar.__sizeof__()


def main():
    array_test()


if __name__ == "__main__":
    main()

