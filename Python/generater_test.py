

def gensquares(N):
    for i in range(N):
        yield i ** 2

def gensquares2(N):
    for i in range(N):
        return i ** 2



#
# gensquares2(10)
# print(gensquares(10))

# for i in gensquares(10):
#     print(i, end=' : ')

print(gensquares2(10))
# for i in gensquares2(10):
#     print(i, end=' : ')