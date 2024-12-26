package oprerators;
import java.util.Scanner;

public class DivisibleBy2And3 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Check if number is divisible by 2 and 3
        boolean isDivisible = (num % 2 == 0) && (num % 3 == 0);

        if (isDivisible) {
            System.out.println(num + " is divisible by both 2 and 3");
        } else {
            System.out.println(num + " is not divisible by both 2 and 3");
        }

        scanner.close();
    }


}
