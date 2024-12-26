package array;

public class majorityelement {
	  public static void main(String[] args) {
	        int[] arr = {2, 2, 1, 1, 1, 2, 2};

	        int count = 0;
	        int candidate = 0;

	        for (int num : arr) {
	            if (count == 0) {
	                candidate = num;
	                count = 1;
	            } else if (num == candidate) {
	                count++;
	            } else {
	                count--;
	            }
	        }

	        int occurrences = 0;
	        for (int num : arr) {
	            if (num == candidate) {
	                occurrences++;
	            }
	        }

	        if (occurrences > arr.length / 2) {
	            System.out.println("Majority element: " + candidate);
	        } else {
	            System.out.println("No majority element found");
	        }
	    }


}
