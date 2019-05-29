package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] input = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrayBinarySearch(input, 0));

    }

    public static int arrayBinarySearch(int[] inputArray, int inputKey) {
        int indexUpper = inputArray.length - 1;
        int indexLower = 0;
        int indexMiddle = (indexUpper + indexLower) / 2;
        while (indexLower <= indexUpper) {
            if (inputArray[indexMiddle] == inputKey) {
                return indexMiddle;
            }
            if (inputArray[indexMiddle] < inputKey) {
                indexLower = indexMiddle + 1;
                indexMiddle = (indexUpper + indexLower) / 2;
            }
            if (inputArray[indexMiddle] > inputKey) {
                indexUpper = indexMiddle - 1;
                indexMiddle = (indexUpper + indexLower) / 2;
            }
        }
        return -1;
    }
}
