#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int withdraw=0,count=0;
        cin>>withdraw;
        while (withdraw>0)
        {
            if (withdraw>=100)
            {
                withdraw-=100;
                count++;
            }
           else if (withdraw>=20)
            {
                withdraw-=20;
                count++;
            }
          else if (withdraw>=10)
            {
                withdraw-=10;
                count++;
            }
        else if (withdraw>=5)
            {
                withdraw-=5;
                count++;
            }
           else if (withdraw>=1)
            {
                withdraw-=1;
                count++;
            } 
        }
        cout<<count<<"\n";
        count=0;
    
    return 0;
}
