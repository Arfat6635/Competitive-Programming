#include <iostream>
using namespace std;
int main(int argc, char const *argv[])
{
    string current_piece, previous_piece;
    int groups = 0;
    int pieces;
    cin>>pieces;
    while (pieces--)
    {
        cin>>current_piece;
        if ((current_piece=="10")&&(current_piece!=previous_piece))
        {
            groups+=1;
            previous_piece="10";
        }
        else if((current_piece=="01")&&(current_piece!=previous_piece))
        {
            groups+=1;
            previous_piece="01";
        }
    }
    cout<<groups<<"\n";
    return 0;
}

