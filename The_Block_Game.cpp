#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    string palindrome;
    cin >> t;
    bool flag = true;
    while (t--)
    {
        cin >> palindrome;
        for (int i = 0; i < palindrome.length() - 1; i++)
        {
            int j = palindrome.length() - i - 1;
            if (palindrome[i] != palindrome[j])
            {
                flag = false;
            }
            else if (i == j)
            {
                i++;
                j++;
            }
        }

        if (flag)
        {
            cout << "wins"
                 << "\n";
        }
        else
        {
            cout << "loses"
                 << "\n";
        }

        flag = true;
    }

    return 0;
}
