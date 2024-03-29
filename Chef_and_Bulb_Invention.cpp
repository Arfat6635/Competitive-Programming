/*
Chef is trying to invent the light bulb that can run at room temperature without electricity. So he has N gases numbered from 0 to N−1 that he can use and he doesn't know which one of the N gases will work but we do know it.

Now Chef has worked on multiple search algorithms to optimize search. For this project, he uses a modulo-based search algorithm that he invented himself. So first he chooses an integer K and selects all indices i in increasing order such that imodK=0 and test the gases on such indices, then all indices i in increasing order such that imodK=1, and test the gases on such indices, and so on.

Given N, the index of the gas p that will work, and K, find after how much time will he be able to give Chefland a new invention assuming that testing 1 gas takes 1 day.

For example, consider N=5,p=2 and K=3.

On the 1st day, Chef tests gas numbered 0 because 0mod3=0.
On the 2nd day, Chef tests gas numbered 3 because 3mod3=0.
On the 3rd day, Chef tests gas numbered 1 because 1mod3=1.
On the 4th day, Chef tests gas numbered 4 because 4mod3=1.
On the 5th day, Chef tests gas numbered 2 because 2mod3=2.
So after 5 days, Chef will be able to give Chefland a new invention


Input Format
The first line of the input contains a single integer T denoting the number of test cases. The description of T test cases follows.
The first and only line of each test case contains three space-separated integers N, p, and K.


Output Format
For each test case, print a single line containing one integer — after how much time Chef will be able to give Chefland a new invention assuming that testing 1 gas takes 1 day.


Sample Input:

4
10 5 5
10 6 5
10 4 5
10 8 5


Sample Output:

2
4
9
8


Explanation
Test case 1: On the day 1 Chef will test gas numbered 0 and on the day 2 Chef will test gas numbered 5.

Test case 2: On the day 1 Chef will test gas numbered 0, on the day 2 Chef will test gas numbered 5, on the day 3 Chef will test gas numbered 1, and on the day 4 Chef will test gas numbered 6.

Test case 3: On the day 1 Chef will test gas numbered 0, on the day 2 Chef will test gas numbered 5, on the day 3 Chef will test gas numbered 1, on the day 4 Chef will test gas numbered 6, on the day 5 Chef will test gas numbered 2, on the day 6 Chef will test gas numbered 7, on the day 7 Chef will test gas numbered 3, on the day 8 Chef will test gas numbered 8, and on the day 9 Chef will test gas numbered 4.

Test case 4: On the day 1 Chef will test gas numbered 0, on the day 2 Chef will test gas numbered 5, on the day 3 Chef will test gas numbered 1, on the day 4 Chef will test gas numbered 6, on the day 5 Chef will test gas numbered 2, on the day 6 Chef will test gas numbered 7, on the day 7 Chef will test gas numbered 3, and on the day 8 Chef will test gas numbered 8.

*/

#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    int day = 1, findGas = 0, Mod = 0, NumofGas = 0, count = 0, temp;

    while (t--)
    {
        //N p k
        cin >> NumofGas >> findGas >> Mod;

        for (int i = 0; i < NumofGas; i++)
        {
            day++; // Number of days count
            for (int j = 0; j < NumofGas; j++)
            {
                // returns true if findGas is found 
                if(j % Mod == count)
                {
                    if (findGas==j)
                    {   
                        cout<<day<<"\n";
                        break;
                    }
                    
                }
            }
            count++; // moves in increasing order
        }
    }

    return 0;
}
