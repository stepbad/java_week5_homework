import java.util.HashMap;
import java.util.Map;

public class PrintFrequency {
    public static void main(String[] args) {
        int[] exampleArray = {1, 2, 2, 3, 3, 3, 4, 5, 5, 5};
        printFrequency(exampleArray);
    }

    public static void printFrequency(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times.");
            }
        }
    }
}
