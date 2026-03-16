/* Binary Search to find X in sorted array */
import java.util.Scanner;
import java.util.Arrays;
public class target{
    public static void search(int[] arr, int target){
       
        Arrays.sort(arr);
        
        int low = 0;
        int high = arr.length - 1;

            while(low <= high){
                int mid = (low + high)/2;
            
            if(arr[mid] == target){
                System.out.println("Target value found at index: " + mid);
                return;
            }
            else if(target > arr[mid]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
            System.out.println("Target value not found");
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n= sc.nextInt();

        int[]arr = new int[n];

        System.out.println("Enter" + n + " elements:");
        for(int i =0 ; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        
    search(arr, target);  
    }
}