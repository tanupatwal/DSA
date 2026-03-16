/*
Given an integer n, return true if it is a power of three. Otherwise, return false.
An integer n is a power of three, if there exists an integer x such that n == 3x.

 Example 1:

Input: n = 27
Output: true
Explanation: 27 = 33

Algorithm (Step-by-Step)

If n ≤ 0, return false
(Because powers of 3 are always positive)

Repeat while n is divisible by 3:

If n % 3 == 0, divide n by 3
(n = n / 3)

After the loop, check:

If n == 1, return true

Otherwise, return false

*/ 
import java.util.Scanner;
public class power_of_three{
    public boolean isPowerOfThree(int n) {
      if(n <= 0) {
        return false;
      } 
      while(n % 3 == 0){
        n = n/3;
      }
      return n == 1;
    }
public static void main(String[]args){
    System.out.println("Enter number :");
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    power_of_three obj = new power_of_three();
    boolean result = obj.isPowerOfThree(N);

    System.out.println(result);
}
}