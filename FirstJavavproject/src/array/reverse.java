package array;
import java.util.Arrays;

public class reverse {
  
	  public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};//[0,1,2,3,4]
	        System.out.println("Original array: " + Arrays.toString(arr));
	        
	        int left = 0;
	        int right = arr.length - 1;// [4]
	        while (left < right) {
	            int temp = arr[left];// temporary variable  d=l
	            arr[left] = arr[right];// l=r
	            arr[right] = temp;// r=d but d=l;
	            left++;
	            right--;
	        }
	        
	        System.out.println("Reversed array: " + Arrays.toString(arr));
	    }

}


