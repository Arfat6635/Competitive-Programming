#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    string a, b, sum;
    cin >> a;
    cin >> b;

    for (int i = 0; i < a.length(); i++)
    {
        if (a[i] == b[i])
        {
            sum += '0';
        }
        else
        {
            sum += '1';
        }
    }

    cout << sum;

    return 0;
}
