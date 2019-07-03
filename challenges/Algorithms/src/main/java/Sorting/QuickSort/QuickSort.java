package Sorting.QuickSort;

public class QuickSort {
    public static void sort(int[] input) {
        sortRange(input, 0, input.length - 1);
    }

    private static void sortRange(int[] input, int start, int stop) {
        if (start < stop) {
            int pivot = partition(input, start, stop);
            sortRange(input, start, pivot - 1);
            sortRange(input, pivot + 1, stop);
        }
    }

    private static int partition(int[] input, int left, int right) {
        int pivot = input[left];
        while (true) {
            while (input[left] < pivot) {
                left++;
            }
            while (input[right] > pivot) {
                right--;
            }
            if (left < right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;

                if (input[left] == input[right]) {
                    left++;
                }
            } else {
                return right;
            }
        }
    }
}
