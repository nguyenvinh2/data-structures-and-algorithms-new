package Sorting.MergeSort;

import org.junit.Test;


import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sortTestNormal() {
        int[] test = new int[]{5, 4, 67, 23, 78};
        int[] expected = new int[]{4, 5, 23, 67, 78};

        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i], test[i]);
        }

        int[] result = MergeSort.sort(test);
        for (int i = 0; i < test.length; i++) {
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void sortTestNull() {
        int[] test = new int[]{};
        assertEquals(0,MergeSort.sort(test).length);
    }

    @Test
    public void sortTestSingle() {
        int[] test = new int[]{5};
        for (int i = 0; i < test.length; i++) {
            assertEquals(5, test[i]);
        }
        MergeSort.sort(test);
        for (int i = 0; i < test.length; i++) {
            assertEquals(5, MergeSort.sort(test)[i]);
        }
    }

    @Test
    public void sortTestNegative() {
        int[] test = new int[]{5, 4, 67, 23, 78, -5, -2, -8, -17};
        int[] expected = new int[]{-17, -8, -5, -2, 4, 5, 23, 67, 78};

        for (int i = 0; i < test.length; i++) {
            assertEquals(test[i], test[i]);
        }

        for (int i = 0; i < test.length; i++) {
            assertEquals(expected[i], MergeSort.sort(test)[i]);
        }
    }
}