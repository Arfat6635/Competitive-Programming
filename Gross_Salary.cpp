#include<bits/stdc++.h>
using namespace std;
int main(int argc, char const *argv[])
{
    int t=0;
    cin>>t;
    while (t--)
    {
       int salary=0;
       cin>>salary;

       if (salary>=1500)
       {
           cout<<setprecision(2) << fixed <<(salary+500)+(salary*0.98)<<endl;
           
       }
       else{
           cout<<setprecision(2) << fixed <<salary+(salary*0.10)+(salary*0.90)<<endl;
       }
       

    }
    
    return 0;
}
