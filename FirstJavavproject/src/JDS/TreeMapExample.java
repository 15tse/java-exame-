package JDS;
import java.util.Iterator;
import java.util.TreeMap;


public class TreeMapExample {
	 public static void main(String[] args) {
	        // Create a TreeMap
	        TreeMap<String, Integer> ages = new TreeMap<>();

	        // Put elements into the TreeMap
	        ages.put("John", 25);
	        ages.put("Alice", 30);
	        ages.put("Bob", 20);
	        ages.put("Charlie", 35);

	        // Print the TreeMap
	        System.out.println("Ages: " + ages);

	        // Get an element from the TreeMap
	        System.out.println("John's age: " + ages.get("John"));

	        // Check if the TreeMap contains a key
	        System.out.println("Contains Alice? " + ages.containsKey("Alice"));

	        // Check if the TreeMap contains a value
	        System.out.println("Contains age 20? " + ages.containsValue(20));

	        // Iterate using a for loop
	        System.out.println("Iterating using a for loop:");
	        for (String name : ages.keySet()) {
	            System.out.println(name + ": " + ages.get(name));
	        }
	        // Iterate using an Iterator
	        System.out.println("Iterating using an Iterator:");
	        for (Iterator<String> iterator = ages.keySet().iterator(); iterator.hasNext();) {
	            String name = iterator.next();
	            System.out.println(name + ": " + ages.get(name));
	        }
	    }



}
