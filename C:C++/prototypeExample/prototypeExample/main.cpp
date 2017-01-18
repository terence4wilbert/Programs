//
//  main.cpp
//  prototypeExample
//
//  Created by Terence Wilbert on 1/6/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
using namespace std;

// function prototype for add
int add(int x, int y);

int main()
{
    int result = add(1, 2);
    cout << "The result is: " << result << '\n';
    cout << "Adding 3 and 4 gives us: " << add(3,4);
}

int add(int x, int y)
{
    return x + y;
}
