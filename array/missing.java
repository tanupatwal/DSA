/*  find the missing number in an array 
arr[] = [1,2,4,5]
N = 5
missing = 3
range(0 to N)

BRUTE APPROACH : linear search , check one by one with the range if all elements matches with the elements present in the array , then no missing  numder, if found , then return the missing number

BETTER APPROACH : Using hashing

OPTIMAL APPROACH : 
1. Using sum way: 
sum of sirt natural no.  S1 = (N*(N+)/2)
S2 = sum of array
missing element = S1 - S2

2. XOR way
xor1 = 0;
for(int i= 1; i <= N; i++){
XOR 1 = XOr1 ^ i;
}
xor2 = 0;
for(int i = 0; i < N-1; i++){
xor2 = xor2 ^ arr[i];
}
return xor1 ^xor2;

*/
import java.util.Scanner;
public class missing{
    public static int num(int[] arr, int N){
       
        int xor1 = 0;
        int xor2 = 0;

        for(int i =1; i <= N ; i++){
            xor1= xor1 ^ i;
        }
      
        for(int i = 0; i < arr.length ; i++){
            xor2 = xor2 ^ arr[i];
        }
        return xor1 ^ xor2;
    }
    public static void main(String[]args){
    
        Scanner sc = new Scanner(System.in);

        // input N
        System.out.print("Enter size of an array : ");
        int N = sc.nextInt();

         int[] arr = new int[N - 1];
         
        System.out.println("Enter elements: ");
        for( int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        // Output missing number
        System.out.println("Missing number: " + num(arr, N));
    }
}