#include <iostream>
#include <string>
using namespace std;
int
main ()
{
  string borze=" ", result=" ";
  int len;
  std::cin >> borze;
  for (int i = 0; i < borze.length()-1; i++) {
      if(borze[i]=='.'){
          //0
          result+='0';
      }
      else if(borze[i]=='-' && borze[i]=='.' ){
          result+='1';
      }
      else if(borze[i]=='-' && borze[i]=='-' ){
          //2
          result+='2';
      }
  }
  cout<<result;
  return 0;
}
