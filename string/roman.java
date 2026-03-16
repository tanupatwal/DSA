/* ROMAN TO INTEGER 
XVI = 16
XIV = 14
*/
import java.util.*;
public class roman{
    public static void convert(String s){
        int sum =0;

        Map< Character , Integer> romandict = new HashMap<>();
        
        //Add elements (Put)
        romandict.put('I', 1);
        romandict.put('V', 5);
        romandict.put('X', 10);
        romandict.put('L' , 50);
        romandict.put('C', 100);
        romandict.put('D', 500);
        romandict.put('M', 1000); 

        for(int i = 0; i < s.length() - 1 ; i++){
            char c = s.charAt(i);
            int num = romandict.get(c);
         
           char c1 = s.charAt(i+1);
           int num1 = romandict.get(c1);

           if(num >= num1){
            sum = sum + num;
           }
           else{
            sum = sum + num * (-1);
           } 
        // fruits: grapes, animal : hippo, AI: antigravity , key: value ,I:1, V : 5, X:10, L :50, C:100, D : 500, M:1000

       //  System.out.println(c+ " = "+ num );
        }
        sum = sum + romandict.get(s.charAt(s.length()-1));

        System.out.println(" Value of Roman no. in integer : " + sum );
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
    convert(str);
    }
}