public class CountOddEven {
    public static void main(String[] args) {
        int[] exampleArray = {20, 1, 5, 2, 8, 7, 3};
        countOddAndEven(exampleArray);
    }

    public static void countOddAndEven(int[] array) {
        int oddCount = 0, evenCount = 0;
        for (int num : array) {
            if (num % 2 == 0) evenCount++;
            else oddCount++;
        }
        System.out.println("Odd count: " + oddCount + ", Even count: " + evenCount);
    }
}
