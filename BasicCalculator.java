#include <iostream>
using namespace std;

int main() {
    float number1, number2;
    float add, sub, mul, div;

    cout << "Enter two numbers: ";
    cin >> number1 >> number2;

    add = number1 + number2;
    sub = number1 - number2;
    mul = number1 * number2;
    div = number1 / number2;

    cout << "Addition = " << add << endl;
    cout << "Subtraction = " << sub << endl;
    cout << "Multiplication = " << mul << endl;
    cout << "Division = " << div << endl;

    return 0;
}