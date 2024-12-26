package first;
import java.util.Scanner;

public class Greeting {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your name: ");
	        String name = scanner.nextLine();

	        int length = name.length();

	        System.out.println("Hello, " + name + "!");
	        System.out.println("Your name has " + length + " letters.");
	   }


}
