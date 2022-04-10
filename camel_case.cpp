#include <stdio.h>
#include <iostream>
#include<string>
using namespace std;
int main()
{
    string camel="";
    string nonCamelCased = ""; 
    cin>>nonCamelCased;
    for(char c : nonCamelCased){
        
        if(c>=65 && c<=90)
        {
            camel+=" ";
            camel+=c;       
        }
        else{
            camel+=c;
        }
    }
    cout<<camel;
    return 0;
}