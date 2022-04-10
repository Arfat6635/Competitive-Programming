#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,N;
    cin>>t;
    while (t--)
    {
        cin>>N;
        cout<<((N<10)?"Thanks for helping Chef!":"-1")<<"\n";
    }
    
    return 0;
}