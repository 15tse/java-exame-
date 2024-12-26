package stringandsb;
import java.lang.String;
public class Anagrams {
	  public static void main(String[] args) {
	        String str1 = "LIS     	  TEN ";
	        String str2 = "silent";
	        System.out.println(areAnagrams(str1, str2));  // Outputs: true
	    }

	    public static boolean areAnagrams(String str1, String str2) {
	       // Remove all white spaces and convert to lower case
	    	str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();   

	        // Check if both strings have the same length
	        if (str1.length() != str2.length()) {
	            return false;
	        }

	        // Sort both strings and compare
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        java.util.Arrays.sort(charArray1);
	        java.util.Arrays.sort(charArray2);
	        return java.util.Arrays.equals(charArray1, charArray2);
	    }


	

}
/* explanation 

 -convert to lower case  
 NB:"\\s": This is a regular expression that matches 
 any whitespace character (space, tab, newline, etc.).
   "": This is the replacement value, which is an empty string. 
 So, all whitespace characters are replaced with nothing, effectively removing them.

 -check length 
 -sort and compare
 
 
 */