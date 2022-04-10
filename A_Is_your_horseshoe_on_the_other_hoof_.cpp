#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int s1, s2, s3, s4, x;
    set<int> s;
    cin >> s1 >> s2 >> s3 >> s4;
    s.insert(s1);
    s.insert(s2);
    s.insert(s3);
    s.insert(s4);
    x = s.size();

    if (x == 1)
    {
        cout << 3;
    }
    else if (x == 2)
    {
        cout << 2;
    }
    else if (x == 3)
    {
        cout << 1;
    }
    else
    {
        cout << 0;
    }

    return 0;
}
