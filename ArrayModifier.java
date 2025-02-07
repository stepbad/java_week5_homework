public class ArrayModifier {
    public static void main(String[] args) {
        incrementAndPrintArray();
    }

    public static void incrementAndPrintArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Incremented Array: ");
        for (int i = 0; i < array.length; i++) {
            array[i]++;
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
