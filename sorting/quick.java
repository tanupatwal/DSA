/* QUICK SORT
* Chooses a pivot element and partitions the array into elements smaller and
larger than the pivot
* Recursively sorts the subarrays on either side of the pivot.

quicksort(arr, low, high){
if(low < high)
{
pIndex = Partition(arr, low, high)
quicksort(arr, low, pIndex-1)
quicksort(arr, pIndex + 1, high)
}
}
 */
import java.util.Scanner;
public class quick{
    // quicksort logic
    static void quicksort(int[]arr, int low, int high){
        if(low < high){
             // Find the partition index (where the pivot belongs)
             int pIndex = partition(arr, low, high);

             //recursively sort elements before and after partition
             quicksort(arr, low, pIndex - 1);
             quicksort(arr, pIndex + 1, high);
        }
    }
    // Partition function using LAST Element as Pivot
    static int partition(int[]arr, int low, int high){
        int pivot = arr[high];   //pivot is the last element
        int i = low;             // start from beginning
        int j = high -1;        // start from element before pivot

        while(i <= j){
            // move 'i' right: look for element > pivot
            while(i <= j && arr[i] < pivot){
                i++;
            }
            // Move 'j' left: look for element < pivot
            while (i <= j && arr[j] > pivot) {
                j--;
            }
            // Swap if the Left Index (i) is still smaller than the Right Index (j)
            if(i <= j){
                swap(arr, i ,j);
                i++;
                j--;
            }

        }
        //swap the pivot (at high]) with the boundary of large elements (at i)
        swap(arr, i, high);
        return i; // return the partition index
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    // main user input
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter size of an array : ");
    int n = sc.nextInt();

    int[]arr = new int[n];
    System.out.println("Enter " + n + " elements:");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }
  
    //correct quick sort call
        quicksort(arr, 0, arr.length - 1);

    //print sorted array
    System.out.println("Sorted Array : ");
    for(int i = 0; i < n; i++){
         System.out.print(arr[i] + " ");
    }

}
}