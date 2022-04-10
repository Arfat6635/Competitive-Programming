#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int n;
    cin >> n;
    long long int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }
    if (n == 1)
    {
        cout << "1"<< "\n";
        return 0;
    }

    int count = 1, maxcount = INT_MIN;
    for (int i = 0; i < n - 1; i++)
    {
        if (arr[i] <=arr[i + 1])
        {
            count++;
        }
        else
        {
            count = 1;
        }
        if (count > maxcount)
        {
            maxcount = count;
        }
    }
    cout << maxcount;
    return 0;
}
