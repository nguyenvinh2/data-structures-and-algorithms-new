package Sorting;

public class InsertionSort {

    public static void sort(int[] input) {
        int current, j;
        for (int i = 1; i < input.length; i++) {
            current = input[i];
            j = i - 1;
            while (j >= 0 && input[j] > current) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = current;
        }
    }
}
