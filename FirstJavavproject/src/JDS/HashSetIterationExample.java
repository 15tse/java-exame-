package JDS;
import java.util.HashSet;
import java.util.Iterator;


public class HashSetIterationExample {
	public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> colors = new HashSet<>();

        // Add elements to the HashSet
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Iterate using a for-each loop
        System.out.println("Iterating using a for-each loop:");
        for (String color : colors) {
            System.out.println(color);
        }

        // Iterate using an Iterator
        System.out.println("Iterating using an Iterator:");
        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
 

}
