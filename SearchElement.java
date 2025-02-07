public class SearchElement {
    public static void main(String[] args) {
        int[] exampleArray = {20, 1, 5, 2, 8, 7, 3};
        searchElement(exampleArray, 8);
    }

    public static void searchElement(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                System.out.println(element + " found at index " + i);
                return;
            }
        }
        System.out.println(element + " not found in the array.");
    }
}
