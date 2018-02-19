

def unique(String):
    if len(String) > 128:
        return False

    char_set = [False for _ in range(128)]
    print(char_set)
    for char in String:
        val = ord(char)
        if char_set[val]:
            print("False char set: " + char_set)
            return False
        char_set = True
    print(char_set)
    return True


# unique("awonderfulday")



def contains_no_duplicates(string):
    letters = {}
    for letter in string:
        if letter in letters:
            return False
        letters[letter] = True
        print(letters)
    return True


print(contains_no_duplicates("hipopmop"))