package array;

public class missingelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5};

        int n = arr.length + 1; // expected length
        int expectedSum = n * (n + 1) / 2; // sum of first n natural numbers
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        int missingElement = expectedSum - actualSum;
        System.out.println("Missing element: " + missingElement);
    }
}



