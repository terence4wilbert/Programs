//
//  main.cpp
//  Practice
//
//  Created by Terence Wilbert on 1/7/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
#include <sstream>
#include <cstdlib>
#define MY_FAV_NUMBER 22
using namespace std;



string money;

void printArray(int size)
{
    int game_array[size];
    cout << "Enter a array size: ";
    cin >> size;
    stringstream stm;
    for (int i = 0; i <= size-1; i++)
    {
        
        game_array[i] = size + i;
        cout << game_array[i] << "\n";
        cout << '\n';
        stm << "The item in the bag is: " << game_array[i] + 1 << endl;
    }
    cout << stm.str();
};

string getMoney()
{
    return money;
}
void setMoney(string amount)
{
    money = amount;
}

void displayArray(int array[], int size){
    cout << "{ ";
    for (int i = 0; i < size; i++){
        if (i != 0){
            cout << ", ";
        }
        cout << array[i];
    }
    cout << " } " << endl;
}



int main() {
    cout << "Practicing Good Ole C++" << endl;
    // insert code here...
    int current_array[8];
    int array[10];
    srand(static_cast<unsigned int>(time(NULL)));
    for (int i = 0;  i < 10; i++){
        array[i] = rand() % 100;
    }
    
    
    for (int i = 0; i <= 8; i++)
    {
        current_array[i] = i + 5;
        cout << current_array[i] << " ";
    }
    cout << '\n' << '\n' << '\n';
    string jav;
    int current_year;
    int numberin;
    cout << '\n';
    cout << "Enter your name: ";
    getline(cin,jav);
    cout << "Your name is: " << jav << endl;
    cout << '\n';
    cout << "Enter Year(XXXX): ";
    cin >> current_year;
    cout << "The current year is " << current_year << "!" << endl;
    cout << '\n';
    printArray(4);
    
    cout << "Please input a number: ";
    cin >> numberin;
    cout << "The number inputed is " << numberin << endl;
    cout << '\n';
    displayArray(array, 10);
    cout << '\n';
    cout << MY_FAV_NUMBER << endl;
    return 0;
}
