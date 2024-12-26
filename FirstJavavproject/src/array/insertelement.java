package array;

public class insertelement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int elementToInsert = 6;
        int position = 2;

        // Create a new array with an extra space
        int[] newArr = new int[arr.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[position] = elementToInsert;

        // Copy elements after the insertion point
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        // Print the new array
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

}
