package ControlStatment;
import java.util.Scanner;
public class Smallestnumber {
	//Here is a Java program that takes three numbers as input, determines the smallest number, and displays it:


	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the first number: ");
		        int num1 = scanner.nextInt();

		        System.out.print("Enter the second number: ");
		        int num2 = scanner.nextInt();

		        System.out.print("Enter the third number: ");
		        int num3 = scanner.nextInt();

		        int smallest = findSmallest(num1, num2, num3);

		        System.out.println("The smallest number is: " + smallest);
		    }

		    public static int findSmallest(int num1, int num2, int num3) {
		        if (num1 <= num2 && num1 <= num3) {
		            return num1;
		        } else if (num2 <= num1 && num2 <= num3) {
		            return num2;
		        } else {
		            return num3;
		        }
		    }
		}


	/*	Here's how the program works:

		1. The program prompts the user to enter three numbers.
		2. The input numbers are stored in the variables num1, num2, and num3.
		3. The program calls the findSmallest method with the three numbers.
		4. The findSmallest method compares the numbers and returns the smallest one.
		5. The program prints the smallest number.

		Run this program, enter three numbers, and it will display the smallest one!


}*/
