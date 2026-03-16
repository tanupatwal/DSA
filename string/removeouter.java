import java.util.Scanner;

public class removeouter {

    public static String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int level = 0;

        for (char c : s.toCharArray()) {

            if (c == '(') {
                if (level > 0) {
                    result.append(c);
                }
                level++;
            } else { // c == ')'
                level--;
                if (level > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a valid parentheses string: ");
        String input = sc.nextLine();

        String output = removeOuterParentheses(input);

        System.out.println("Result after removing outermost parentheses: " + output);

        sc.close();
    }
}
