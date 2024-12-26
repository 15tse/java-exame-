package myexcers;

public class fpalindrom {
public static void main(String[] args) {
	String str="madam";
	boolean ispalindrome=isPalindrome(str);
	System.out.println(str +" is palindrom? " + ispalindrome );
}
public static boolean isPalindrome(String str) {
    int left=0;
    int right = str.length() - 1;
      
     while(left<right) {
    	if(str.charAt(left)!=str.charAt(right)) {
    		return false;
    	}
    	left++;
    	right--;
    	{
    		return true;
    	}
    }
	return false;
}
} 

