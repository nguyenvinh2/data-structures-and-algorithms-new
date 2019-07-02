package Sorting.MergeSort;

public class MergeSort {
    public static int[] sort(int[] input) {
        if (input.length < 2) {
            return input;
        }

        int dividePoint = input.length / 2;
        int[] leftArray = new int[dividePoint];
        int[] rightArray = new int[input.length - dividePoint];

        for (int i = 0; i < dividePoint; i++) {
            leftArray[i] = input[i];
        }

        for (int i = dividePoint; i < input.length; i++) {
            rightArray[i - dividePoint] = input[i];
        }

        leftArray = sort(leftArray);
        rightArray = sort(rightArray);
        return merge(leftArray, rightArray);
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {
        int[] result = new int[rightArray.length + leftArray.length];

        int left = 0, right = 0, indices = 0;

        while (left < leftArray.length || right < rightArray.length) {
            if (left < leftArray.length && right < rightArray.length) {
                if (leftArray[left] <= rightArray[right]) {
                    result[indices] = leftArray[left];
                    left++;
                    indices++;
                } else {
                    result[indices] = rightArray[right];
                    right++;
                    indices++;
                }
            } else if (left < leftArray.length) {
                result[indices] = leftArray[left];
                left++;
                indices++;
            } else if (right < rightArray.length) {
                result[indices] = rightArray[right];
                right++;
                indices++;
            }
        }
        return result;
    }

}
