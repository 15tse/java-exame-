package JDS;

import java.util.HashSet;

public class HashSetExample {
	 public static void main(String[] args) {
	        // Create a HashSet
	        HashSet<String> colors = new HashSet<>();

	        // Add elements to the HashSet
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the HashSet
	        System.out.println("Colors: " + colors);

	        // Check if the HashSet contains an element
	        System.out.println("Contains Green? " + colors.contains("Green"));

	        // Remove an element from the HashSet
	        colors.remove("Blue");
	        System.out.println("Colors after removing Blue: " + colors);

	        // Iterate over the HashSet
	        System.out.println("Iterating over colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	    }

}
