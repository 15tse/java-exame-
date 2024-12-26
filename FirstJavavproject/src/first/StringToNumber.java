package first;
import java.util.Scanner;

public class StringToNumber {

	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a numerical string: ");
	        String input = scanner.next();

	        try {
	            int intValue = Integer.parseInt(input);
	            System.out.println("Input is an integer: " + intValue);
	        } catch (NumberFormatException e) {
	            try {
	                float floatValue = Float.parseFloat(input);
	                System.out.println("Input is a float: " + floatValue);
	            } catch (NumberFormatException e2) {
	                System.out.println("Input is not a valid number");
	            }
	        }
	  }
}



