#-------------------------------------------------------------------------------
# Name:        Python Programming Lab 2
# Purpose       To Theif with the greatest possible profit: Crime Pays!!!$$$
# Author:       Terence Wilbert
# WTAMU ID#:    951203
# Created:     28/03/2013
# Licence:     <your licence>
#-------------------------------------------------------------------------------
#!/usr/bin/env python


def getList(n):         # basically making a list outside of everything that the data can be sorted before using
    jewels_list = []


    for line in n:
        line = line.strip().split(",")  # Taking apart the pieces
        Theif_tup = ((int(line[2])/float (line[1])), line [0], float(line[1]))  #Making them into a list(tuple)
        jewels_list.append(Theif_tup) # Putting them into the list as a tuple
    jewels_list.sort() # Sorting that list
    jewels_list.reverse() # Reversing the list as per instructions, in order to get "values" in a way we can have it ascending
    return jewels_list # Self explanatory


#-------------------------------------------------------------------- <== Haiduk (copy and paste)

def main():
    fileFound = False
    while not fileFound:
        fileName = 'jewels.txt'
        try:
            dataFile = open(fileName, "r")
            fileFound = True

        except:
            print ("Could not find that file -- try again")
#-----------------------------------------------------------------<== Haiduk (copy and paste)
    knapSackCapacity = 5
    knapSackCount = total_Price   = i = 0


    jewels_list = getList(dataFile) # pulling the list down into the main function from dataFile
    while knapSackCount < knapSackCapacity and i< len(jewels_list): # making a loop
        if jewels_list[i][2] <= (knapSackCapacity - knapSackCount): # Boolean If Statement
            total_Price += jewels_list[i][2]* jewels_list[i][0]     # Making the price calculations as each gem is added
            knapSackCount +=  jewels_list[i][2]                     # The Number of carats getting added to the bag
        i += 1


    Remaining = knapSackCapacity - knapSackCount






    print("===============================")
    print("Knap Sack Capacity ==>",knapSackCapacity)
    print("=========Theif's=Booty=========")
    print("Value Per Carat    ","Gem  ","Total Weight Available for Stealing")
    print(jewels_list[0])
    print(jewels_list[1])
    print(jewels_list[2])
    print(jewels_list[3])
    print(jewels_list[4])
    print(jewels_list[5])
    print(jewels_list[6])
    print(jewels_list[7])
    print(jewels_list[8])
    print("===========================================================")
    print("Total Value of Booty Taken $",total_Price)
    print("We could have put",Remaining, "more carats in the knapsack.")
    print("===========================================================")


# I understand that the print statements may be long, but I wanted it to look neat and pretty, and this process could be used for any set of gems

if __name__ == '__main__':
    main()
