#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,x=0,oddnum=0,evenum=0,oddIndex=0,evenIndex=0;
    cin>>t;
    for (int j = 1; j <=t; j++)
    {
        cin>>x;
        if (x%2==0)
        {
            evenum+=1; 
            evenIndex=j;
        }
        
        else
        {
            oddnum+=1;
            oddIndex=j;
        }
    }
    cout<<(evenum>oddnum?oddIndex:evenIndex);
    
    return 0;
}
