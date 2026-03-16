/*
 N = 856

D1 = 856 % 10 = 6

856 / 10 = 85.6

D2 = 85 % 10 = 5

85/10 = 8.5

D3 = 8 % 10 = 8

8/10 = 0.8
 
 */

import java.util.Scanner;
public class extraction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ld;
        int count = 0;
        
        // Number input
        System.out.print("Enter a number :");
        int N = sc.nextInt();
        while(N != 0){

        ld = N % 10;
        N = N/10; 
        count++ ;
}
     System.out.printf(" No. of digits : %d ", count);
                                                        
    }
}