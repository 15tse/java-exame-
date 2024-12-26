package JDS;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample2 {
	 public static void main(String[] args) {
	        // Create an ArrayList
	        ArrayList<String> fruits = new ArrayList<>();

	        // Add elements to the ArrayList
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");
	        fruits.add("Date");

	        // Print the ArrayList
	        System.out.println("Fruits: " + fruits);

	        // Iterate using a for loop
	        System.out.println("Iterating using a for loop:");
	        for (int i = 0; i < fruits.size(); i++) {
	            System.out.println(fruits.get(i));
	        }

	        // Iterate using an enhanced for loop
	        System.out.println("Iterating using an enhanced for loop:");
	        for (String fruit : fruits) {
	            System.out.println(fruit);
	        }
	        // Iterate using an Iterator
	        System.out.println("Iterating using an Iterator:");
	        Iterator<String> iterator = fruits.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

}
