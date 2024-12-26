package first;
import java.util.Scanner;
public class CharacterType {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char input = scanner.next().charAt(0);

        if (Character.isUpperCase(input)) {
            System.out.println("Uppercase letter");
        } else if (Character.isLowerCase(input)) {
            System.out.println("Lowercase letter");
        } else if (Character.isDigit(input)) {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
   }


}
