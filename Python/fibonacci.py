# iterative
def fibi(n):
    a, b = 0, 1
    for i in range(0,n):
        a, b = b, a+b
    return a

#recursive
def fibr(n):
    if n == 0:
        return 0
    if n == 1:
        return 1
    return fibr(n-2) + fibr(n-1)


for i in range(10):
    print("Iterative  %s, Recursive %s" % (fibi(i), fibr(i)))