package Jdsalgorithm;

import java.util.HashSet;

public class FindFirstDuplicate {
	 public static int findFirstDuplicate(int[] arr) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr) {
	            if (!set.add(num)) {
	                return num;
	            }
	        }
	        return -1; // no duplicate found
	    }

	    public static void main(String[] args) {
	        int[] arr = {1,1,1, 2, 2,3, 4, 2, 5, 6};
	        int duplicate = findFirstDuplicate(arr);
	        System.out.println("First duplicate: " + duplicate);
	    }


}
