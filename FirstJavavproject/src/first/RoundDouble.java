package first;

import java.util.Scanner;

public class RoundDouble {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);

         System.out.print("Enter a double value: ");
         double input = scanner.nextDouble();

         // Truncation (cut off decimal part)
         int truncated = (int) input;
         System.out.println("Truncated: " + truncated);
        
         // Normal Rounding (round to nearest integer)
         int ro = (int) Math.round(input);
        System.out.println("Rounded: " + ro);
        
    }


}
