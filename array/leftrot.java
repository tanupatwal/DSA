/* Left Rotate the Array by One
Input:
 nums = [1, 2, 3, 4, 5]  
Output:
 [2, 3, 4, 5, 1]  
Explanation:
 Initially, nums = [1, 2, 3, 4, 5]  
Rotating once to the left results in nums = [2, 3, 4, 5, 1]

 */
import java.util.Scanner;
public class leftrot{
    public static void rotate(int[]arr){
        int n = arr.length;

        int temp = arr[0];   /// store first element

        for(int i= 1; i < n ; i++){
            arr[i-1] = arr[i];  // shift left
          
        }
          arr[n-1] = temp;         // place temp at last
    }
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        rotate(nums);

      System.out.print("Array after left rotating by one : ");
      for(int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + " "); 
      }
    }
}