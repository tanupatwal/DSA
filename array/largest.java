/* largest element in an array using brute force approach
1. sort the array in ascending order
2. largest = arr[n-1]
3. print(arr[n-1])
TIME COMPLEXITY - O()

*/
//HARD-CODED ARRAY
/* 
import java.util.Arrays;
public class largest{
public static void main(String[] args){
    int[] arr = {4,7,8, 10, 5, 13};
    
    // Sort the array
    Arrays.sort(arr);

    // largest element is at last index
    int largest = arr[arr.length -1];

    // print largest element
    System.out.println("Largest element : " + largest);
}
}
*/


/* WITH USER DEFINED ARRAY */

import java.util.Scanner;
import java.util.Arrays;

public class largest{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter array size : ");
    int n = sc.nextInt();

     int[] arr = new int[n];   // array declaration

    System.out.println("Enter Elements :");
    for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    Arrays.sort(arr);        // sorting

    int largest = arr[n-1];
    System.out.println("Largest element : " + largest);

    sc.close();
}
}