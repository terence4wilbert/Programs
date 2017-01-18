//
//  main.cpp
//  practice2
//
//  Created by Terence Wilbert on 1/2/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
using namespace std;


int main() {
    int firstargument;
    int secondargument;
    cout << "Enter a first arguement: ";
    cin >> firstargument;
    cout << "Enter a second arguement: ";
    cin >> secondargument;
    cout << firstargument << " * " << secondargument << " = " << firstargument * secondargument << endl;
    cout << firstargument << " + " << secondargument << " = " << firstargument + secondargument << endl;
    cout << firstargument << " / " << secondargument << " = " << firstargument / secondargument << endl;
    cout << firstargument << " - " << secondargument << " = " << firstargument - secondargument << endl;
    
    int x = 5;
    if (x < 3){
        cout << "x is less\n";
    } else {
        cout << "x is greater\n";
    }
}
