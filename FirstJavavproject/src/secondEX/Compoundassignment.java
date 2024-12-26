package secondEX;

public class Compoundassignment {
	  public static void main(String[] args) {
		    // Declare an integer variable with an initial value
		    int value = 10;

		    // Print the initial value
		    System.out.println("Initial value: " + value);

		    // Use compound assignment operators to increase the value incrementally
		    value += 5; // equivalent to value = value + 5
		    System.out.println("After += 5: " + value);

		    value -= 3; // equivalent to value = value - 3
		    System.out.println("After -= 3: " + value);
  
		    value *= 2; // equivalent to value = value * 2
		    System.out.println("After *= 2: " + value);

		    value /= 4; // equivalent to value = value / 4
		    System.out.println("After /= 4: " + value);

		    value %= 3; // equivalent to value = value % 3
		    System.out.println("After %= 3: " + value);
		 }


}
