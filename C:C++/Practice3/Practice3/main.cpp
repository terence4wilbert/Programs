//
//  main.cpp
//  Practice3
//
//  Created by Terence Wilbert on 1/6/17.
//  Copyright © 2017 Terence Wilbert. All rights reserved.
//

#include <iostream>
#include <sstream>


using namespace std;
// Base Class
class Employee {
    protected:
        string name;
        double pay;
    public:
        Employee() {
            name = "";
            pay = 0;
        }
        Employee(string empName, double payRate) {
            name =  empName;
            pay = payRate;
        }
        string getName(){
            return name;
        }
        void setName(string empName){
            name = empName;
        }
        double getPay(){
            return pay;
        }
        void setPay(double payRate){
            pay = payRate;
        }
        string toString(){
            stringstream stm;
            string salary;
            stm << name << ": " << pay;
            return stm.str();
        }
        double grossPay(int hours) {
            return pay * hours;
        }
    };


// derived class

class Manager : public Employee {
    private:
        bool salaried;
    
    public:
    
        Manager() : salaried(true) { }
        Manager(string name, double payRate, bool isSalaried)
            : Employee(name, payRate)
        {
            salaried = isSalaried;
        }
        bool getSalaried() {
            return salaried;
        }
        double grossPay(int hours){
            if (salaried){
                return pay;
            } else {
                return pay * hours;
            }
            
        }
        string toString(){
            stringstream stm;
            string salary;
            if (salaried){
                salary = "Salaried";
            } else {
                salary = "Hourly";
            }
            stm << name << ": " << pay
            << ": " << salary << endl;
            return stm.str();
        }
    };

int main() {
    Employee emp1("Jane Smith", 35000);
    Employee emp2("Bill Brown", 32000);
    Employee emp3("Marry Smith", 15.00);
    cout << "Employee name: " << emp3.getName() << endl;
    cout << "Employee pay rates: " << emp3.getPay() << endl;
    cout << "Employee gross pay: " << emp3.grossPay(40) << endl;
    Manager emp4("Bob Brown", 15000, true);
    cout << emp4.toString();
    Manager emp5("Terence Wilbert", 50000, false);
    cout << emp5.toString();
//    cout << "Employee name: " << emp4.getName() << endl;
//    cout << "Employee pay rates: " << emp4.getPay() << endl;
//    cout << "Emp4 Salaried? " << emp4.getSalaried() << endl;
//    cout << "Emp4 GrossPay: " << emp4.grossPay() << endl;
    cout << "\n";
    cout << emp1.toString() << endl;
    cout << emp2.toString() << endl;
    return 0;
}
