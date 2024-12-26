package ControlStatment;
import java.util.Scanner;
public class Evenodd {
	//Here is a simple Java program that takes an integer input and checks if the number is even or odd:


		

		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter an integer: ");
		        int num = scanner.nextInt();

		        if (num % 2 == 0) {
		            System.out.println(num + " is even.");
		        } else {
		            System.out.println(num + " is odd.");
		        }
		    }
		}


	/*	Here's how the program works:

		1. The program prompts the user to enter an integer.
		2. The input integer is stored in the variable num.
		3. The program checks if num is divisible by 2 using the modulus operator (%).
		4. If num is divisible by 2 (i.e., num % 2 == 0), the program prints that the number is even.
		5. If num is not divisible by 2 (i.e., num % 2 != 0), the program prints that the number is odd.

		Run this program, enter an integer, and it will tell you whether the number is even or odd!

}*/
