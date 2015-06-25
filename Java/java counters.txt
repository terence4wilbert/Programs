'''
A class that tests functionality of the Counter class

@author: Terence Wilbert
@version: 3.0
'''
from Counter import Counter
from CounterException import CounterException
def testConstructor():  
    '''
    a function to test Counter constructor
    '''
    print("TESTING THE CONSTRUCTOR")
    print("Trying min < max")
    
    try:
        c1 = Counter(10,11)
        print("    Passes")
    except CounterException:
        print("*** Fails: Exception thrown")
    #end try/except
    
    print("Trying min = max")
    try:
        c1 = Counter(10,10)
        print("*** Fails: Exception not thrown")
    except CounterException:
        print("    Passes")
    #end try/except
    
    print("Trying min > max")
    try:
        c1 = Counter(11,10)
        print("**** Fails: Exception not thrown")
    except CounterException:
        print("    Passes")
    #end try/except  
#end testConstructor

def testToString():
    print()
    print()
    print()
    print("TESTING the toString method")
    c1 = Counter(1, 9)
    print("Displaying the counter using toString:")
    print(c1)
    print("The counter should have the value 1")
    print("    the minimum should be 1, the maximum should be 9")
    print("    it should not have rolled over")
#end testToString
        
def testEquals():
    c1 = Counter(10, 20)
    c2 = Counter(10, 20) 
    c3 = Counter(11, 20) 
    c4 = Counter(10, 21) 
    print() 
    print() 
    print("TESTING the equals method") 
    print("trying two counters that should be in the same state") 
    if c1 == c2:
        print("     passes") 
    else:
        print("**** fails") 

    print("trying two counters that should be in a different state") 
    if c1 == c3:
        print("**** fails") 
    else:
        print("     passes") 

    print("trying two counters that should be in a different state") 
    if c1 == c4:
        print("**** fails") 
    else:
        print("     passes") 
#end testEquals

def testIncrease():
        c1 = Counter(10, 11)
        c2 = Counter(-1, 1)
        c3 = Counter(-10, 30)
        print()
        print()
        print("TESTING the increase method")
        print("Increasing counter 1 once")
        c1.increase()
        if not (c1.valueOf() == 11):
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        
        if ( c1.rolledOver() ):
            print("**** fails - should not roll over")
        else:
            print("     passes")
        

        print("Increasing counter 1 again")
        c1.increase()
        if c1.valueOf() != 10:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        

        if c1.rolledOver() == False:
            print("**** fails - should roll over")
        else:
            print("     passes")
        

        print("Increasing counter 1 a third time")
        c1.increase()
        if c1.valueOf() != 11:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        

        if c1.rolledOver():
            print("**** fails - should not roll over")
        else:
            print("     passes")
        

        print("Increasing counter 2 until it rolls over")
        count = 0
        while c2.rolledOver() == False:
            c2.increase()
            count +=1
        

        if c2.valueOf() != -1:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        

        if count != 3:
            print("**** fails - wrong number of increases count was "  + count)
        else:
            print("     passes")
        

        print("Increasing counter 3 until it rolls over")
        count = 0
        while not c3.rolledOver():
            c3.increase()
            count +=1
        

        if c3.valueOf() != -10:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        

        if count != 41:
            print("**** fails - wrong number of increases count was " + count)
        else:
            print("     passes")
        
def testdecrease():
    c1 = counter(10,11)
    c2 = counter(-1,1)
    c3 = counter(-10,30)
    print()
    print()
    print("TESTING the decrease method")
    print("Decreasing the counter once")
    c1.decrease
    if not (c1.valueOf() == 11):
         print("**** fails - bad valueOf")
        else:
            print("     passes")
            
     if ( c1.rolledOver() ):
            print("**** fails - should not roll over")
        else:
            print("     passes")
            
     print("Decreasing the counter again")
        c1.decrease()
        if c1.valueOf() != 10:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
            
        
        if c1.rolledOver() == False:
            print("**** fails - should roll over")
        else:
            print("     passes")
        

        print("Decreasing the counter a third time")
        c1.decrease()
        if c1.valueOf() != 11:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
    
        if not c1.rolledOver():
            print("**** fails - should not roll over")
        else:
            print("     passes")
    
        print("Decrease counter 2 twice, then decrease counter 2 until it rolls over again")
        count = 0
        c2.decrease()
        c2.decrease()
        while c2.rolledOver() == False:
            c2.decrease()
            count +=1
        

        if c2.valueOf() != 1:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
            
        if count != 2:
            print("**** fails - wrong number of decrease count was "  + count)
        else:
            print("     passes")
        

        print("Decrease counter 3 twice, then decrease counter 3 until it rolls over again")
        count = 0
        c3.decrease()
        c3.decrease()
        while not c3.rolledOver():
            c3.decrease()
            count +=1
        

        if c3.valueOf() != 30:
            print("**** fails - bad valueOf")
        else:
            print("     passes")
        

        if count != 40:
            print("**** fails - wrong number of increases count was " + count)
        else:
            print("     passes")
        
        
        
def testCombined():
    c1 = counter(10,20)
    c2 = counter(10,20)
    c3 = counter(10,20)
    print()
    print()
    print("TESTING combinations of the increase and decrease methods")
    print("Increasing counter 2 once")
    c2.increase
    if not (c1.equals(c2)):
         print("**** fails - bad state")
        else:
            print("     passes")
            
     print("Decreasing counter 2 once")
        c2.decrease()
        if c1.equals(c2):
            print("**** fails - should be back in the initial statef")
        else:
            print("     passes")

        print("Decreasing then increasing counter 3")
        c3.decrease()
        c3.decrease()
        if c1.equals(c3):
            print("**** fails - state should differ in rollover")
        else:
            print("     passes")
    
      
        
    
        

    
if __name__ == '__main__':
    testConstructor()
    testToString()
    testEquals()
    testIncrease()