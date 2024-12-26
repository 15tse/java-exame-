package array;

public class minmax {

		 public static void main(String[] args) {
		        int[] numbers = {12, 45, 7, 23, 56, 79, 34};

		  int max=numbers[0];
		  int min=numbers[0];
		  for (int i=1; i < numbers.length ; i++) {
			  if (numbers[i] > max) {
				  max=numbers[i];
			  }if (numbers[i] < min ) {
				  min=numbers[i];
			  }
		  }
		   System.out.println("maximum number is :" + max);
		   System.out.println("minimum number is :" + min);
		 }


		
	}


