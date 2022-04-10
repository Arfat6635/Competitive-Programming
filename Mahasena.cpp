#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t, even=0, odd=0;
    cin>>t;
    int arr[t];
    for (int i = 0; i <t; i++)
    {
       cin>>arr[i];
       if (arr[i]%2==0)
       {
           even+=1;
       }
       else
       {
           odd+=1;
       }
    }
    cout<<((even>odd)?"READY FOR BATTLE":"NOT READY")<<"\n";
    
    return 0;
}
