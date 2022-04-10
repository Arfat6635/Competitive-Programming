#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, n;
    cin >> t;
    while (t--)
    {

        cin >> n;
        int array[n];
        for (int i = 0; i < n; i++)
        {
            cin >> array[i];
        }

        for (int i = 0; i < n-1; i++)
        {
            int j=i+1;
            if (array[j]-array[i]==1)
            {
                if (array[j]<array[i])
                {
                    
                }
                
                
            }
            
        }
        

    }
    return 0;
}
