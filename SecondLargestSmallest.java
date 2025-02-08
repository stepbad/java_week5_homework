import java.util.Arrays;

public class SecondLargestSmallest {
    public static void main(String[] args) {
        int[] exampleArray = {20, 1, 5, 2, 8, 7, 3};
        secondLargestAndSmallest(exampleArray);
    }

    public static void secondLargestAndSmallest(int[] array) {
        if (array.length < 2) {
            System.out.println("Array needs at least two elements.");
            return;
        }
        int[] sortedArray = array.clone();
        Arrays.sort(sortedArray);
        System.out.println("Second smallest: " + sortedArray[1] + ", Second largest: " + sortedArray[sortedArray.length - 2]);
    }
}
