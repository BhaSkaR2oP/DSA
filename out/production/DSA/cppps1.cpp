#include <bits/stdc++.h>
using namespace std;

int sod(int n){
	    int sum=0;
	    while(n>0){
	        sum+=n%10;
	        n=n/10;
	        
	    }
	    return sum;
	}

int main() {
	// your code goes here
	int start,end;
	int sum,count=0;
	cin>>start >>end;
	for(int i=start;i<=end;i++){
	    if(i%3==0 && sod(i)%2==0)
	    count++;
	}
	cout<<count;
	return 0;

}