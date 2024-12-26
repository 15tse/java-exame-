package ControlStatment;

import java.util.Scanner;

public class Dayoftheweek {
	//Here's a Java code snippet that takes a day of the week (1-7) as input and displays the corresponding day name. If the input is outside the range, it displays an error message:


	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter day of week (1-7): ");
	        int day = scanner.nextInt();

	        String dayName = getDayName(day);

	        if (dayName == null) {
	            System.out.println("Error: Day must be between 1 and 7.");
	        } else {
	            System.out.println("Day " + day + " is: " + dayName);
	        }
	    }

	    public static String getDayName(int day) {
	        switch (day) {
	            case 1:
	                return "Monday";
	            case 2:
	                return "Tuesday";
	            case 3:
	                return "Wednesday";
	            case 4:
	                return "Thursday";
	            case 5:
	                return "Friday";
	            case 6:
	                return "Saturday";
	            case 7:
	                return "Sunday";
	            default:
	                return null;
	        }
	    }
	}


	/*This code:

	1. Prompts the user to enter a day of the week (1-7).
	2. Calls the getDayName method with the input day.
	3. If the input is within the range (1-7), it returns the corresponding day name.
	4. If the input is outside the range, it returns null.
	5. Displays the day name or an error message accordingly.

	Run this code and enter a day of the week to see the corresponding day name!
	
	}*/


