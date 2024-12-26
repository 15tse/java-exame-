package array;
import java.util.Arrays;
public class margetwoarray {
	  public static void main(String[] args) {
	        int[] arr1 = {1, 2, 3};
	        int[] arr2 = {4, 5, 6};
//It creates a new integer array result with a length equal 
	        //to the sum of the lengths of arr1 and arr2.

	        int[] result = new int[arr1.length + arr2.length];
//
	        int i = 0;
	        for (int element : arr1) {//This is an enhanced for loop
	            result[i++] = element;
	        }

	        for (int element : arr2) {
	            result[i++] = element;
	        }

	        System.out.println(Arrays.toString(result)); // [1, 2, 3, 4, 5, 6]
	    }


}
/*
 * - arr1 is {1, 2, 3}
- result is an empty array of length 6
- i is 0
- Iteration 1:
    - element is 1
    - result[0] = 1
    - i becomes 1
- Iteration 2:
    - element is 2
    - result[1] = 2
    - i becomes 2
- Iteration 3:
    - element is 3
    - result[2] = 3
    - i becomes 3
*/
 