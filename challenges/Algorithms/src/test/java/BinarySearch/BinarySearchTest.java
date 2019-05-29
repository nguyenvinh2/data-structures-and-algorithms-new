package BinarySearch;

import org.junit.Test;
import static org.junit.Assert.*;

public class BinarySearchTest {
    @Test
    public void EmptyArrayTest()
    {
        assertEquals(-1, BinarySearch.arrayBinarySearch(new int[] { }, 1));
    }

    @Test
    public void singleElementTest()
    {
        assertEquals(0, BinarySearch.arrayBinarySearch(new int[] {1}, 1));
    }

    @Test
    public void hundredElementTest()
    {
        int[] testArray = new int[100];
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = i;
        }
        assertEquals(15, BinarySearch.arrayBinarySearch(testArray, 15));
    }

    @Test
    public void thousandElementTest()
    {
        int[] testArray = new int[10000];
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = i;
        }
        assertEquals(5432, BinarySearch.arrayBinarySearch(testArray, 5432));
    }

    @Test
    public void hundredThousandElementTest()
    {
        int[] testArray = new int[100000];
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = i;
        }
        assertEquals(97636, BinarySearch.arrayBinarySearch(testArray, 97636));
    }

    @Test
    public void hundredThousandElementTestNotFound()
    {
        int[] testArray = new int[100000];
        for (int i = 0; i < testArray.length; i++)
        {
            testArray[i] = i;
        }
        assertEquals(-1, BinarySearch.arrayBinarySearch(testArray, 197636));
    }
}



