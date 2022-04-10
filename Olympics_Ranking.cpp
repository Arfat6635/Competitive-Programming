#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    int firstCountry = 0, secondCountry = 0;
    int G1, S1, B1, G2, S2, B2;

    while (t--)
    {
        cin >> G1 >> S1 >> B1 >> G2 >> S2 >> B2;
        firstCountry = G1 + S1 + B1;
        secondCountry = G2 + S2 + B2;
        //find which country has the higher rank
        cout << ((firstCountry > secondCountry) ? "1" : "2") << "\n";
    }

    return 0;
}
