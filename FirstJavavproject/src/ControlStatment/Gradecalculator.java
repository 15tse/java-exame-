package ControlStatment;
import java.util.Scanner;
public class Gradecalculator {
	//Here's a Java code snippet that takes a score as input and calculates the corresponding grade:

 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter score (0-100): ");
	        int score = scanner.nextInt();

	        String grade = getGrade(score);

	        if (grade == null) { //mean it doesn't reference any object 
	            System.out.println("Error: Score must be between 0 and 100.");
	        } else {
	            System.out.println("Score: " + score + ", Grade: " + grade);
	        }
	    }

	    public static String getGrade(int score) {
	        if (score >= 90 && score<=100 ) {
	            return "A";
	        } else if (score >= 80 && score<=89) {
	            return "B";
	        } else if (score >= 70 && score<=79) {
	            return "C";
	        } else if (score >= 60 && score<=59) {
	            return "D";
	        } else if (score <= 0) {
	            return "F";
	        } else {
	            return null;
	        }
	    }
	}



