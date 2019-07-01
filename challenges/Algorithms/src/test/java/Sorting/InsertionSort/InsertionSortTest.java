package Sorting.InsertionSort;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {

    @Test
    public void sortTestNormal() {
        int[] test = new int[] {5,4,67,23,78};
        int[] expected = new int[] {4,5,23,67,78};

        for(int i = 0; i < test.length; i++) {
            assertEquals(test[i], test[i]);
        }

        InsertionSort.sort(test);
        for(int i = 0; i < test.length; i++) {
            assertEquals(expected[i], test[i]);
        }
    }

    @Test
    public void sortTestNull() {
        int[] test = new int[] {};
        for(int i = 0; i < test.length; i++) {
            assertEquals(null, test[i]);
        }
        InsertionSort.sort(test);
        for(int i = 0; i < test.length; i++) {
            assertEquals(null, test[i]);
        }
    }


    @Test
    public void sortTestSingle() {
        int[] test = new int[] {5};
        for(int i = 0; i < test.length; i++) {
            assertEquals(5, test[i]);
        }
        InsertionSort.sort(test);
        for(int i = 0; i < test.length; i++) {
            assertEquals(5, test[i]);
        }
    }

    @Test
    public void sortTestNegative() {
        int[] test = new int[] {5,4,67,23,78,-5,-2,-8,-17};
        int[] expected = new int[] {-17,-8,-5,-2,4,5,23,67,78};

        for(int i = 0; i < test.length; i++) {
            assertEquals(test[i], test[i]);
        }

        InsertionSort.sort(test);

        for(int i = 0; i < test.length; i++) {
            assertEquals(expected[i], test[i]);
        }
    }
}