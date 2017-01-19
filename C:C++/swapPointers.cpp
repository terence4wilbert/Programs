#include <iostream>
using namespace std;

void swap1(int left, int right)
{
    int temp;
    temp = left;
    left = right;
    right = temp;
}

void swap2(int *p_left,int *p_right)
{
    int temp = *p_left;
    *p_left = *p_right;
    *p_right = temp;
}

void swap3(int& left, int& right)
{
    int temp = right;
    right = left;
    left = temp;
}

int main() 
{
    int x =1, y = 2;
    cout << "Before Swap: " << x << " " << y << endl;
    swap1(x,y);
    cout <<"Swap1 " << x<< " " << y<< endl;
    swap2(&x, &y);
    cout <<"Swap2 " << x << " " << y << endl;
}