from collections import Counter

def check_permutation(str1, str2):
    if len(str1) != len(str2):
        return False
    counter = Counter()
    print(counter  )
    for c in str1:
        counter[c] += 1
    for c in str2:
        if counter[c] == 0:
            return False
        counter[c] -= 1
    print(counter)
    return True


print(check_permutation("hope", "epoh"))


def is_permuatation(str1, str2):
    counter = Counter()
    for letter in str1:
        counter[letter] +=1
    for letter in str2:
        if not letter in counter:
            return False
        counter[letter] -=1
        if counter[letter] == 0:
            del counter[letter]
    return len(counter) == 0


def is_perm(s1, s2):
    if len(s1) != len(s2):
        return False
    char_count = [0 for _ in range(256)]
    for c in s1:
        char_count[ord(c)] += 1
    for c in s2:
        char_count [ord(c)] -= 1
        if char_count[ord(c)] < 0:
            return False
    return True