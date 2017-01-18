//
//  main.cpp
//  Practice4
//
//  Created by Terence Wilbert on 1/7/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
#include <cstdlib>
#include <ctime>

using namespace std;

int randRange(int low, int high)
{
    // we begin a random number, get it to be between 0 and the difference
    // between high and low, then add the lowest possible value
    return rand() % (high - low) + low;
}

int main()
{
    //call just once, at the very start
//    srand(static_cast<unsigned int>(time(NULL)));
    cout << rand() << '\n';
    for (int i = 0; i < 1000; ++i)
    {
        cout << randRange(10, 20) << '\n';
    }
    
    int srand_seed = static_cast<unsigned int>(time(NULL));
//    cout << seed << '\n';
    srand( srand_seed );
}
