package methods;


public class calculator {
	 public static void main(String[] args) {
		 double num1=10;
		 double num2=15;
		 double result = multiplay(num1,num2);
		 System.out.println("result=" + result);
		 
	 }
	    public static double add(double num1, double num2){
	    	return num1 + num1;  
	    }   
	    public static double substract(double num1, double num2){
	    	return num2 - num1;  
	    } 
	    public static double multiplay(double num1, double num2){
	    	return num1 * num2;  
	    }
	    public static double divide(double num1, double num2){
	    	return num2 / num1;  
	    }
	    
	    
	    }


