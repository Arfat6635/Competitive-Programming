#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    string hate_end = "I hate it", love_end = "I love it", hate = "I hate that", love = "I love that", sum;
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        if (i == n)
        {
            if (i % 2 == 0)
            {
                sum += love_end + " ";
                break;
            }
            else
            {
                sum += hate_end + " ";
                break;
            }
        }
        if (i % 2 != 0)
        {
            sum += hate + " ";
        }
        else if (i % 2 == 0)
        {
            sum += love + " ";
        }
    }

    cout << sum;

    return 0;
}
