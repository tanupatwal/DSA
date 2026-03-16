/*
let say n1 = 20 , n2 = 40
for(i = min(n1,n2); i>=1 ; i--){
if(n1 % i == 0 && n2 % i == 0){
          gcd = i;
          break;
          }
}
*/
import java.util.Scanner;
public class gcd{
public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int n1, n2;
    int gcd = 1;

    System.out.println("Enter first number :");
    n1 = sc.nextInt();
    System.out.println("Enter second number : ");
    n2 = sc.nextInt();
    
    for(int i =  Math.min(n1,n2); i >= 1 ; i--){
        if(n1 % i == 0 && n2 % i == 0){
            gcd = i;
            break ;
        }
    }
    System.out.println("GCD is : " + gcd );

    }
}
