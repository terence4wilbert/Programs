

def binary_search(target, sorted_list):
    left = 0
    right = len(sorted_list) - 1
    while left <= right:
        midpoint = (left + right) //2
        if target == sorted_list[midpoint]:
            return midpoint
        elif target < sorted_list[midpoint]:
            right = midpoint -1
        else:
            left = midpoint + 1
    return -1

