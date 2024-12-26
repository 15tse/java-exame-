package methods;

public class factorial {
	  public static long Factorial(int n) {
	        if (n < 0) {
	            throw new ArithmeticException("Factorial is not defined for negative numbers");
	        } else if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            long result = 1;
	            for (int i = 2; i <= n; i++) {
	                result *= i;
	            }
	            return result;
	        }
	    }


    public static void main(String[] args) {
        int number = 22;
        try {
            long result = factorial.Factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
