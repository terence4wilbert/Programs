"""
function to show a sequential Search
"""


def sequentialSearch(target, lyst):
    """Returns the position of the target item found,
    or -1 otherwise."""

    position = 0
    while position < len(lyst):
        if target == lyst[position]:
            return position + 1
        position += 1
    return -1

print "The position item was found: %d " % sequentialSearch(12, [33, 44, 12, 23, 21, 11])
