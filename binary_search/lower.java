/* IMPLEMENT LOWER BOUND- BINARY SEARCH
Lower Bound -smallest index such that arr[ind] >= x

Important points:

The element does NOT have to be equal to x

If x exists multiple times → lower bound is the first occurrence

If x does not exist → lower bound is where x should be inserted

Array must be sorted

Example:
arr = [1,2,3,3,7,8,9,9,11]
x = 3  → lower bound = index 2
x = 4  → lower bound = index 4 (value 7)
x = 10 → lower bound = index 8 (value 11)

*/ 

import java.util.Scanner;
import java.util.Arrays;
public class lower{
    public static void search(int[] arr,int target){
        Arrays.sort(arr);

        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length;

            while(low <= high){
                int mid = (low + high)/2;
            
             // LOWER BOUND CONDITION
            if(arr[mid] >= target){
                ans = mid;           //possible lower bound
                high = mid -1;       // move left
            }
        
            else{
                low = mid + 1;       // move right
            }
        }

            if(ans < arr.length){
                System.out.println("Lower Bound Index = " + ans);
            }
            else{
                System.out.println("Lower Bound does not exist");
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