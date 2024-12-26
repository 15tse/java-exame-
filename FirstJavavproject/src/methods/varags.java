package methods;

public class varags {
	   public static void main(String[] args) {
	        printSum(1, 2, 3, 4, 5);
	        printSum(10, 20, 30);
	        printSum(5, 5, 5, 5);
	    }

	    public static void printSum(int... numbers) {
	        int sum = 0;
	        for (int number : numbers) {
	            sum += number;
	        }
	        System.out.println("Sum: " + sum);
	    }

}
