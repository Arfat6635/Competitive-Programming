#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    cin>>t;
    int input;
    for (int i = 0; i < t; i++)
    {   
        cin>>input;
        cout<<(input/2)+1<<"\n";
    }
    
    return 0;
}
