def find_string(a,x):
    if a is None or x is None or x == '':
        return None
    return _find_string(a, x, 0,len(a)-1)

def get_mid(a, lo, hi):
    mid = lo + (hi - lo) // 2
    if a[mid] != '':
        return mid
    mid_l = mid - 1
    mid_r = mid + 1
    while a[mid_l] == '' and a[mid_r] == '':
        if mid_l < lo or mid_r > hi:
            return None
        mid_l -= 1
        mid_r += 1
    if a[mid_l] == '':
        return mid_r
    else:
        return mid_l

def _find_string(a,x,lo,hi):
    if lo <= hi:
        mid = get_mid(a,lo,hi)
        if mid is None:
            return None
        if x < a[mid]:
            return _find_string(a,x,lo,mid-1)
        elif x > a[mid]:
            return _find_string(a,x,mid+1,hi)
        else:
            return mid
    return None
