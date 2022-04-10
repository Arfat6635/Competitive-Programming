#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    string str;
    getline(cin,str);
    set<char> s;
    for (int i = 1; i < str.length() - 1; i++)
    {
        if (str[i] >= 97 && str[i] <= 122)
        {
            s.insert(str[i]);
        }
    }
    cout << s.size();
    return 0;
}
