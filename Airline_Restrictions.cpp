#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, a, b, c, d, e;
    cin >> t;
    while (t--)
    {
        cin >> a >> b >> c >> d >> e;
        if (a <= e && b+c <= d)
        {
            cout << "YES"<< "\n";
        }
        else if (b <= e && a+c <= d)
        {
            cout << "YES"<< "\n";
        }
        else if (c <= e && a+b <= d)
        {
            cout << "YES"<< "\n";
        }
        else
        {
            cout << "NO"<< "\n";
        }
    }

    return 0;
}
