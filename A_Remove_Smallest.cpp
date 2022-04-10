#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, temp = 0;
    cin >> t;
    while (t--)
    {
        int n = 0;
        cin >> n;
        bool flag = true;
        int array[n], temp = 0;
        /*array input*/
        for (int i = 0; i < n; i++)
        {
            cin >> array[i];
        }

        /*sort array by descending order*/

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (array[j + 1] > array[j])
                {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        /* check the diff*/
        
        for (int i = 1; i < n; i++)
        {
            if ((array[i - 1] - array[i]) > 1)
            {
                flag = false;
                break;
            }
        }

        (flag) ? cout << "YES"
                      << "\n"
               : cout << "NO"
                      << "\n";
    }
    return 0;
}
