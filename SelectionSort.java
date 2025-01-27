public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            // Find the minimum element in the unsorted portion of the array
            int minIndex = i;
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] < input[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted portion
            int temp = input[minIndex];
            input[minIndex] = input[i];
            input[i] = temp;
        }
    }
}