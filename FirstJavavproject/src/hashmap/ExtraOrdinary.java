package hashmap;

import java.util.HashMap;
import java.util.Map;

public class ExtraOrdinary {
	private static int lastThree;




	//build the key pads and write the letters under them 
	//DS-hashmap map<letters,numbers>
	
	public static int countExtraOrdinary(String s) {
		Map<Character, Integer> hm =new HashMap<>();
		hm.put('a', 1);
		hm.put('b',1);
		 int digit = 2; int lastThree2 = lastThree;
		for(char ch='c'; ch<'z';ch++) {
			lastThree = (ch-'a')-1;
			hm.put(ch, digit);
			if (lastThree%3==0) {
				digit++;
			}
			}
		//asdf 
		
		return 0;
		}

	
	
	
	public static void main(String[] args) {
		System.out.println(countExtraOrdinary("asdf"));
	
	}
}

}
