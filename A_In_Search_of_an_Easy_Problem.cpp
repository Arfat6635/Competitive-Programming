#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int n,sum=0;
    cin>>n;
    int ans[n];
    while (n--)
    {
        cin>>ans[n];
        sum+=ans[n];
       
    }
    cout<<((sum>0)?"HARD":"EASY")<<"\n";
    return 0;
}
