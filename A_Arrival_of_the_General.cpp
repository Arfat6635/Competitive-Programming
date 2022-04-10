#include <bits/stdc++.h>
using namespace std;
 
int main(){
    int n;
    int max_value=0;
    int min_value=101;
    int maxi=0,mini=0;
    cin>>n;
    for(int i=0;i<n;i++){
	    int a;
	    cin>>a;
    if(a>max_value){
	    maxi=i;
	    max_value=a;
    }
    if(a<=min_value){
	    mini=i;
	    min_value=a;
    }
    }
 
    if(maxi>mini){
	    cout<<(maxi-1)+(n-mini)-1;
    }
    else{
	    cout<<(maxi-1)+(n-mini);
    }
    return 0;
}
