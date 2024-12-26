package ControlStatment;
import java.util.Scanner;

public class Discount {
//	Here is a Java program that calculates the total bill amount, applies the discount based on the conditions, and displays the final amount after discount:

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter the total bill amount: ");
		        double billAmount = scanner.nextDouble();

		        double discount = getDiscount(billAmount);
		        double finalAmount = billAmount - (billAmount * discount / 100);

		        System.out.println("Total Bill Amount: " + billAmount);
		        System.out.println("Discount: " + discount + "%");
		        System.out.println("Final Amount after discount: " + finalAmount);
		    }

		    public static double getDiscount(double billAmount) {
		        if (billAmount > 500) {
		            return 20;
		        } else if (billAmount > 200 && billAmount <= 500) {
		            return 10;
		        } else {
		            return 0;
		        }
		    }
		}


		/*Here's how the program works:

		1. The program prompts the user to enter the total bill amount.
		2. The input bill amount is stored in the variable billAmount.
		3. The program calls the getDiscount method with the bill amount.
		4. The getDiscount method checks the conditions and returns the discount percentage.
		5. The program calculates the final amount after discount by subtracting the discount from the bill amount.
		6. The program prints the total bill amount, discount percentage, and final amount after discount.

		Run this program, enter the total bill amount, and it will display the final amount after discount!
}*/
