#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, n, a, b, zero = 0, one = 0;
    string forms;
    cin >> t;
    while (t--)
    {
        cin >> n >> a >> b;
        cin >> forms;
        for (int i = 0; i < forms.length(); i++)
        {
            if (forms[i] == '0')
            {
                zero++;
            }
            else
            {
                one++;
            }
        }
        cout << (zero * a) + (one * b) << "\n";
        zero = 0;
        one = 0;
    }

    return 0;
}
