/*

*/
import java.util.Scanner;
public class prime{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;
        int i;
        System.out.println("Enter a number :");
        n = sc.nextInt();
        for(i =1; i*i <= n; i++){
            if(n % i == 0){
                if(i == n/i){
                count++;
                }
                else{
                    count += 2;
                }

            }

        }
        if(count == 2){
            System.out.println("It's a prime number");

        }
        else{
            System.out.println("It's not a prime number");
        }

    }
}