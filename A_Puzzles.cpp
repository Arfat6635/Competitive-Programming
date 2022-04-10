#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int students, puzzles, f[1000]; //initializing the variables
    cin >> students >> puzzles;
    for (int i = 0; i < puzzles; ++i)
    {
        cin >> f[i]; //Array of puzzle values
    }
    sort(f, f + puzzles); // sort the values of puzzles in ascending order
    int leastValue = f[students - 1] - f[0]; // Get Minimum value of smallest and largest   value from the array

    for (int i = 1; i <= puzzles - students; ++i)
    {
    
        if (f[i + students - 1] - f[i] < leastValue)
        {   
            leastValue = f[i + students - 1] - f[i];
        }
    }
    cout << leastValue << endl;
    return 0;
}