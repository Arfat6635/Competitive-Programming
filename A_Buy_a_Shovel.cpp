#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int i=0, h=0, r=0, value=0;
    bool flag=true;
    cin>>h>>r;
    while (flag)
    {
       i++;
       value=h*i;
       if (value%10==0 || value%10==r)
       {
           flag=false;
       }
       
    }
    cout<<i;
    
    return 0;
}
