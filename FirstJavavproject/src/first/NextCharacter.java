package first;
import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
    	 char ch='b';
         System.out.println(ch+1);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);
       
        char nextChar = (char) (input + 1);

        System.out.println("Next character: " + nextChar);
   }


}