/*
N = 371

= 3^3 + 7^3 + 1^3

= 371

( i ) extraction of digits
( ii ) dup = N
 sum = 0

while( N > 0 ){

ld = N % 10
 N = N / 10
sum = sum + (ld * ld * ld)

}

if(sum == dup){

print armstrong no.

}

else{

not an armstrong no.

}
*/
import java.util.Scanner;
public class armstrong{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // declaring variable ld, N
        int ld;
        int N;
        int sum = 0;   // initializing sum
        
        // Number input
        System.out.print("Enter a number :");
        N = sc.nextInt();
        int dup = N;
        while(N != 0){

        ld = N % 10;
        N = N/10; 
        sum = sum + (ld * ld * ld);
        }

    if(sum == dup){

    System.out.println("Armstrong no.");

    }

    else{

    System.out.println("Not an Armstrong no.");
}
    }
} 