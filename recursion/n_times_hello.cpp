#include<bits/stdc++.h>
using namespace std;
void printHello(int n){
    if(n<=0)                //base case
    return;   
    cout<< "Hello\n";              //task
    printHello(n-1);        //recursive call for the smaller problem
}
int main(){
    int N;
    cout << "Enter N : ";
    cin >> N;
    printHello(N);
    return 0;
}