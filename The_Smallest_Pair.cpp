#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;

    while (t--)
    {   
        int n=0 , temp = 0;
        cin >> n;
        int array[n];
        for (int i = 0; i < n; i++)
        {
            cin >> array[i];
        }
        for (int j = 0; j < (n - 1); ++j)
        {
            for (int i = 0; i < n - (j - 1); ++i)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }

        cout<<array[0]+array[1];
    }

    return 0;
}
