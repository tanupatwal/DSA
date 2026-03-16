/*
N = 45

DIVISORS : 1, 3, 5, 9, 15, 45 

for( i = 1 ; i ≤ N; i++)

if (N % i == 0)

print( i )
*/

import java.util.Scanner;
public class print_all_divisors{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int i;
    int N;
    int c = 0;
    System.out.println("Enter a number ");
    N = sc.nextInt();
     System.out.printf("Divisors of %d :\n", N );   
    
    for( i = 1 ; i <= N; i++){
    
    if (N % i == 0){
        System.out.println(i);
        c++;
        
    }
        

    }
    if (c == 2){
     System.out.println(" It's a prime no.");
    }
     else{
     System.out.println(" It's not a prime no.");
     }
    }
}














