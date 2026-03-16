/*
let say n1 = 20 , n2 = 40
for(i = min(n1,n2); i>=1 ; i--){
if(n1 % i == 0 && n2 % i == 0){
          gcd = i;
          break;
          }
}
*/

#include<bits/stdc++.h>
using namespace std;
int main(){
    int n1,n2;
    int i;
    cout << " Enter first Number :";
    cin >> n1;
    cout << " Enter second Number :";
    cin >> n2;

    int gcd =1;
    for(int i = min(n1,n2); i >= 1; i--){
        if(n1 % i == 0 && n2 % i == 0){
          gcd = i;
          break;           // stop after finding the largest common divisor
        }  

        }
        cout << "GCD is : " << gcd << endl;
        return 0 ;
    }
