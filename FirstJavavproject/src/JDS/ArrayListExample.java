package JDS;
import java.util.ArrayList;

import methods.stringmanpulator;

public class ArrayListExample {
	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        // Add elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("orange");

        // Print the list
        System.out.println(list);

        // Get an element
        String fruit = list.get(3);
        System.out.println(fruit);
        
		String fruit1=list.get(0);
		System.out.println(fruit1);

        // Set an element
        list.set(0, "Date");
        System.out.println(list);
        list.set(2, fruit1);
        System.out.println(list);

        // Remove an element
        list.remove(0);
        System.out.println(list);
        
        // Check if the list contains an element
        boolean hasApple = list.contains("abc");
        System.out.println(hasApple);
        boolean hasOrange = list.contains("orange");
        System.out.println(hasOrange);

        // Get the index of an element
        int index = list.indexOf("Banana");
        System.out.println(index);

        // Clear the list
        list.clear();
        System.out.println(list);
        //add element to the list 
        list.add("banana");
        System.out.println(list);
        
        //check if the list contain an element 
        boolean hasBanana=list.contains("banana");
        System.out.println(hasBanana);

	}

}
