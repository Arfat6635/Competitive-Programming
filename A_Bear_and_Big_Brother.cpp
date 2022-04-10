#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int limak=3,bob=2;
    int a,b;
    cin>>a>>b;
    int num=0;
    while (a<=b)
    {
        a=limak*a;
        b=bob*b;
        num+=1;
    }
    cout<<num;

    
    return 0;
}
