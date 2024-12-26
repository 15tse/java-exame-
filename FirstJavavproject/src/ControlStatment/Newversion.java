package ControlStatment;

public class Newversion {
	//Here is an example of a Java program that calculates a grade based on a score, using the latest Java version (Java 17):

	
		    public static void main(String[] args) {
		        int score = 0;
		        String grade = getGrade(score);
		        System.out.println("Grade: " + grade);
		    }

		    public static String getGrade(int score) {
		        return switch (score / 10) {
		            case 9,10 -> "A";
		            case 8 -> "B";
		            case 7 -> "C";
		            case 6 -> "D";
		            case 5,4,3,2,1,0 -> "F";
		            default -> "enter the valued score";
		        };
		    }
		}

		