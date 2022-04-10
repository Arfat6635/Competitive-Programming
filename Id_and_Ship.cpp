#include<iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    int t;
    char word;
    cin>>t;
    while (t--)
    {
        cin>>word;
        if (word=='B' || word =='b')
        {
            cout<<"BattleShip"<<"\n";
        }
        else if (word=='C' || word =='c')
        {
            cout<<"Cruiser"<<"\n";
        } 
        else if (word=='D' || word =='d')
        {
            cout<<"Destroyer"<<"\n";
        } 
        else if (word=='F' || word =='f')
        {
            cout<<"Frigate"<<"\n";
        } 
    }
    
    return 0;
}
