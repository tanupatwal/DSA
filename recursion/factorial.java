/*
Given a number X,  print its factorial.

To obtain the factorial of a number, it has to be multiplied by all the whole numbers preceding it. More precisely X! = X*(X-1)*(X-2) … 1.

Note: X  is always a positive number. */

import java.util.Scanner;
public class factorial{
    public static void fact(int N){
        int fact =1;
        for(int i = 1; i <= N; i+=1 ){
        fact = fact * i;
        }
    
    System.out.println(fact);
}
public static void main(String[]args){
    System.out.print("Enter N : ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Factorial of " + n + " :");
    fact(n);
}
}