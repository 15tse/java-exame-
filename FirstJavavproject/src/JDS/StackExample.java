package JDS;
import java.util.Iterator;
import java.util.Stack;


public class StackExample {
	 public static void main(String[] args) {
		 // it is last in first out (LIFO)
	        // Create a Stack
	        Stack<String> books = new Stack<>();

	        // Push elements onto the Stack
	        books.push("Book1");
	        books.push("Book2");
	        books.push("Book3");
	        books.push("Book4");
	        books.push("Book5");

	        // Print the Stack
	        System.out.println("Books: " + books);

	        // Pop elements from the Stack
	        System.out.println("Popped: " + books.pop());
	        System.out.println("Popped: " + books.pop());

	        // Print the Stack after popping
	        System.out.println("Books after popping: " + books);

	        // Check if the Stack is empty
	        System.out.println("Is empty? " + books.isEmpty());

	        // Iterate using a for loop
	        System.out.println("Iterating using a for loop:");
	        for (int i = 0; i < books.size(); i++) {
	            System.out.println(books.get(i));
	        }
	        // Iterate using an Iterator
	        System.out.println("Iterating using an Iterator:");
	        for (Iterator<String> iterator = books.iterator(); iterator.hasNext();) {
	            System.out.println(iterator.next());
	        }
	    }


}
