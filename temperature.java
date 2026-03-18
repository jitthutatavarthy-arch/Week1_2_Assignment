#include <iostream>
using namespace std;

int main() {
    float celsius, fahrenheitResult;

    cout << "Enter temperature in Celsius: ";
    cin >> celsius;

    fahrenheitResult = (celsius * 9/5) + 32;

    cout << "The " << celsius << " Celsius is " << fahrenheitResult << " Fahrenheit";

    return 0;
}