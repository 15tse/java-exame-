package hashmap;

import java.util.HashSet;
import java.util.Set;

public class isBrakable {
	public  boolean isBrakable(String s,String [] dic) {
		Set<String> hs =new HashSet();
		for(String str : dic){
			hs.add(str);
			
		}
		boolean[] dp = new boolean[s.length()+1];
		dp[0]=true;
		int i=0;
		for(int i1=1;i1<=s.length();i1++);{
			for(int j=i+1;j<=s.length();j++);{
			int j = 0;
			if(hs.contains(s.substring(i,j)));{
			dp[j]=true;
			i=j-1;
			
	}
			 
	}
		}
	return dp[s.length()];
	}
	public static void  main(String[] args) {
		String [] dic = {"apple" ,"pen"};
		System.out.println (isBrakable("applepenapple" , dic));
	}
	
}
