package FinalExame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class freqElement {
	  public static void main(String[] args) {
	        int[] nums = {1};
	        int k = 1;
	        System.out.println(Arrays.toString(mostFrequent(nums, k)));
	    }

	    public static int[] mostFrequent(int[] nums, int k) {
	        Map<Integer, Integer> map = new HashMap<>();
	        for (int num : nums) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }

	        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
	        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

	        int[] result = new int[k];
	        for (int i = 0; i < k; i++) {
	            result[i] = list.get(i).getKey();
	        }

	        return result;
	    }



}
