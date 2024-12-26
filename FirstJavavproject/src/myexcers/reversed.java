package myexcers;

public class reversed {
	public static void main(String[] args) {
		String originalStr = "Hello";
		String reversedStr = "";

		for (int i = 0; i < originalStr.length(); i++) {
		  reversedStr = originalStr.charAt(i) + reversedStr;
		}
/* 
  
   first  = " " ;
   second = h + ""  = "h" ;
   3rd step = e+ "h" = "eh" ;
   4th step = l + "leh" ;
  
   */
          System.out.println(" Reversed string: " + reversedStr);
	}
}

