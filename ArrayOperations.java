public class ArrayOperations {
    public static void main(String[] args) {
        calculateSumAndAverage();
    }

    public static void calculateSumAndAverage() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        // Using for loop with array.length
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        // Calculating average by dividing sum by the number of elements
        double average = (double) sum / array.length;

        System.out.println("Sum: " + sum + ", Average: " + average);
    }
}
