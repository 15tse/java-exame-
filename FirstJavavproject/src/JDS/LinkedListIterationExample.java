package JDS;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIterationExample {
	 public static void main(String[] args) {
	        // Create a LinkedList
	        LinkedList<String> countries = new LinkedList<>();

	        // Add elements to the LinkedList
	        countries.add("USA");
	        countries.add("Canada");
	        countries.add("Mexico");
	        countries.add("Germany");
	        countries.add("France");

	        // Print the LinkedList
	        System.out.println("Countries: " + countries);

	        // Iterate using a for loop
	        System.out.println("Iterating using a for loop:");
	        for (int i = 0; i < countries.size(); i++) {
	            System.out.println(countries.get(i));
	        }

	        // Iterate using an enhanced for loop
	        System.out.println("Iterating using an enhanced for loop:");
	        for (String country : countries) {
	            System.out.println(country);
	        }
	        // Iterate using an Iterator
	        System.out.println("Iterating using an Iterator:");
	        for (Iterator<String> iterator = countries.iterator(); iterator.hasNext();) {
	            System.out.println(iterator.next());
	        }

	        // Iterate using a while loop
	        System.out.println("Iterating using a while loop:");
	        int index = 0;
	        while (index < countries.size()) {
	            System.out.println(countries.get(index));
	            index++;
	        }
	    }


}
