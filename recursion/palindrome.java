/* "Given a string, check if the string is palindrome or not."  A string is said to be palindrome if the reverse of the string is the same as the string.

Examples:

Example 1:
Input: Str =  “ABCDCBA”
Output: Palindrome
Explanation: String when reversed is the same as string.*/
import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //read the input as a string
       System.out.print("Enter a String: ");
       String str = sc.nextLine();

        //check if the string is a palindrome

      boolean isPalindrome = checkStringPalindrome(str);
    if(isPalindrome){
        System.out.println("It's a palindrome");
    }
    else{
        System.out.println("It's not a palindrome");
    }
    sc.close();
}
public static boolean checkStringPalindrome(String str){
    int left = 0;
    int right = str.length() -1 ;
    // loop from outside in
    while(left < right){
        //If characters at the current pointers don't match, it's not a palindrome
        if(str.charAt(left) != str.charAt(right)){
       return false;
        }
        //move pointers inward
        left ++;
        right --;
    }
    // If the loop completes without returning false, it is a palindrome
        return true;
}
}