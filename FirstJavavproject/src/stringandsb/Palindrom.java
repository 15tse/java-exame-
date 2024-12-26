package stringandsb;
import java.lang.String;
public class Palindrom {
	 public static void main(String[] args) {
	        String str = "madam";
	        System.out.println(isPalindrome(str));  // Outputs: true
	    }

	    public static boolean isPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

}

/* explanation 
 * step -1
   int left and right are index of string to access the string character at every index 
   from both side (by str.charAt index )
  *step-2
  check if they have same chr from both side if not return false 
  step -3 check every single chr by l++ and r--
  step -4 return true if they are palindrome. 
   
 */
