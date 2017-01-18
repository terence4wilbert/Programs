//
//  main.cpp
//  FunctionPractice
//
//  Created by Terence Wilbert on 1/6/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
using namespace std;

int add (int x, int y) {
    return x + y;
    
}

int doStuff() {
    return 2 + 3;
}
int count_of_function_calls = 0;

void fun() {
    count_of_function_calls++;
}
int main() {
    int result = add(1, 2);             // call add and assign the result to a variable
    cout << "The result is: " << result << '\n';
    cout << "Adding 3 and 4 gives us: " << add(3, 4)<< endl;
    cout << '\n';
    fun();
    fun();
    fun();
    cout << "Function fun was called " << count_of_function_calls << "times";
}
