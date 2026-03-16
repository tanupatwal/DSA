/*Given an integer n, write a function to print all numbers from n to 1 (inclusive) using recursion.

You must not use any loops such as for, while, or do-while.
The function should print each number on a separate line, in decreasing order from n to 1 */

import java.util.Scanner;
public class print_n_to_1{
    public static void printNumbers(int n){
    if(n < 1){
    return;
    }
    System.out.println(n);
      printNumbers(n-1);
}
public static void main(String[]args){
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter n :");
        int n = sc.nextInt();

        System.out.println(  n + " to 1 numbers are : ");
        printNumbers(n);   
}
}