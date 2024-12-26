package Jdsalgorithm;

import java.util.HashSet;

public class FindFirstThreeDuplicates {
    public static void findFirstThreeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for (int num : arr) {
            if (!set.add(num)) {
                System.out.println("Duplicate " + (++count) + ": " + num);
                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 2, 7, 8, 9, 1, 10};
        findFirstThreeDuplicates(arr);
    }

}
