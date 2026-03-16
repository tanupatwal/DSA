// Optimal Approach (Hardcoded array)
/* 
import java.util.Scanner;
public class slargest{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] arr = {1 , 2, 4, 7, 7, 5};
        int largest = arr[0];
        int sec_largest = -1;  // As array doesn't contain any negative integer
        for(int i = 1; i< arr.length; i++){
            if(arr[i] > largest){
                sec_largest = largest;       // move old largest
                largest = arr[i];            // update largest
            }
            else if( arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }
        if(sec_largest == -1){
            System.out.println(" No second largest element");
        }
        else{
            System.out.println("Second largest element : " + sec_largest);
        }
    }
}
*/

// Optimal Approach (user defined array)
import java.util.Scanner;
public class slargest{
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        if(n < 2){
             System.out.println("No second largest element");
            return;
        }
        
        int[] arr = new int[n];  // array declaration

        System.out.println("Enter elements : ");
        for(int i = 0; i < n; i++){
           arr[i] = sc.nextInt();  // reading elements 
        }

        int largest = arr[0];
        int sec_largest = -1;  // valid since only positive integers

            for(int i = 1; i < n; i++){
                if (arr[i] > largest) {
                sec_largest = largest;
                largest = arr[i];
            }
            else if( arr[i] < largest && arr[i] > sec_largest){
                sec_largest = arr[i];
            }
        }
        if(sec_largest == -1){
            System.out.println(" No second largest element");
        }
        else{
            System.out.println("Second largest element : " + sec_largest);
        }
        sc.close();
    }
}