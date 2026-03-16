/* MERGE SORT 
MERGE_SORT(arr, low, high)
{
    if (low >= high)
        return

    mid = (low + high) / 2

    MERGE_SORT(arr, low, mid)
    MERGE_SORT(arr, mid + 1, high)

    MERGE(arr, low, mid, high)
}

MERGE(arr, low, mid, high)
{
    i = low
    j = mid + 1
    k = 0

    temp = new array of size (high - low + 1)

    while (i <= mid AND j <= high)
    {
        if (arr[i] <= arr[j])
            temp[k++] = arr[i++]
        else
            temp[k++] = arr[j++]
    }

    while (i <= mid)
        temp[k++] = arr[i++]

    while (j <= high)
        temp[k++] = arr[j++]

    for p = 0 to k - 1
        arr[low + p] = temp[p]
}
*/

import java.util.Scanner;
public class merge{
    public static void sort(int[]arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = low + (high - low)/2;   // avoids overflow
        sort(arr, low, mid);              // left half
        sort(arr, mid + 1, high);         // right half
        merge(arr, low, mid, high);       // merge step
    }
    private static void merge(int[]arr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = 0;
        int[] temp = new int[high - low + 1];

        while(i <= mid && j <= high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        while(i <= mid){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
       for(int p = 0; p < temp.length; p++){
        arr[low + p] = temp[p];
       } 
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
  
    //correct merge sort call
        sort(arr, 0, arr.length - 1);

    //print sorted array
    System.out.println("Sorted Array : ");
    for(int i = 0; i < n; i++){
         System.out.print(arr[i] + " ");
    }

}
}