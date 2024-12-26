package methods;

public class stringmanpulator {
	public static void main(String[] args) {
        String input = "hello score world";
        String output = stringmanpulator.processString(input);
        System.out.println(output);
    }

	 public static String processString(String input) {
	        String[] words = input.split("\\s+");
	        int vowelCount = 0;
	        StringBuilder result = new StringBuilder();

	        for (String word : words) {
	            if (word.equalsIgnoreCase("score")) {
	                result.append("_ "); //we can use + or concat =append 
	            } else {
	                String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	                result.append(capitalized).append(" ");

	                // Count vowels
	                for (char c : word.toLowerCase().toCharArray()) {
	                    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
	                        vowelCount++;
	                    }
	                }
	            }
	        }

	        System.out.println("Vowel count: " + vowelCount);
	        return result.toString().trim();
	    }
	 
}



