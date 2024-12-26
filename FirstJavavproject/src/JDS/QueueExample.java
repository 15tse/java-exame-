package JDS;
import java.util.Queue;
import java.util.Iterator;
import java.util.LinkedList;

// queue is first in first out (FIFO) 
public class QueueExample {
	  public static void main(String[] args) {
	        // Create a Queue
	        Queue<String> queue = new LinkedList<>();

	        // Add elements to the Queue
	        queue.add("Element1");
	        queue.add("Element2");
	        queue.add("Element3");
	        queue.add("Element4");
	        queue.add("Element5");

	        // Print the Queue
	        System.out.println("Queue: " + queue);

	        // Remove elements from the Queue
	        
	        System.out.println("Removed: " + queue.poll());
	        System.out.println("Removed: " + queue.poll());
	        System.out.println("Removed: " + queue.poll());

	        // Print the Queue after removing elements
	        System.out.println("Queue after removing: " + queue);

	        // Check if the Queue is empty
	        System.out.println("Is empty? " + queue.isEmpty());

	        // Iterate using a for loop
	        System.out.println("Iterating using a for loop:");
	        for (String element : queue) {
	            System.out.println(element);
	        }    // Iterate using an Iterator
	        System.out.println("Iterating using an Iterator:");
	        for ( Iterator<String> iterator = queue.iterator(); iterator.hasNext();) {
	            System.out.println(iterator.next());
	        }
	    }



}
