import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Generate a random array for testing
        int[] randomArray = generateRandomArray(10, 1, 100); // Array of size 10 with values between 1 and 100

        // Print the generated array
        System.out.println("Generated Random Array:");
        printArray(randomArray);

        // Increase the loop count for better performance results
        int loopCount = 10000; // Increase this value for more accurate performance testing

        // Run the TestSuite with the random array
        TestSuite.run(randomArray, loopCount);
    }

    /**
     * Generates a random array of integers.
     *
     * @param size The size of the array.
     * @param min  The minimum value for the random numbers.
     * @param max  The maximum value for the random numbers.
     * @return An array of random integers.
     */
    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }

    /**
     * Prints the elements of an array.
     *
     * @param array The array to print.
     */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}