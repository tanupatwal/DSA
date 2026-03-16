/* SELECTION SORT
select minimum and swap

for(i=0; i<= n-2; i++){
min = i
for(j=i+1; j<n; j++){
if(arr[j] < arr[min])
min=j
}
}
temp = arr[min]
arr[min] = arr[i]
arr[i] = temp
 */
import java.util.Scanner;
public class selection{
    public static void sort(int[]arr){
        //sorting logic will go here
        int n = arr.length;
        for(int i=0; i<= n-2; i++){
            int min = i; // assume current i is minimum
            for(int j = i+1 ; j<n; j++){
             if(arr[j]<arr[min]){
                min = j; //new minimum found
            }
        }
  // swap arr[i] and arr[min]
  int temp = arr[min];
  arr[min] = arr[i];
  arr[i] = temp;

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
    sort(arr); //selection sort
    //printed sorted array
    System.out.println("Sorted Array : ");
    for(int i = 0; i<n; i++){
         System.out.print(arr[i] + " ");
    }
}
}