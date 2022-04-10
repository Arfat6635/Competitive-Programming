#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    vector<int> v;
    int n, j;
    int l, start, end;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> j;
        v.push_back(j);
    }
    cin >> l;
    cin >> start >> end;
    v.erase(v.begin() + l - 1);
    v.erase(v.begin() + start - 1, v.begin() + end - 1);

    cout<<v.size()<<endl;

    for (auto i : v)
    {
        cout << i << " ";
    }

    return 0;
}