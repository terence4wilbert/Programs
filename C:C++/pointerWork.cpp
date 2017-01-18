#include <iostream>
using namespace std;

void array_pointer(){
    float arr[5];
    float *ptr;
    
    cout << "Displaying address using arrays: " << endl;
    for (int i = 0; i < 5; ++i)
    {
        cout << "&arr[" << i << "] = " << &arr[i] << endl;
    }
    
    ptr = arr;
    
    cout << "\nDisplaying address using pointers: " << endl;
    for (int i = 0; i < 5; ++i)
    {
        cout << "ptr + " << i << " = " << ptr + i << endl;
    }
}


void array_pointer2()
{
    float arr[5];
    
    cout << "Display addres using pointers notation: " << endl;
    for (int i = 0; i < 5; ++i) 
    {
        cout << arr + 1 << endl;
    }
}
int main() 
{
    int *pc, c;
    int var1 = 24;
    int var2 = 103;
    int var3 = 3;
    int var4 = 12;
    int var5 = 55;
    int var6 = 78;
    int var7 = 1;
    int var8 = 44;
    cout << &var1 << endl;
    cout << &var2 << endl;
    cout << &var3 << endl;
    cout << &var4 << endl;
    cout << &var5 << endl;
    cout << &var6 << endl;
    cout << &var7 << endl;
    cout << &var8 << endl;
    cout << '\n';
    int var9 = 55;
    cout << var9 << endl;
    cout << "&(var9)" << &var9 << endl << endl;
    int *var10 = &var9;
    cout << "var10: " << var10 << endl << endl;
    cout << "Pointer output (*var10) = " << *var10 << endl;
    cout << endl;
    array_pointer();
    array_pointer2();
}