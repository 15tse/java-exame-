package oprerators;

public class IncrementDecrementOperators {
	 public static void main(String[] args) {
	        int x = 5;

	        // Post-increment
	        System.out.println("Post-increment: x = " + x++); // prints 5
	        System.out.println("x after post-increment: " + x); // prints 6

	        // Pre-increment
	        System.out.println("Pre-increment: x = " + ++x); // prints 7
	        System.out.println("x after pre-increment: " + x); // prints 7

	        // Post-decrement
	        System.out.println("Post-decrement: x = " + x--); // prints 7
	        System.out.println("x after post-decrement: " + x); // prints 6

	        // Pre-decrement
	        System.out.println("Pre-decrement: x = " + --x); // prints 5
	        System.out.println("x after pre-decrement: " + x); // prints 5
	    }


}
