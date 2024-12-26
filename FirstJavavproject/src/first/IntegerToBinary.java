package first;
import java.util.Scanner;


public class IntegerToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int input = scanner.nextInt();

        String binaryRepresentation = Integer.toBinaryString(input);

        System.out.println("Binary representation: " + binaryRepresentation);
   }

}
