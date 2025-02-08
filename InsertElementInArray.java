import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 4, 5};
        int elementToInsert = 3;
        int position = 2;

        // Insert the element and get the new array
        int[] newArray = insertElement(originalArray, elementToInsert, position);

        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }

    public static int[] insertElement(int[] array, int element, int position) {
        // Check if the position is within the bounds of the array length
        if (position < 0 || position > array.length) {
            System.out.println("Invalid position");
            return array;
        }

        // Create a new array that is one element larger than the original
        int[] newArray = new int[array.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < position; i++) {
            newArray[i] = array[i];
        }

        // Insert the new element at the specified position
        newArray[position] = element;

        // Continue copying the rest of the original array into the new array
        for (int i = position; i < array.length; i++) {
            newArray[i + 1] = array[i];
        }

        return newArray;
    }
}
