package JDS;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;


public class TreeMapIterationExample {
	public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> ages = new TreeMap<>();

        // Put elements into the TreeMap
        ages.put("John", 25);
        ages.put("Alice", 30);
        ages.put("Bob", 20);
        ages.put("Charlie", 35);

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
