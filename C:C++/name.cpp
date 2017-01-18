//
//  name.cpp
//  practice2
//
//  Created by Terence Wilbert on 1/2/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include "name.hpp"

#include <iostream>
#include <string>

using namespace std;

int main() {
    string user_firstname;
    string user_lastname;
    
    cout << "Please enter firstname: ";
    cin >> user_firstname;
    cout << "Please enter lastname: ";
    cin >> user_lastname;
    string user_fullname = user_firstname + user_lastname;
    cout << "Your fullname is: " << user_fullname << endl;

}
