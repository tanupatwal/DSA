
/*Given an integer n, write a function to print all numbers from 1 to n (inclusive) using recursion.

You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in increasing order from 1 to n.*/
import java.util.Scanner;
public class print1_to_n{
    public static void printNumbers(int n){
        if(n == 0){ 
            return;  // base case
            }  
         printNumbers(n-1); // recursive call
          System.out.println(n); //print after recursion

    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        System.out.println( " 1 to " + n + " numbers are : ");
        printNumbers(n);        //call static method
    }
}