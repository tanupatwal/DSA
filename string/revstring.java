/* Input: "This is Apple"

Step-by-step:
| Character | x (temp word) | b (result)       |
| --------- | ------------- | ---------------- |
| T         | T             |                  |
| h         | Th            |                  |
| i         | Thi           |                  |
| s         | This          |                  |
| space     | ""            | "This "          |
| i         | i             | This             |
| s         | is            | This             |
| space     | ""            | "is This "       |
| A         | A             | is This          |
| p         | Ap            |                  |
| p         | App           |                  |
| l         | Appl          |                  |
| e         | Apple         |                  |
| End       | ""            | "Apple is This " |

OUTPUT: "Apple is This"
 */
import java.util.Scanner;

public class revstring {

    public static String reverseWords(String s) {

        String x = "";  // temp word
        String b = "";  // final result

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch != ' ') {
                x = x + ch;     // build word
            } else {
                if (!x.isEmpty()) {
                    b = x + " " + b;   // add word in front
                    x = "";            // reset temp word
                }
            }
        }

        // Add last word (important)
        if (!x.isEmpty()) {
            b = x + " " + b;
        }

        return b.trim();  // remove extra space
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = sc.nextLine();

        String result = reverseWords(input);
        System.out.println("Reversed words : " + result);
    }
}
