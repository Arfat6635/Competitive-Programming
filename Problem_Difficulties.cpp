#include <bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin >> t;
    int a1, a2, a3, a4;
    set<int> problem;
    /*
        Try to make pair of two sets with diffrent power numbers 
        no numbers shall be the same in an each set
    */
    set<int>::iterator it1, it2;
    while (t--)
    {
        cin >> a1 >> a2 >> a3 >> a4;
        problem.insert(a1);
        problem.insert(a2);
        problem.insert(a3);
        problem.insert(a4);

        list<int> problem_list;
        problem_list.push_back(a1);
        problem_list.push_back(a2);
        problem_list.push_back(a3);
        problem_list.push_back(a4);

        int x = problem.size();

        if (x == 4)
        {
            cout << "2"
                 << "\n";
        }
        else if (x == 3)
        {
            cout << "2"
                 << "\n";
        }
        else if (x == 2)
        {
            /*
               2 2 5 5 --> 3 -- > possible sets 2
               2 2 2 4 --> 2 --> possible sets 1 
            */
            problem_list.sort();
            int element = problem_list.front();
            int m = count(problem_list.begin(), problem_list.end(), element);

            if (m == 2)
            {
                cout << "2"
                     << "\n";
            }
            else
            {
                cout << "1"
                     << "\n";
            }
        }
        else
        {
            cout << "0"
                 << "\n";
        }
        it1 = problem.begin();
        it2 = problem.end();
        problem.erase(it1, it2);
    }
    return 0;
}
