#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    long long int t, a, b,countMoves=0;
    cin>>t;
    while (t--)
    {
        cin>>a>>b;
        if (a%b==0)
        {
            cout<<"0"<<"\n";
        }
        else
        {
            countMoves=a%b;
            cout<<b-countMoves<<"\n";
        }
        
    }
    
    return 0;
}
