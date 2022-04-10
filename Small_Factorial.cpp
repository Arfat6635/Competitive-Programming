#include <iostream>
using namespace std;
int factorial(int number);
int main()
{
    int t;
    cin >> t;
    int result, input;
    for (int j = 0; j < t; j++)
    {
        cin >> input;
        result = factorial(input);
        cout << result << "\n";
    }
}

int factorial(int number)
{
    int i, fact = 1;
    for (i = 1; i <= number; i++)
    {
        fact = fact * i;
    }
    return fact;
}