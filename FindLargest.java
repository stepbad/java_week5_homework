public class FindLargest {
    public static void main(String[] args) {
        int[] exampleArray = {20, 1, 5, 2, 8, 7, 3};
        findLargestAndIndex(exampleArray);
    }

    public static void findLargestAndIndex(int[] array) {
        if (array == null || array.length == 0) return;

        int max = array[0];
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                index = i;
            }
        }
        System.out.println("Largest value: " + max + " at index: " + index);
    }
}
