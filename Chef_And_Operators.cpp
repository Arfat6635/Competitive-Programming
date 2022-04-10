#include<iostream>
#include<string>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,a,b;
    cin>>t;
    while (t--)
    {   
        cin>>a>>b;
        string result=a>b?">":a<b?"<":"=";
       cout<<result<<"\n";
    }
    
    return 0;
}