#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    vector<char> v = {'a', 'e', 'i', 'o', 'u', 'y'};
    string word;
    cin >> word;
    transform(word.begin(), word.end(), word.begin(), ::tolower);
    for (auto i = 0; i < word.length(); i++)
    {
        for (auto j = 0; j < v.size(); j++)
        {
            if (word[i] == v[j])
            {
                word.erase(i, 1);
            }
        }
    }
    for (auto w : word)
    {
        cout << "." << w;
    }

    return 0;
}
