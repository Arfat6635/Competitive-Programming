#include <stdio.h>

int main() {

    char current_piece[2], previous_piece[2];
    int groups = 0;
    int pieces;
    scanf("%d",pieces);
    while (pieces--)
    {
        scanf("%s",current_piece);
        if ((current_piece=="10")&&(current_piece!=previous_piece))
        {
            groups+=1;
            previous_piece[2]="10";
        }
        else if((current_piece=="01")&&(current_piece!=previous_piece))
        {
            groups+=1;
            previous_piece[2]="01";
        }
    }
    printf("%d",groups);
    return 0;
}