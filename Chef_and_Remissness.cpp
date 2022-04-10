#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,a,b;
    cin>>t;
    while (t--)
    {   
        cin>>a>>b;
        cout<<((a>b)?a:b)<<" "<<(a+b)<<"\n";
    }
    
    return 0;
}