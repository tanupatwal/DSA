/* BUBBLE SORT 
push the max. to the last by adjacent swaps 
for(int i= n-1; i>0; i--){
for(int j = 0; j<= i-1;j++){
if(arr[j] > arr[j+1]){
swap
int temp = arr[j];
arr[j] = arr[j+1];
arr[j+1] = temp;
}
}
}
*/

import java.util.Scanner;
public class bubble{
    public static void sort(int[]arr){   // bubble sort
        //sorting logic will go here
        int n = arr.length;
        for(int i= n-1; i>0; i--){       //outer loop
for(int j = 0; j<= i-1;j++){             //inner loop
if(arr[j] > arr[j+1]){                   //compare adjacent
  // swap arr[i] and arr[min]
  int temp = arr[j];
  arr[j] = arr[j+1];
  arr[j+1] = temp;
}
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
    sort(arr); //selection sort
    //print sorted array
    System.out.println("Sorted Array : ");
    for(int i = 0; i<n; i++){
         System.out.print(arr[i] + " ");
    }

}
}

