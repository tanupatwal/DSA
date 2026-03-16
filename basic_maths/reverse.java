/*
1. N = 856 

output =  658

d = 0

d = (d* 10) + 6 =6

d = (6 * 10) + 5 = 65

d = (65 * 10) + 8 = 658

int reverse(int N){

rev = 0 

while(N ≠ 0){

ld = N % 10

N = N/10 

rev = (rev * 10) +ld

}

return rev
}
 */
import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ld;
        int rev;
        int N;
        rev = 0;

        System.out.print("Enter a number :");
         N = sc.nextInt();

      while(N != 0){

ld = N % 10;

N = N/10 ;

rev = (rev * 10) +ld;

}
  System.out.printf("Reversed number : %d", rev);
    }
}