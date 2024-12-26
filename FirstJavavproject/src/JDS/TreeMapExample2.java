package JDS;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample2 {
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

	        // Get the first key
	        System.out.println("First key: " + ages.firstKey());

	        // Get the last key
	        System.out.println("Last key: " + ages.lastKey());

	        // Get the key-value pair with the lowest key
	        System.out.println("Lowest entry: " + ages.firstEntry());

	        // Get the key-value pair with the highest key
	        System.out.println("Highest entry: " + ages.lastEntry());

	        // Remove an element
	        ages.remove("Bob");
	        System.out.println("Ages after removing Bob: " + ages);
	        // Check if the TreeMap contains a key
	        System.out.println("Contains Alice? " + ages.containsKey("Alice"));

	        // Check if the TreeMap contains a value
	        System.out.println("Contains age 20? " + ages.containsValue(20));

	        // Iterate over the TreeMap entries
	        System.out.println("Iterating over entries:");
	        for (Map.Entry<String, Integer> entry : ages.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	        // Iterate over the TreeMap keys
	        System.out.println("Iterating over keys:");
	        Iterator<String> keyIterator = ages.keySet().iterator();
	        while (keyIterator.hasNext()) {
	            String key = keyIterator.next();
	            System.out.println(key);
	        }

	        // Iterate over the TreeMap values
	        System.out.println("Iterating over values:");
	        Iterator<Integer> valueIterator = ages.values().iterator();
	        while (valueIterator.hasNext()) {
	            int value = valueIterator.next();
	            System.out.println(value);
	        }
	    }

}
