package ShiftArray;
import java.util.Arrays;

public class ArrayShift {
  public static void main (String[] args) {
    int[] startArr = new int[] {1,2,3,4,5};
    System.out.println(Arrays.toString(startArr));
    int[] endArr = insertShiftArray(startArr, 6);
    System.out.println(Arrays.toString(endArr));
  }

  public static int[] insertShiftArray(int[] inputArray, int inputValue) {
    int[] shiftArray = new int[inputArray.length + 1];
    for(int i = 0; i < shiftArray.length; i++) {
      if(i < shiftArray.length/2) {
        shiftArray[i] = inputArray[i];
      } else if ( i == shiftArray.length/2) {
        shiftArray[i] = inputValue;
      } else {
        shiftArray[i] = inputArray[i-1];
      }
    }
    return shiftArray;
  }
}
