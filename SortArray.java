import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] exampleArray = {20, 1, 5, 2, 8, 7, 3};
        sortArray(exampleArray);
    }

    public static void sortArray(int[] array) {
        // Clone the array to preserve the original data
        int[] ascending = array.clone();
        Arrays.sort(ascending);
        System.out.println("Ascending: " + Arrays.toString(ascending));

        // Create a new array for descending order
        int[] descending = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            descending[i] = ascending[array.length - 1 - i];
        }
        System.out.println("Descending: " + Arrays.toString(descending));
    }
}
