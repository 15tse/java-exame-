package stringandsb;
import java.lang.String;
public class Reverse {
	  public static void main(String[] args) {
	        String originalString = "Hello World!";
	        String reversedString = reverseString(originalString);
	        System.out.println("Original String: " + originalString);
	        System.out.println("Reversed String: " + reversedString);
	    }

	   public static String reverseString(String str) {
	        StringBuilder sb = new StringBuilder(str);
	        return sb.reverse().toString();
	   }
	   


}
/* MY EXPLANATION 
 line 12=> new StringBuilder(): Creates a new StringBuilder object.
     (str): Initializes the StringBuilder object with the contents of the string str.
     So, sb now contains the same characters as str.


=> the entire line of code sb.reverse().toString() 
 takes the original string, reverses it, and returns the reversed string.
=>
 */
/*there is no reverse 
in string so we have to convert first to string buliber and then to string.*/