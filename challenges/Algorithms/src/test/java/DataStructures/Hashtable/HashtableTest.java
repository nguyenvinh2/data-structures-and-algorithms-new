package DataStructures.Hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void addTest() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", 6);
        assertEquals(6, input.get("KeyOne"));
    }

    @Test
    public void addTestNullValue() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", null);
        assertNull(input.get("KeyOne"));
    }

    @Test
    public void addTestStringValue() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", "6");
        assertEquals("6", input.get("KeyOne"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void addTestDuplicateKey() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", "6");
        input.add("KeyOne", "9");
    }

    @Test
    public void collisionTest() {
        Hashtable input = new Hashtable();
        input.add("11111111111100011", "Input One");
        input.add("1117", "Input Two");

        assertEquals(Hashtable.hash("11111111111100011"), Hashtable.hash("1117"));
        assertEquals("Input One", input.get("11111111111100011"));
        assertEquals("Input Two", input.get("1117"));
    }


    @Test
    public void getTest() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", 6);
        input.add("KeyTwo", 7);
        assertEquals(6, input.get("KeyOne"));
        assertEquals(7, input.get("KeyTwo"));
    }

    @Test
    public void getTestNoKey() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", 6);
        input.add("KeyTwo", 7);
        assertNull(input.get("KeyThree"));
    }

    @Test
    public void containsTestTrue() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", 6);
        assertTrue(input.contains("KeyOne"));
    }

    @Test
    public void containsTestFalse() {
        Hashtable input = new Hashtable();
        input.add("KeyOne", 6);
        assertFalse(input.contains("KeyTwo"));
    }


    @Test
    public void hashTestSameKey() {
        String inputOne = "All the right movies";
        String inputTwo = "All the right movies";

        int hashOne = Hashtable.hash(inputOne);
        int hashTwo = Hashtable.hash(inputTwo);

        assertEquals(hashOne, hashTwo);
    }

    @Test
    public void hashTestDifferentKey() {
        String inputOne = "All the right movies";
        String inputTwo = "All the right movie";

        int hashOne = Hashtable.hash(inputOne);
        int hashTwo = Hashtable.hash(inputTwo);

        assertFalse(hashOne == hashTwo);
    }

    @Test
    public void hashTestEmptyKey() {
        String inputOne = "";
        String inputTwo = "";

        int hashOne = Hashtable.hash(inputOne);
        int hashTwo = Hashtable.hash(inputTwo);

        assertTrue(hashOne == hashTwo);
    }

    @Test(expected = NullPointerException.class)
    public void hashTestNullKey() {
        String inputOne = null;
        Hashtable.hash(inputOne);
    }
}