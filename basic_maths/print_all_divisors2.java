/*
N = 45

DIVISORS : 1, 3, 5, 9, 15, 45 

for( i = 1 ; i ≤ N; i++)

if (N % i == 0)

print( i )
*/

import java.lang.Math;
import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;

public class print_all_divisors2{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i;
    int N;
    Vector<Integer> divisors = new Vector<>();
    System.out.println("Enter a number ");
    N = sc.nextInt();
     System.out.printf("Divisors of %d :\n", N );   
    
    for( i = 1 ; i <= Math.sqrt(N); i++){
    
   if(N % i == 0){
     divisors.add(i);
     if(N/i != i){
     divisors.add(N/i);
     }
    
   }
        

    }
   Collections.sort(divisors);
   System.out.println(divisors);

    }
}














