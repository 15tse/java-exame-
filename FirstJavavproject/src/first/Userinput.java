package first;
import java.util.Scanner;


public class Userinput {
	 public static void main(String[] args) {
		    // Create a Scanner object to read input from the user
		    Scanner scanner = new Scanner(System.in);

		    // Prompt the user to enter a string
		    System.out.print("Enter a string: ");

		    // Read the input string from the user and store it in a variable
		    String inputString = scanner.nextLine();

		    // Print out the input string
		    System.out.println("You entered: " + inputString);
		 }
		}



