#include <iostream>
using namespace std;

int main() {
    float base, height;
    float area_cm, area_in;

    cout << "Enter base and height in cm: ";
    cin >> base >> height;

    area_cm = 0.5 * base * height;
    area_in = area_cm / (2.54 * 2.54);

    cout << "Area in square cm = " << area_cm << endl;
    cout << "Area in square inches = " << area_in << endl;

    return 0;
}