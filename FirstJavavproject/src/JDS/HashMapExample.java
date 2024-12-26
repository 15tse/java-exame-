package JDS;
import java.util.HashMap;
import java.util.Map;


public class HashMapExample {
	   public static void main(String[] args) {
	        // Create a HashMap
	        HashMap<String, Integer> ages = new HashMap<>();

	        // Put elements into the HashMap
	        ages.put("John", 25);
	        ages.put("Alice", 30);
	        ages.put("Bob", 20);
	        ages.put("Charlie", 35);

	        // Print the HashMap
	        System.out.println("Ages: " + ages);

	        // Get an element from the HashMap
	        System.out.println("John's age: " + ages.get("John"));

	        // Check if the HashMap contains a key
	        System.out.println("Contains Alice? " + ages.containsKey("Alice"));

	        // Check if the HashMap contains a value
	        System.out.println("Contains age 20? " + ages.containsValue(20));

	        // Remove an element from the HashMap
	        ages.remove("Bob");
	        System.out.println("Ages after removing Bob: " + ages);

	        // Iterate over the HashMap entries
	        System.out.println("Iterating over entries:");
	        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        // Iterate over the HashMap keys
	        System.out.println("Iterating over keys:");
	        for (String key : ages.keySet()) {
	            System.out.println(key);
	        }

	        // Iterate over the HashMap values
	        System.out.println("Iterating over values:");
	        for (Integer value : ages.values()) {
	            System.out.println(value);
	        }
	    }


}
