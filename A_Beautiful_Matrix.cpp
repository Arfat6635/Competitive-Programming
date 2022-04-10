#include <bits/stdc++.h>
using namespace std;
int main()
{

    int a[6][6];
    int r, c;

    for (int i = 1; i < 6; i++)
    {
        for (int j = 1; j < 6; j++)
        {
            scanf("%d", &a[i][j]);
            if (a[i][j] == 1)
            {
                r = abs(3 - i);
                c = abs(3 - j);
                cout << r + c;
            }
        }
    }

    return 0;
}
