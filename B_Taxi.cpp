#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    long long n;
    cin >> n;
    int arr[n];
    int sum = 0;
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
        sum += arr[i];
    }

    if (sum % 4 == 0)
    {
        cout << sum / 4;
    }
    else
    {
        cout << (sum / 4) + 1;
    }

    return 0;
}
