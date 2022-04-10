#include <bits/stdc++.h>
using namespace std;
 
int main()
{
    string s;
    bool istrue = true; // istrue variable is initialized with true at start cus to avoid space at start of the output

    cin>>s;
    for(int i=0;i<s.length();i++){
        if(s[i]=='W' && s[i+1]=='U' && s[i+2]=='B'){
            // if 'WUB' found in string replace it with space
            i+=2;
            if(!istrue){
                istrue=true; // to avoid multiple spaces.
                cout<<" ";
            }
            continue;
        }else{
            // else if no 'WUB' found then print the characters.
            istrue=false;
            cout<<s[i];
        }
    }
    return 0;
}
