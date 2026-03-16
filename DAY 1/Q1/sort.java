// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.

// Note: The second largest element should not be equal to the largest element.
import java.util.Arrays;
class sort {
    public static int getSecondLargest(int[] arr) {
        // code here
        int n = arr.length;
        //sort the array in ascending order
        Arrays.sort(arr);
        int largest = arr[n-1];
        //start from second last element as last element is the largest
        for(int i = n-1; i>=0; i--){
            if(arr[i] != largest){
                return arr[i];
            }
        }
          // if no second largest element, return -1
          return -1;
          
    }
    public static void main(String[]args){
        int[]arr = {12,35,1,10,34,1};
        System.out.println(getSecondLargest(arr));
    }
}
