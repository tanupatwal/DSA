/* INSERTION SORT
Takes an element and place it in its correct order by shifting
 */
import java.util.Scanner;
public class insertion{
    public static void insert(int[]arr){
        // sorting logic
        int n = arr.length;
        for(int i =0; i < n; i++){
            int j=i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }

// main user input
public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of an array : ");
    int n = sc.nextInt();

    int[]arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for(int i=0;i<n;i++){
        arr[i] = sc.nextInt();
    }
    insert(arr); //insertion sort
    //print sorted array
    System.out.println("Sorted Array : ");
    for(int i = 0; i<n; i++){
         System.out.print(arr[i] + " ");
    }

}
}