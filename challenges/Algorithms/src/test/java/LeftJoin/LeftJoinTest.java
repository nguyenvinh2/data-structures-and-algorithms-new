package LeftJoin;

import DataStructures.Hashtable.Hashtable;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void retrieveTestSomeMatch() {
        Hashtable<String> listOne = new Hashtable<>();
        Hashtable<String> listTwo = new Hashtable<>();

        listOne.add("fond", "enamored");
        listOne.add("wrath", "anger");
        listOne.add("diligent", "employed");
        listOne.add("outfit", "garb");
        listOne.add("guide", "usher");

        listTwo.add("fond", "averse");
        listTwo.add("wrath", "delight");
        listTwo.add("koala", "idle");
        listTwo.add("guide", "follow");
        listTwo.add("flow", "jam");

        String expectedOne = "fond: enamored - averse";
        String expectedTwo = "wrath: anger - delight";
        String expectedThree = "diligent: employed - null";
        String expectedFour = "outfit: garb - null";
        String expectedFive = "guide: usher - follow";

        List<String> result = LeftJoin.retrieve(listOne, listTwo);

        assertTrue(result.contains(expectedOne));
        assertTrue(result.contains(expectedTwo));
        assertTrue(result.contains(expectedThree));
        assertTrue(result.contains(expectedFour));
        assertTrue(result.contains(expectedFive));

        assertTrue(result.size() == 5);
    }

    @Test
    public void retrieveTestAllMatch() {
        Hashtable<String> listOne = new Hashtable<>();
        Hashtable<String> listTwo = new Hashtable<>();

        listOne.add("fond", "enamored");
        listOne.add("wrath", "anger");
        listOne.add("diligent", "employed");
        listOne.add("outfit", "garb");
        listOne.add("guide", "usher");

        listTwo.add("fond", "averse");
        listTwo.add("wrath", "delight");
        listTwo.add("diligent", "idle");
        listTwo.add("guide", "follow");
        listTwo.add("outfit", "jam");

        String expectedOne = "fond: enamored - averse";
        String expectedTwo = "wrath: anger - delight";
        String expectedThree = "diligent: employed - idle";
        String expectedFour = "outfit: garb - jam";
        String expectedFive = "guide: usher - follow";

        List<String> result = LeftJoin.retrieve(listOne, listTwo);

        assertTrue(result.contains(expectedOne));
        assertTrue(result.contains(expectedTwo));
        assertTrue(result.contains(expectedThree));
        assertTrue(result.contains(expectedFour));
        assertTrue(result.contains(expectedFive));

        assertTrue(result.size() == 5);
    }

    @Test
    public void retrieveTestNoMatch() {
        Hashtable<String> listOne = new Hashtable<>();
        Hashtable<String> listTwo = new Hashtable<>();

        listOne.add("fond", "enamored");
        listOne.add("wrath", "anger");
        listOne.add("diligent", "employed");
        listOne.add("outfit", "garb");
        listOne.add("guide", "usher");

        String expectedOne = "fond: enamored - null";
        String expectedTwo = "wrath: anger - null";
        String expectedThree = "diligent: employed - null";
        String expectedFour = "outfit: garb - null";
        String expectedFive = "guide: usher - null";

        List<String> result = LeftJoin.retrieve(listOne, listTwo);

        assertTrue(result.contains(expectedOne));
        assertTrue(result.contains(expectedTwo));
        assertTrue(result.contains(expectedThree));
        assertTrue(result.contains(expectedFour));
        assertTrue(result.contains(expectedFive));

        assertTrue(result.size() == 5);
    }

    @Test
    public void retrieveTestEmpty() {
        Hashtable<String> listOne = new Hashtable<>();
        Hashtable<String> listTwo = new Hashtable<>();

        List<String> result = LeftJoin.retrieve(listOne, listTwo);

        assertTrue(result.size() == 0);
    }
}