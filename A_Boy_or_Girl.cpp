#include <bits/stdc++.h>
using namespace std;
int main()
{
    string name;
    cin >> name;
    int num = 0;
    set<char> name_set;
    for (auto i : name)
        name_set.insert(i);
    num = name_set.size();

    if (num % 2 == 0)
    {
        cout << "CHAT WITH HER!";
    }
    else
    {
        cout << "IGNORE HIM!";
    }
    return 0;
}