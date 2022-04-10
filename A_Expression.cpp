#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int a, b, c;
    cin >> a >> b >> c;
    int sum_one, sum_two, sum_three, sum_four, sum_five;
    sum_one = a + b * c;
    sum_two = a * (b + c);
    sum_three = a * b * c;
    sum_four = (a + b) * c;
    sum_five = a + b + c;

    if (sum_one > sum_two && sum_one > sum_three && sum_one > sum_four && sum_one > sum_five)
    {
        cout << sum_one;
    }
    else if (sum_two > sum_three && sum_two > sum_four && sum_two > sum_five)
    {
        cout << sum_two;
    }
    else if (sum_three > sum_four && sum_three > sum_five)
    {
        cout << sum_three;
    }
    else if (sum_four > sum_five)
    {
        cout << sum_four;
    }
    else
    {
        cout << sum_five;
    }

    return 0;
}
