import java.util.Arrays;

public class ArrayReverse {
  public static void main (String[] args) {
    int[] startArr = new int[] {1,2,3,4,5,10};
    System.out.println(Arrays.toString(startArr));
    int[] endArr = reverseArray(startArr);
    System.out.println(Arrays.toString(endArr));
  }

  public static int[] reverseArray(int[] inputArray) {
    int[] reversedArray = new int[inputArray.length];
    for(int i = 0; i < inputArray.length; i++) {
      reversedArray[i] = inputArray[inputArray.length - 1 - i];
    }
    return reversedArray;
  }
}

