/*
LINEAR SEARCH
checck one by one value of indices of the array is equal to the target value.
if matches then return that value , if not then return -1
for(int i = 0; i<n; i++){
if(arr[i] ==  target_varlue)
return i;
}
return -1;

 */
import java.util.Scanner;
public class linear{

    public static void search(int[] arr, int target){
        boolean found = false;

        int n = arr.length;

        for(int i = 0; i < n; i++){
            if( arr[i] == target){
             System.out.println("Target value found at index: " + i);
             found = true;
            }
        }
        
        if (!found) {
            System.out.println("Target value not found");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of an array : ");
        int n = sc.nextInt();

        int[]arr = new int[n];

        System.out.println("Enter" + n + " elements:");
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target value : ");
        int target = sc.nextInt();
        
        search(arr, target);
        
    }
}