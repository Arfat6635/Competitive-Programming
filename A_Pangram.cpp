#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    string str;
    cin >> t;
    cin >> str;
    set<char> s;

    for (int k = 0; k < t; k++)
    {
        if (str[k] >= 65 && str[k] <= 90)
        {
            str[k] += 32;
        }
    }

    for (int i = 0; i < t; i++)
    {
        s.insert(str[i]);
    }

    if (s.size() == 26)
    {
        cout << "YES";
    }
    else
    {
        cout << "NO";
    }

    return 0;
}
