#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    while (t--)
    {
        int b = 0;
        cin >> b;
        if (b == 1 || b == 2 || b == 3)
        {
            cout << "0"<<endl;
        }
        else
        {
            if (b % 2 == 0)
            {

                int area = 0.5 * b * b;
                int res = (area - b) / 4;
                cout << res << endl;
            }
            else
            {
                b -= 1;
                int area = 0.5 * b * b;
                int res = (area - b) / 4;
                cout << res << endl;
            }
        }
    }

    return 0;
}
