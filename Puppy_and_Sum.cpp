#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, sum=0, d=0, n=0;
    cin>>t;
    while (t--)
    {
        cin>>d>>n;

        for (int i = 1; i <=d; i++) 
        {
            sum=0;
            for (int j = 1; j <=n; j++)
            {   
                
                sum+=j;
              
            }
            n=sum;
        }
        
        cout<<sum<<"\n";
        sum=0;
    }
    
    return 0;
}
