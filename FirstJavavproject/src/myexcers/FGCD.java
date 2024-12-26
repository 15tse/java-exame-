package myexcers;

public class FGCD {
	public static void main(String[] args) {
		int num1=100;
		int num2=40;
		long GCD=findGFD(num1,num2);
		System.out.println("gretest common division of "+ num1 +" and "+ num2 +":"+ " " + GCD );
	}
	public static long findGFD(int num1,int num2) {
		int GCD=1;

		for (int i = 2 ;i<=Math.min(num1,num2);i++)
		 {
			if (num1 % i==0 && num2 % i==0) {
			GCD=i;
		} 
		 }
		return GCD;
		
	}
}
