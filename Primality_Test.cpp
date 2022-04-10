#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, prime = 0;
    cin >> t;
    while (t--)
    {
        cin >> prime;
        bool flag = 0;

        if (prime<=1)
        {  
            flag=1;
        }
        
        for (int i = 2; i <=prime/2; i++)
        {

            if (prime % i == 0)
            {
                flag = 1;
                break;
            }
        }

        if (flag==0)
        {
            cout<<"yes"<<"\n";
        }
        else{
            cout<<"no"<<"\n";
        }
        
    }

    return 0;
}
