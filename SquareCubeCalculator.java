public class SquareCubeCalculator {
    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5};
        printSquaresAndCubes(inputArray);
    }

    public static void printSquaresAndCubes(int[] input) {
        int[] squares = new int[input.length];
        int[] cubes = new int[input.length];

        // Calculate squares and cubes
        for (int i = 0; i < input.length; i++) {
            squares[i] = input[i] * input[i]; // Squaring the element
            cubes[i] = input[i] * input[i] * input[i]; // Cubing the element
        }

        // Print squares
        System.out.print("Squares: ");
        for (int square : squares) {
            System.out.print(square + " ");
        }
        System.out.println(); // Move to next line

        // Print cubes
        System.out.print("Cubes: ");
        for (int cube : cubes) {
            System.out.print(cube + " ");
        }
        System.out.println(); // Move to next line
    }
}
