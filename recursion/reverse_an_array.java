/*Problem Statement: You are given an array. The task is to reverse the array and print it. 

Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the first element will occupy the fifth position, the second element occupies the fourth position and so on.*/

import java.util.Scanner;
public class reverse_an_array{
    public static void revArray(int arr[], int start, int end){
    if(start < end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        revArray(arr, start+1, end-1);
    }
}
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number of elements : ");
    
    int n = sc.nextInt();

    int[] arr= new int[n];
    System.out.println("Enter " + n + "integers : " );
    for(int i =0; i<n; i++){
        arr[i] = sc.nextInt();
    }
    revArray(arr, 0, n-1);
    System.out.print("Reversed array : ");
    for(int x : arr){
        System.out.print(x + " ");
    }
    System.out.println();
    sc.close();
}
}
