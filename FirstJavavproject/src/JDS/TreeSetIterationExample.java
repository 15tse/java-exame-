package JDS;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetIterationExample {
	public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<String> colors = new TreeSet<>();

        // Add elements to the TreeSet
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
        // Iterate using a descending Iterator
        System.out.println("Iterating using a descending Iterator:");
        Iterator<String> descendingIterator = colors.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }
    }


}
