#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    int home[t], guest[t], count = 0;

    for (int i = 0; i < t; i++)
    {
        cin >> home[i] >> guest[i];
    }

    for (int i = 0; i < t; i++)
    {
        for (int j = 0; j < t; j++)
        {
            if (home[i] == guest[j])
            {
                count++;
            }
        }
    }
    cout<<count;
    count=0;
    return 0;
}
