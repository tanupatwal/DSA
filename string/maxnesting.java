/* Maximum Nesting Depth of Parenthesis: 
Problem Statement: Given a valid parentheses string s, return the nesting depth of s. The nesting depth is the maximum number of nested parentheses. 

Example 1:
Input:
 s = "(1+(2*3)+((8)/4))+1"
Output:
 3
Explanation:
 Digit 8 is inside of 3 nested parentheses in the string.

Example 2:
Input:
 s = "(1)+((2))+(((3)))"
Output:
 3
Explanation:
 Digit 3 is inside of 3 nested parentheses in the string.
            
*/
import java.util.*;
public class maxnesting{
    public static int max(String s){
        int sum =0;   // current depth
        int ans =0;    // maximum depth

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            if(c == '('){
                sum++;          //increase depth
                if(sum > ans){           
                    ans = sum;    // update maximum depth
                }
            }
            else if(c == ')'){
                sum--;           //ddecrease depth
            }
        }
        //check if parentheses are balanced 
        if(sum != 0){
            System.out.println("Parentheses are not balanced");
            return -1;
        }
        return ans;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the expression: ");
        String input = sc.nextLine();

        int result = max(input);

        if(result != -1){
            System.out.println("Maximum Nesting Depth: " + result);
        }
     sc.close();
    }
}