package array;

public class linearsearch {
	public static void main(String[] args) {
        int[] arr = {3, 6, 1, 8, 2, 4};
        int target = 8;
        
        boolean found =false;
        int  index=-1;
        
        for (int i=0; i<arr.length ; i++) {
        	if (arr[i]==target) {
        		found = true;
        		 index = i;
        		break;
        		
        		
        	}
        	
        }
        
        if(found) {
        	System.out.println("target found at index : " +index);
        }else {
        	System.out.println("target not found" );
        }

        
	} 
}
	

