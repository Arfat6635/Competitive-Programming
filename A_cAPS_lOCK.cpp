#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    string word;
    cin >> word;
    bool istrue = true;


    //This block of code will check this type of test cases "Afsdfsdf" and "cGFcGH"
    for (int i = 1; i < word.length(); i++)
    {
        if (word[i] >= 97)
        {
            istrue = false;
            break;
        }
    }

    //if above test cases aren't true then this block of code will be executed 
    // "KJGKAJ" and "aJHKF"
    if (istrue)
    {
        for (int i = 0; i < word.length(); i++)
        {
            if (word[i] >= 97)
            {
                word[i] -= 32;
            }
            else
            {
                word[i] += 32;
            }
        }
        cout << word;
    }
    else
    {
        cout << word;
    }

    return 0;
}
