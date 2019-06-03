package DataStructures.LinkedList;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void instantiateTest() {
        LinkedList test = new LinkedList();
        assertNotNull(test);
    }

    @Test
    public void insertTest() {
        LinkedList test = new LinkedList();
        Node testValue = new Node(5);
        test.insert(testValue);
        assertEquals(testValue, test.current);
    }

    @Test
    public void insertTestHead() {
        LinkedList test = new LinkedList();
        Node testValue = new Node("Heyall");
        test.insert(testValue);
        assertEquals(testValue, test.getHead());
    }

    @Test
    public void insertMultipleTest() {
        LinkedList test = new LinkedList();
        Node testValue = new Node(5);
        Node testValueTwo = new Node("Holar");
        Node testValueThree = new Node(7);
        Node testValueFour = new Node("Hila");
        test.insert(testValue);
        test.insert(testValueTwo);
        test.insert(testValueThree);
        test.insert(testValueFour);
        assertEquals(testValueFour, test.current);
    }

    @Test
    public void appendTest() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        test.append(testEnd);
        assertEquals(testEnd, test.current);
    }

    @Test
    public void appendMultipleTest() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);
        while(test.current.next != null) {
            test.current = test.current.next;
        }
        assertEquals(testEndFour, test.current);
    }

    @Test
    public void includesTestPass() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);
        assertTrue(test.includes("The Second end"));
    }

    @Test
    public void includesTestFail() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);
        assertFalse(test.includes("TNone"));
    }

    @Test
    public void printTest() {
        List<Node> expected = new ArrayList<>();
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);
        expected.add(testEnd);
        expected.add(testEndTwo);
        expected.add(testEndThree);
        expected.add(testEndFour);
        assertEquals(expected, test.print());
    }
}