package ControlStatment;
import java.util.Scanner;
public class Vowelconsonant {
	//Here is a Java program that takes a single character input and checks if it is a vowel or consonant, handling both uppercase and lowercase:


		

		
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a character: ");
		        char ch = scanner.next().charAt(0);

		        if (isVowel(ch)) {
		            System.out.println(ch + " is a vowel.");
		        } else if (Character.isLetter(ch)) {
		            System.out.println(ch + " is a consonant.");
		        } else {
		            System.out.println("Invalid input. Please enter a letter.");
		        }
		    }

		    public static boolean isVowel(char ch) {
		        String vowels = "aeiouAEIOU";
		        return vowels.indexOf(ch) != -1;
		    }
		}


		/*Here's how the program works:

		1. The program prompts the user to enter a character.
		2. The input character is stored in the variable ch.
		3. The program checks if ch is a vowel by calling the isVowel method.
		4. If ch is a vowel, the program prints that it is a vowel.
		5. If ch is not a vowel but is a letter (checked using Character.isLetter), the program prints that it is a consonant.
		6. If ch is not a letter, the program prints an error message.

		The isVowel method checks if a character is a vowel by seeing if it is present in the string "aeiouAEIOU". If it is, the method returns true; otherwise, it returns false.

		Run this program, enter a character, and it will tell you whether it is a vowel or consonant!

}*/
