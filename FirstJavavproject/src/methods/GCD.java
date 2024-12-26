package methods;

public class GCD {
	public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else {
            return findGCD(num2, num1 % num2);//(18,48%18=12)=>(18,12)=>>(18,18/12)=>(18,6) SO min of (18,6)=>6
        }
    }
	 public static void main(String[] args) {
	        int num1 = 40;
	        int num2 = 15;
	        int gcd = GCD.findGCD(num1, num2);
	        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
	    }

}
