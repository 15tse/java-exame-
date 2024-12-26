package secondEX;

public class Sweep {

		  public static void main(String[] args) {
		    // Declare and initialize two integer variables
		    int num1 = 10;
		    int num2 = 20;
            char ch1='a';
            char ch2='b';
            String s1="zeferu";
            String s2="zoyo";
            String s3=s1;
            s1=s2;
            s2=s3;
            char ch3=ch1;
            ch1=ch2;
            ch2=ch3;
            System.out.println( "s1 =" + s1);
            System.out.println( "s2 =" + s2);
            System.out.println( "ch1 =" + ch1);
            System.out.println("ch2 ="+ ch2);
		    System.out.println("Before swapping:");
		    System.out.println("num1 = " + num1);
		    System.out.println("num2 = " + num2);

		    // Swap their values without using a third variable
		    
		    num1 = num1 + num2; // num1 now holds the sum of both values
		    num2 = num1 - num2; // num2 now holds the original value of num1
		    num1 = num1 - num2; // num1 now holds the original value of num2

		    System.out.println("After swapping:");
		    System.out.println("num1 = " + num1);
		    System.out.println("num2 = " + num2);
		 }
		}

		