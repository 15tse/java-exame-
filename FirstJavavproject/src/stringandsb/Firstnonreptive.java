package stringandsb;
import java.lang.String;
public class Firstnonreptive {
    public static void main(String[] args) {
        String str = "ccddfeerdde  ";
        System.out.println(firstNonRepeatedChar(str));  // Outputs: e
    }

    public static Character firstNonRepeatedChar(String str) {
        // Create a HashMap to store character frequencies
        java.util.HashMap<Character, Integer> charCount = new java.util.HashMap<>();

        // Count the occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        // Find the first non-repeated character
        for (char c : str.toCharArray()) {
            if (charCount.get(c) == 1) {
                return c;
            }
        }

        return null; // Return null if no non-repeated character is found
    }
}

/* - Input string: "aabbc"
  - HashMap:
     - Key: 'a', Value: 2;
     - Key: 'b', Value: 2;
     - Key: 'c', Value: 1;
   
The HashMap allows us to efficiently count 
   the occurrences of 
    each character and then find 
    the first character with a count of 1, 
which is the first non-repeated character. */

