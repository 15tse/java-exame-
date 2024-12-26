package oprerators;
import java.util.Scanner;

public class FlipBits {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Find binary representation
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation: " + binary);

        // Flip all bits using bitwise NOT operator (~)
        int flipped = ~num;

        // Find binary representation of flipped number
        String flippedBinary = Integer.toBinaryString(flipped);
        System.out.println("Flipped binary representation: " + flippedBinary);

        scanner.close();
    }


}
