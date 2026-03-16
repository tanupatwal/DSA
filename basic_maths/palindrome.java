/* dup = N

same as reverse and add on

// or if (N == reverse(N))
if(dup == rev N){

cout << “palindrome”<< endl;

}

else{

cout << “not a palindrome” << endl;

}
*/

import java.util.Scanner;
public class palindrome{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int ld;
        int rev;
        int N;
        rev = 0;

        System.out.print("Enter a number :");
         N = sc.nextInt();
         int dup =N;

      while(N != 0){

        ld = N % 10;
        N = N/10 ;
        rev = (rev * 10) +ld;
      }

    if(rev == dup){
        System.out.println("It's a palindrome");
    }
    else{
        System.out.println("It's not a palindrome");
    }
    }
}