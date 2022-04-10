#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t,price=0,count=0;
    cin>>t;
    while (t--)
    {
        cin>>price;
        while (price>0)
        {
            if (price>=100)
            {
                price-=100;
                count++;
            }
           else if (price>=50)
            {
                price-=50;
                count++;
            }
          else if (price>=10)
            {
                price-=10;
                count++;
            }
        else if (price>=5)
            {
                price-=5;
                count++;
            }
           else if (price>=2)
            {
                price-=2;
                count++;
            } 
           else if (price>=1)
            {
                price-=1;
                count++;
            } 
        }
        cout<<count<<"\n";
        count=0;
    }
    
    return 0;
}
