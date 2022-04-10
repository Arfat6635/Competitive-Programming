#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int count=0,t,price=0;
    cin>>t;
    while (t--)
    {
        cin>>price;
        while (price>0)
        {
            if (price>=2048)
            {
                price-=2048;
                count++;
            }
            else if (price>=1028)
            {
                price-=1024;
                count++;
            }
            else if (price>=512)
            {
                price-=512;
                count++;
            }
            else if (price>=256)
            {
                price-=256;
                count++;
            }
            else if (price>=128)
            {
                price-=128;
                count++;
            }
            else if (price>=64)
            {
                price-=64;
                count++;
            }
            else if (price>=32)
            {
                price-=32;
                count++;
            }
            else if (price>=16)
            {
                price-=16;
                count++;
            }
            else if (price>=8)
            {
                price-=8;
                count++;
            }
            else if (price>=4)
            {
                price-=4;
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



