package methods;

public class factorialrecursion {
	 public static void main(String[] args) {
	        int number = -20;
	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }

	    public static long calculateFactorial(int n) {
	    	if (n<0) {
	    	
	    	 throw new ArithmeticException("Factorial is not defined for negative numbers");
	    		
	    	} else
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            return n * calculateFactorial(n - 1);
	        }
	    }

}
