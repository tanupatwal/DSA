import java.util.*;

public class SortCharactersByFrequency {

    public static void main(String[] args) {

        // Step 1: Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        // Step 2: Create frequency map
        Map<Character, Integer> freq = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (freq.containsKey(ch)) {
                freq.put(ch, freq.get(ch) + 1);
            } else {
                freq.put(ch, 1);
            }
        }

        // Step 3: Store unique characters in list
        List<Character> uniqueChars = new ArrayList<>(freq.keySet());

        // Step 4: Sort with custom comparator
        Collections.sort(uniqueChars, (a, b) -> {

            // First rule: descending frequency
            if (freq.get(a) > freq.get(b)) {
                return -1;
            } 
            else if (freq.get(a) < freq.get(b)) {
                return 1;
            } 
            else {
                // Second rule: alphabetical order
                return Character.compare(a, b);
            }
        });

        // Step 5: Print result
        System.out.println("Sorted characters: " + uniqueChars);

        sc.close();
    }
}