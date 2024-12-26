package stringandsb;
import java.lang.String;
public class VowelsandCon {
    public static void main(String[] args) {
        String str = "tsegaye abadi";
        int[] count = countVowelsAndConsonants(str);
        System.out.println("Vowels: " + count[0] + ", Consonants: " + count[1]);
    }

    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the string to lower case
        str = str.toLowerCase();

        // Iterate over each character in the string
        for (char c : str.toCharArray()) {
            // Check if the character is a letter
            if (Character.isLetter(c)) {
                // Check if the character is a vowel
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        return new int[]{vowelCount, consonantCount};
    }


}
