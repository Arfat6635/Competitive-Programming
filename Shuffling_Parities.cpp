#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    long long int t;
    int max = 0, n, sum = 0, temp, x;
    cin >> t;
    while (t--)
    {
        cin >> n;
        long long int a[n];
        long long int b[n];
        for (int i = 0; i < n; i++)
        {
            cin >> a[i];
        }
        

        

        for (int l = 0; l <n; l++)
        {
            sum+=b[l];
        }
        
        cout << sum << "\n";
        sum = 0;
    }

    return 0;
}
