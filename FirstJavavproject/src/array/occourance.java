package array;

public class occourance {
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

        // Sort the array
        java.util.Arrays.sort(arr);//(nlogn) running time 

        int currentNum = arr[0];
        int count = 1;

        // Iterate through the sorted array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == currentNum) {
                // If the number is the same, increment the count
                count++;
            } else {
                // If the number is different, print the count and reset
                System.out.println("Number " + currentNum + " occurs " + count + " times");
                currentNum = arr[i];
                count = 1;
            }
        }

        // Print the count of the last number
        System.out.println("Number " + currentNum + " occurs " + count + " times");
    }

}
