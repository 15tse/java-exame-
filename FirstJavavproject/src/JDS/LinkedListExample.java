package JDS;
import java.util.LinkedList;
public class LinkedListExample {
	   public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<String> colors = new LinkedList<>();

	        // Add elements to the LinkedList
	        colors.add("Red");
	        colors.add("Green");
	        colors.add("Blue");
	        colors.add("Yellow");
	        colors.add("white");

	        // Print the LinkedList
	        System.out.println("Colors: " + colors);

	        // Add an  element at the beginning
	        colors.addFirst("Purple");
	        System.out.println("After adding Purple at the beginning: " + colors);

	        // Add an element at the end
	        colors.addLast("Orange");
	        System.out.println("After adding Orange at the end: " + colors);

	        // Remove the first element
	        colors.removeFirst();
	        System.out.println("After removing the first element: " + colors);
	     // Remove the last element
	        colors.removeLast();
	        System.out.println("After removing the last element: " + colors);

	        // Get the first element
	        System.out.println("First element: " + colors.getFirst());

	        // Get the last element
	        System.out.println("Last element: " + colors.getLast());

	        // Check if the LinkedList contains an element
	        System.out.println("Contains Green: " + colors.contains("Green"));
	    }


}
