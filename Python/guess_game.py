"""
Author: Terence Wilbert
Objective: a guessing game from the user
"""

import random

def main():
    """Inputs the bounds of the range of numbers
    and lets the user guess the computer's number
    until the guess is correct."""
    smaller = int(raw_input("Enter the smaller number: "))
    larger = int(raw_input("Enter the larger number: "))
    myNumber = random.randint(smaller, larger)
    count = 0
    while True:
        count +=1
        userNumber = int(raw_input("Enter your guess: "))
        if userNumber < myNumber:
            print("Too Small")
        elif userNumber > myNumber:
            print("Too Large")
        else:
            print "You've got it in %d tries" % count
            break

if __name__ =="__main__":
    main()
