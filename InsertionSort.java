public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i]; // The element to be inserted into the sorted portion
            int j = i - 1;

            // Move elements of the sorted portion that are greater than the key
            // to one position ahead of their current position
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j--;
            }

            // Insert the key into its correct position
            input[j + 1] = key;
        }
    }
}