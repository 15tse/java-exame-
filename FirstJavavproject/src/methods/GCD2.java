package methods;

public class GCD2 {
	 public static void main(String[] args) {
	        int num1 = 40;
	        int num2 = 100;
	        int gcd = findGCD(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	    }

	    public static int findGCD(int num1, int num2) {
	        int gcd = 1;
	        for (int i = 2; i <= Math.min(num1, num2); i++) {
	            if (num1 % i == 0 && num2 % i == 0) {
	                gcd = i;
	            }
	        }
	        return gcd;
	    }


}
