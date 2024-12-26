package ControlStatment;
import java.util.Scanner;
public class Traficsimulation {
	//Here's a Java code snippet that asks the user for a traffic light color and displays the corresponding instructions:


	

	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter traffic light color (red/yellow/green): ");
	        String color = scanner.next().toLowerCase();

	        String instruction = getInstruction(color);

	        if (instruction == null) {
	            System.out.println("Error: Invalid color. Please enter red, yellow, or green.");
	        } else {
	            System.out.println("Color: " + color + ", Instruction: " + instruction);
	        }
	    }

	    public static String getInstruction(String color) {
	        switch (color) {
	            case "red":
	                return "Stop!";
	            case "yellow":
	                return "Caution, prepare to stop!";
	            case "green":
	                return "Go!";
	            default:
	                return null;
	        }
	    }
	}


	/*This code:

	1. Prompts the user to enter a traffic light color (red, yellow, or green).
	2. Calls the getInstruction method with the input color.
	3. If the color is valid, it returns the corresponding instruction.
	4. If the color is invalid, it returns null.
	5. Displays the color and instruction or an error message accordingly.

	Here are the instructions for each color:

	- Red: Stop!
	- Yellow: Caution, prepare to stop!
	- Green: Go!

	Run this code and enter a traffic light color to see the corresponding instruction!

}*/
