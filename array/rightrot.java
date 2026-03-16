/* rotate the array from right by k times     

 k = k % n;
        reverse(nums, 0, n - 1);     
        reverse(nums, 0, k - 1);     
        reverse(nums, k, n - 1);  

    procedure reverse(arr, start, end)
    while start < end do
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp

        start = start + 1
        end = end - 1
    end while
end procedure
   
*/
import java.util.Scanner;
public class rightrot{
    public static void rotate(int[] nums, int k){
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, n-1);

    }

private static void reverse(int[] nums, int start, int end){
    while(start < end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end-- ;
    }

}
public static void main(String[] args){
    int[] nums = {1,2,3,4,5,6,7};
    int k = 5;
    rotate(nums,k);

      System.out.print("Right rotated array: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }
}
}


