#include <iostream>
using namespace std;

struct Employee 
{
    short id;
    int age;
    double wage;
};

struct Point3d
{
    double x;
    double y;
    double z;
};

Point3d getZeroPoint()
{
    Point3d temp = {0.0, 0.0, 0.0};
    return temp;
}

void printInformation(Employee employee)
{
    cout << "ID:    " << employee.id << endl;
    cout << "AGE:   " << employee.age << endl;
    cout << "WAGE:  " << employee.wage << endl;
}

int main () 
{
    Employee joe = {14, 32, 24.15};
    Employee frank = {15, 28, 18.27};
    
    printInformation(joe);
    
    cout << '\n';
    printInformation(frank);
//    cout << "Test output one time" << endl;
    cout << '\n';
    
    Point3d zero = getZeroPoint();
    
    if (zero.x == 0.0 && zero.y == 0.0 && zero.z == 0.0)
        cout << "The point is zero\n";
    else
        cout << "The point is not zero\n";
    return 0;
}