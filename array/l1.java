/*
largest element in an array using Optimal Approach
largest = arr[0]
for(i=0;i<n;i++){
if(arr[i]>largest)
largest = arr[i]
}
print (largest)

TIME COMPLEXITY - O(n)
 */

// Hard - coded array

/*
import java.util.Scanner;
import java.util.Arrays;

public class l1{
public static void main(String[] args){
    int[] arr = {4,7,8, 10, 5, 13};

    int largest = arr[0]; // initialize array

    for(int i = 0; i < arr.length; i++){
        if(arr[i]>largest){
        largest = arr[i];
    }
}
    System.out.println("largest Element :" + largest);
}
}
*/

// USER DEFINED ARRAY

import java.util.Scanner;

public class l1{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size : ");
    int n = sc.nextInt();

     int[] arr = new int[n];   // array declaration

    System.out.println("Enter elements :");
    for(int i = 0; i < n ; i++){
        arr[i] = sc.nextInt(); // read input
    }
    int largest = arr[0];       //initialize largest
    for(int i = 1; i < n; i++){
        if(arr[i]>largest){
        largest = arr[i];
    }
}
    System.out.println("largest Element :" + largest);
    sc.close();
}
}