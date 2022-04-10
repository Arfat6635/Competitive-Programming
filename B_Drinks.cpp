#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int n,result=0;
    cin>>n;
    double x=0.0, sum=0.0;
    for (int i = 0; i <n; i++)
    {
        cin>>result;
        sum+=result;
    }
    x=sum/n;
    cout<<fixed<<setprecision(12)<<x<<endl;
    
    return 0;
}
