package ControlStatment;
import java.util.Scanner;
public class Leapyear {
	//Here's a Java code snippet that asks the user to enter a year and checks whether it's a leap year or not:


		

	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a year: ");
		        int year = scanner.nextInt();

		        boolean isLeapYear = isLeapYear(year);

		        if (isLeapYear) {
		            System.out.println(year + " is a leap year.");
		        } else {
		            System.out.println(year + " is not a leap year.");
		        }
		    }

		    public static boolean isLeapYear(int year) {
		        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		    }
		}


		/*This code:

		1. Prompts the user to enter a year.
		2. Calls the isLeapYear method with the input year.
		3. If the year is a leap year, it returns true.
		4. If the year is not a leap year, it returns false.
		5. Displays whether the year is a leap year or not.

		The isLeapYear method uses the following rules to determine if a year is a leap year:

		- The year must be evenly divisible by 4.
		- If the year is a century year (i.e., it's divisible by 100), it must also be divisible by 400.

		Run this code and enter a year to see if it's a leap year!

}*/
