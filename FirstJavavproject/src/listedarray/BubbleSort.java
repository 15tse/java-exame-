package listedarray;

import java.util.ArrayList;

public class BubbleSort {
    public static void bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Swap elements
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(64);
        list.add(34);
        list.add(25);
        list.add(12);
        list.add(22);
        list.add(11);
        list.add(90);

        System.out.println("Original list: " + list);
        bubbleSort(list);
        System.out.println("Sorted list: " + list);
    }
}

