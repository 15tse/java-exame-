package myexcers;

public class ffactorial {
	public static void main(String[] args) {
		int number=11;
		double output =ffactorial.factor(number);
				System.out.println("facterial of " + number +" is " + output);
	}
public static double factor(int n) {
	  long result = 1;
      for (int i = 2; i <= n; i++) {
          result *= i;
      }
      return result;
  }


}

