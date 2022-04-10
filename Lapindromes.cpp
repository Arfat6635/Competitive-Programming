#include <iostream>

using namespace std;
int main()
{
    int t;
    cin >> t;
    while (t--)
    {
        string s;
        cin >> s;
        int k = s.length();
        int alphabet[26] = {0};
        int lol = 0;

        for (int i = 0; i < k; i++)
        {
            if (i < k / 2)
            {
                alphabet[s[i] - 'a']++;
            }

            else if (i >= ((k + 1) / 2))
            {
                alphabet[s[i] - 'a']--;
            }
        }
        for (int i = 0; i < 26; i++)
        {
            if (alphabet[i] != 0)
            {
                lol = 1;
            }
        }

        if (lol == 1)
        {
            cout << "NO"<<endl;
        }
        else
        {
            cout << "YES"<<endl;
        }
    }

    return 0;
}