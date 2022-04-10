#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,a,b,c,sum=0;
    cin>>t;
    while (t--)
    {
        cin>>a>>b>>c;
        sum=a+b+c;
        cout<<((sum==180)?"YES":"NO")<<"\n";
    
    }
    
    return 0;
}
