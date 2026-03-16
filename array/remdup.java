/* to remove duplicates from an array
create a duplicate array - to store unique elements
print duplicate array
arr = {1, 1, 2, 2, 3, 3, 3}
n = length of arr

create array dup of size n

unique = arr[0]
dup[0] = unique
j = 1

for i = 1 to n-1
    if arr[i] == unique
        // duplicate element
        do nothing
    else
        unique = arr[i]
        dup[j] = unique
        j = j + 1
    end if
end for

print dup from index 0 to j-1


 */


import java.util.Scanner;

public class remdup{

    public static void perform_op(int[] arr) {
       int n = arr.length;

       int[] unique = new int[n];
       int j = 0;    // index for unique array

       unique[j++] = arr[0];   // first element is always unique

         for(int i = 1; i <n ;i++){
            if(arr[i] != arr[i - 1]){
                unique[j++] = arr[i];
            }
         }

        // print unique elements
        System.out.println(" Array after removing duplicates : ");
        for(int i = 0; i < j; i++){
            System.out.print(unique[i] + " ");
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        // now we need to declare an arr of size n

        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    

        perform_op(arr);
    }
}