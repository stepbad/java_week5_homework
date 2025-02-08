import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        // Two sorted arrays
        int[] sortedArray1 = {1, 3, 5};
        int[] sortedArray2 = {2, 4, 6, 8, 10};

        // Merge the two sorted arrays
        int[] mergedArray = mergeSortedArrays(sortedArray1, sortedArray2);
        
        // Print the merged sorted array
        System.out.println("Merged Sorted Array: " + Arrays.toString(mergedArray));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        // Result array to hold merged elements of arr1 and arr2
        int[] merged = new int[arr1.length + arr2.length];

        // Indices for iterating through arr1, arr2, and merged respectively
        int i = 0, j = 0, k = 0;

        // Merge elements into the merged array in sorted order
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // If there are remaining elements in arr1, add them to merged
        while (i < arr1.length) {
            merged[k++] = arr1[i++];
        }

        // If there are remaining elements in arr2, add them to merged
        while (j < arr2.length) {
            merged[k++] = arr2[j++];
        }

        // Return the merged sorted array
        return merged;
    }
}
