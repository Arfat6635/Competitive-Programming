#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int k,n,w;
    cin>>k>>n>>w;
    int total_cost=0, borrow;
    for (auto i = 1; i <=w; i++)
    {
        total_cost+=i*k;
    }

    borrow=total_cost-n;
    if (borrow<0){
        cout<<"0";
    }
    else{
        cout<<borrow;
    }
    return 0;
}
