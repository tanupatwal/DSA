import java.util.Scanner;
public class n_times_hello{
    static void printHello(int n){
        if(n<=0)        //base case
        return; 
        System.out.println("Hello");
        printHello(n-1);     // recursive call
    }
    public static void main(String[]args){
        System.out.println("Enter N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        printHello(N);
        sc.close();
    }
}