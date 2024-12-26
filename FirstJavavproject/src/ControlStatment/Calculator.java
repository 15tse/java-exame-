package ControlStatment;
import java.util.Scanner;

public class Calculator {
	//Here's a simple Java calculator code that performs basic arithmetic operations:
     
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Simple Calculator");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        System.out.print("Choose an operation (1-4): ");
	        int choice = scanner.nextInt();

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = num1 + num2;
	                break;
	            case 2:
	                result = num1 - num2;
	                break;
	            case 3:
	                result = num1 * num2;
	                break;
	            case 4:
	                if (num2 != 0) {
	                    result = num1 / num2;
	                } else {
	                    System.out.println("Error: Division by zero!");
	                    return;
	                }
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        System.out.printf("Result: %.2f\n", result);
	    }
	}


/*	This code:

	1. Asks the user to choose an operation (1-4).
	2. Prompts the user to enter two numbers.
	3. Performs the chosen operation and stores the result.
	4. Displays the result with two decimal places.

	Feel free to run this code and use the calculator!
}*/
