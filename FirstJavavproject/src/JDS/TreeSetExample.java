package JDS;
import java.util.TreeSet;


public class TreeSetExample {
	 public static void main(String[] args) {
	        // Create a TreeSet
	        TreeSet<String> colors = new TreeSet<>();

	        // Add elements to the TreeSet
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("Purple");

	        // Print the TreeSet
	        System.out.println("Colors: " + colors);

	        // Check if the TreeSet contains an element
	        System.out.println("Contains Green? " + colors.contains("Green"));

	        // Remove an element from the TreeSet
	        colors.remove("Blue");
	        System.out.println("Colors after removing Blue: " + colors);

	        // Get the first element in the TreeSet
	        System.out.println("First element: " + colors.first());

	        // Get the last element in the TreeSet
	        System.out.println("Last element: " + colors.last());

	        // Iterate over the TreeSet
	        System.out.println("Iterating over colors:");
	        for (String color : colors) {
	            System.out.println(color);
	        }
	 }

}
