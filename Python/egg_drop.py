


def egg_drop(n, k):
    if k ==0:
        return(None, None)
    if k == 1:
        return(1, float(n+1)/2.0)