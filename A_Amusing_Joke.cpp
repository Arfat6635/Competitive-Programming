#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    string a, b, c, concat;
    cin >> a;
    cin >> b;
    cin >> c;
    concat = a + b;
    int len = concat.size();
    bool flag = false;
    sort(concat.begin(), concat.end());
    sort(c.begin(), c.end());

    if (c.length() == concat.length())
    {

  for (int i = 0; i < concat.length(); i++)
        {
            if (concat[i] != c[i])
            {
                flag = false;
                break;
            }
            else
            {
                flag=true;
            }

        }
    }

    if (flag)
    {
        cout << "YES";
    }
    else
    {
        cout << "NO";
    }

    return 0;
}
