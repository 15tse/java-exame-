package array;

public class removedeplic {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 2, 3, 4, 4, 5, 6, 6};

	        // Create a new array to store unique elements
	        int[] uniqueArr = new int[arr.length];
	        int j = 0;

	        // Iterate through the original array
	        for (int i = 0; i < arr.length; i++) {
	            // Check if the element is already in the unique array
	            boolean isDuplicate = false;
	            for (int k = 0; k < j; k++) {
	                if (arr[i] == uniqueArr[k]) {
	                    isDuplicate = true;
	                    break;
	                }
	            }

	            // If not a duplicate, add to unique array
	            if (!isDuplicate) {
	                uniqueArr[j++] = arr[i];
	            }
	        }

	        // Print the unique array
	        for (int i = 0; i < j; i++) {
	            System.out.print(uniqueArr[i] + " ");
	        }
	    }


}
