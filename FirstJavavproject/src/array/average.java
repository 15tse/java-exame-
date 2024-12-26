package array;

import java.util.Arrays;

public class average {
	public static void main(String[] args) {
		
	
	  int[] arr = {3, 10, 3, 4, 5};
	  System.out.println("Original array: "+ Arrays.toString(arr));
      int sum=0;
     
      for (int i=0; i< arr.length ; i++) {
    	  sum+= arr[i];
    	  
      }
         double average=sum/arr.length;
         System.out.println("Average :" + average);
  
    
      }
	
    }
  

