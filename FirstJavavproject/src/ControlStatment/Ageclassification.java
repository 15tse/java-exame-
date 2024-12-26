package ControlStatment;

import java.util.Scanner;

public class Ageclassification {
	//Here is a Java program that asks the user to enter their age and classifies and displays the age group:

   public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter your age: ");
		        int age = scanner.nextInt();

		        String ageGroup = getAgeGroup(age);

		        System.out.println("You are a " + ageGroup + ".");
		    }

		    public static String getAgeGroup(int age) {
		        if (age >= 0 && age <= 12) {
		            return "child";
		        } else if (age >= 13 && age <= 19) {
		            return "teenager";
		        } else if (age >= 20 && age <= 59) {
		            return "adult";
		        } else if (age >= 60) {
		            return "senior";
		        } else {
		            return "invalid age";
		        }
		    }
		}


	/*	Here's how the program works:

		1. The program prompts the user to enter their age.
		2. The input age is stored in the variable age.
		3. The program calls the getAgeGroup method with the input age.
		4. The getAgeGroup method checks the age range and returns the corresponding age group as a string.
		5. The program prints the age group.

		The age groups are classified as follows:

		- Child: 0-12 years old
		- Teenager: 13-19 years old
		- Adult: 20-59 years old
		- Senior: 60 years old and above

		Run this program, enter your age, and it will tell you which age group you belong to!

}*/
