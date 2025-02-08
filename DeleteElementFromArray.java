import java.util.Arrays;

public class DeleteElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 2, 5};
        int elementToDelete = 2;

        // Delete the element and get the new array
        int[] newArray = deleteElement(originalArray, elementToDelete);

        // Print the new array
        System.out.println("Array after deletion: " + Arrays.toString(newArray));
    }

    public static int[] deleteElement(int[] array, int element) {
        // Find the index of the element to delete
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                index = i;
                break;
            }
        }

        // If the element was not found, return the original array
        if (index == -1) {
            return array;
        }

        // Create a new array that is one element smaller
        int[] newArray = new int[array.length - 1];

        // Copy elements from the original array to the new array, skipping the deleted element
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != index) {
                newArray[j++] = array[i];
            }
        }

        return newArray;
    }
}
