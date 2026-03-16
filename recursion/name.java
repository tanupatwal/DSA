import java.util.Scanner;
public class name{
    static void printName(String name, int n){
        if(n <= 0)
        return;
    System.out.println(name);
    printName(name, n-1);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();         //taking user input for name

        System.out.println("ENter no. of times: ");
        int N = sc.nextInt();
        printName(name, N);
        sc.close();
    
    }
}
