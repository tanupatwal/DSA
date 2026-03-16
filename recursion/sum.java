import java.util.Scanner;
public class sum{
    public static void sumNumbers(int n){
    if(n == 0){
    return;
    }
    int sum = n*(n+1)/2;
    System.out.println(sum);
}
public static void main(String[]args){
    System.out.print("Enter N:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Sum of " + n + "numbers :");
    sumNumbers(n);

}
}
