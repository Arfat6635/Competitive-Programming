#include <stdio.h>
int main()
{
    int distance;
    int time;
    printf("enter distance  value :");
    scanf("%d", &distance);
    printf("enter time value :");
    scanf("%d", &time);
    int speed = distance*time;
    printf("speed value is:%d", speed);
}