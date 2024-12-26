package methods;

public class palindrom {
	  public static void main(String[] args) {
	        String str = "dad";
	        boolean isPalindrome = isPalindrome(str);
	        System.out.println(str + " is a palindrome: " + isPalindrome);
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
