#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int n,p,q,input;
    set<int>s;
    cin>>n;
    cin>>p;
    while (p--)
    {
        cin>>input;
        s.insert(input);
    }
    cin>>q;
    while (q--)
    {
        cin>>input;
        s.insert(input);
    }
    
    int len=s.size();

    if (len==n)
    {
        cout<<"I become the guy.";
    }
    else
    {
        cout<<"Oh, my keyboard!";
    }
    
    
    return 0;
}
