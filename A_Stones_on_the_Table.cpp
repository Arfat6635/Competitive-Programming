#include <bits/stdc++.h>
using namespace std;
int main()
{
    int n;
    string stones;
    cin >> n;
    cin >> stones;
    char z = stones.at(0);
    int count = 0;

    for (int i = 1; i < stones.length(); i++)
    {
        if (z == stones[i])
        {
            count = count + 1;
        }
        z = stones[i];
    }

    cout << count;

    return 0;
}
