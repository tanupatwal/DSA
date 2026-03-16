/*
Search in rotated sorted array 

arr[] = [7 8 9 1 2 3 4 5 6]
target = 1

1. identify the sorted half ----> left/right
2. check (left half sorted)
low <= target && target <= arr[mid]
then, 
high = mid -1 ;
else{
low = mid + 1;
}
 or right half sorted 
 else
 {
 if(arr[mid] <= target && target <= arr[high])
 {
 low = mid +1;
 }
 else{
 high = mid-1;
 }
 return -1;
 }
 */
import java.util.Scanner;
public class search{
    public static int find(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == target)
            return mid;

            //left sorted
             if (arr[low] <= arr[mid]){
                if(arr[low] <= target && target <= arr[mid]){
                    high =mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            //right sorted
             else{
                    if(arr[mid] <= target && target <= arr[high]){
                        low =mid + 1;
                    }
                    else{
                        high = mid - 1;
                    }
                     }
        
        }
        return -1;
     }
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Size of an array: ");
    int n = sc.nextInt();

    int[]arr = new int[n];

    System.out.println("Enter " + n + " elements:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
    System.out.print("Enter target value : ");
    int target = sc.nextInt();

    int result = find(arr, target);   // store result
    System.out.println("Index: " + result);
}
}