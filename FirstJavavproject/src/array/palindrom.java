package array;

public class palindrom {
	 public static void main(String[] args) {
	        String str = "madam";//[0,1,2,3,4]
      int left=0;
      int right=str.length()-1;
      while( left < right ) {
    	  if (str.charAt(left) !=str.charAt(right)) {
    		  System.out.println(str + "is not palindrome");
    		  return;
    	  }
    		 left++;
    		 right--;
    		 
    		  
    		  
    		  
    		  
    		
    		  
      }
      System.out.println(str + " is palindrome ");

	 }
}
