/* IMPLEMENT UPPER BOUND- BINARY SEARCH
UPPER BOUND -smallest index such that arr[ind] > x

Important points:

The element does NOT have to be equal to x

If x appears multiple times → upper bound is just after the last x

If x does not exist → upper bound is where x should be inserted

Array must be sorted

Example:
arr = [1,2,3,3,7,8,9,9,11]

x = 3  → index 4 (value 7)
x = 4  → index 4 (value 7)
x = 9  → index 8 (value 11)
x = 11 → index 9 (out of bounds → no upper bound)

*/ 

import java.util.Scanner;
import java.util.Arrays;
public class upper{
    public static void search(int[] arr,int target){
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

            while(low <= high){
                int mid = (low + high)/2;
            
             // UPPER BOUND CONDITION
            if(arr[mid] > target){
                ans = mid;           //possible upper bound
                high = mid -1;       // move left
            }
        
            else{
                low = mid + 1;       // move right
            }
        }

            if(ans < arr.length){
                System.out.println("Upper Bound Index = " + ans);
            }
            else{
                System.out.println("Upper Bound does not exist or consider hypothetical");
            }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n= sc.nextInt();

        int[]arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        
    search(arr, target);  
    }
}