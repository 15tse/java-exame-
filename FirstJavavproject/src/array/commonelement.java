package array;

public class commonelement {
	 public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3, 4, 5};//n
	        int[] arr2 = {4, 5, 6, 7, 8,9};//m
//n*m is the running time of different size array.
	        for (int element : arr1) {// loop iterates over each element in arr1
	        	//using an enhanced for loop.
	            for (int j = 0; j < arr2.length; j++) {
	                if (element == arr2[j]) {
	                    System.out.println("Common element: " + element);
	                }
	            }
	        }
	    }


}
