package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KthFrequency {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1,1,2, 2, 3,5,5,5,5,5,8};
        int k = 5;

        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // We create a Hash Map frequencyMap to store elements as keys 
        //and their frequencies as values.

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
// We iterate through the input array nums and update the frequencies in the map.

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(frequencyMap.entrySet());
        list.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Kth frequency element: " + list.get(k - 1).getKey());
    }


}
