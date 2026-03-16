/*
n = 5 (prime number)

Initial: count = 0

Loop: condition i * i <= 5

i = 1:
5 % 1 == 0 
n / i = 5 / 1 = 5 → i != n/i
→ count += 2 → count = 2

i = 2:
2 * 2 = 4 <= 5 → check
5 % 2 != 0 → no increment

i = 3:
3 * 3 = 9 > 5 → loop ends

Final count = 2 → prime
*/

#include<bits/stdc++.h>
using namespace std ;
int main(){
    int n;
    cout << "Enter a number :" ;
    cin >> n;
    
    int count = 0;
    for(int i= 1; i * i <= n; i++){
        if(n % i == 0 ){
            if(i == n/i)
            count++;                      // perfect square divisor counts once

            else
            count += 2;                   // count both i and n/i
        }
    }
    if(count == 2)
{
    cout << "It's a prime number" ;
}
else {
    cout << "It's not a prime number";
}
return 0;
}