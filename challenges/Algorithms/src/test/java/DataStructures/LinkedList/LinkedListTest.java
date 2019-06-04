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
    public void insertNullTest() {
        LinkedList test = new LinkedList();
        Node testValue = null;
        test.insert(testValue);
        assertEquals(testValue, test.current);
    }

    @Test
    public void insertTestHead() {
        LinkedList test = new LinkedList();
        Node testValue = new Node("Heyall");
        test.insert(testValue);
        assertEquals(testValue, test.head);
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
    public void appendNullTest() {
        LinkedList test = new LinkedList();
        Node testEnd = null;
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
    public void includesNullTest() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);
        assertFalse(test.includes(null));
    }

    @Test
    public void printTest() {
        List<Node> expected = new ArrayList<>();
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(null);
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

    //Tests addBefore method
    @Test
    public void insertBeforeTestFront() {
        LinkedList test = new LinkedList();
        Node testBefore = new Node("The end");
        Node testBeforeTwo = new Node(3);
        test.insert(testBefore);
        test.insertBefore(testBeforeTwo, testBefore);
        assertEquals(testBeforeTwo, test.head);
    }

    @Test
    public void insertBeforeTestNull() {
        LinkedList test = new LinkedList();
        Node testBefore = new Node("The end");
        Node testBeforeTwo = null;
        test.insert(testBefore);
        test.insertBefore(testBeforeTwo, testBefore);
        assertEquals(testBefore, test.head);
    }


    @Test
    public void insertBeforeTestMiddle() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);

        Node thisOne = new Node("Crazy Delicious");
        test.insertBefore(thisOne, testEndThree);
        while(test.current.next != testEndThree) {
            test.current = test.current.next;
        }
        assertEquals(test.current, thisOne);
    }

    //insertAfter tests
    @Test
    public void insertAfterTestEnd() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);

        Node thisOne = new Node("Crazy Delicious");

        test.insertAfter(testEndFour, thisOne);

        while(test.current.next !=null) {
            test.current = test.current.next;
        }

        assertEquals(test.current, thisOne);
    }

    @Test
    public void insertAfterTestNull() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);

        Node thisOne = null;

        test.insertAfter(testEndFour, thisOne);

        while(test.current.next !=null) {
            test.current = test.current.next;
        }

        assertEquals(test.current, testEndFour);
    }

    @Test
    public void insertAfterTestMiddle() {
        LinkedList test = new LinkedList();
        Node testEnd = new Node("The end");
        Node testEndTwo = new Node(3);
        Node testEndThree = new Node("The Second end");
        Node testEndFour = new Node(7);
        test.append(testEnd);
        test.append(testEndTwo);
        test.append(testEndThree);
        test.append(testEndFour);

        Node thisOne = new Node("Crazy Delicious");

        test.insertAfter(testEndTwo, thisOne);

        while(test.current != testEndTwo) {
            test.current = test.current.next;
        }

        assertEquals(test.current.next, thisOne);
    }

    @Test
    public void KthEndTestFront() {
        LinkedList test = new LinkedList();
        test.append(new Node("Something"));
        test.append(new Node("Has"));
        test.append(new Node("Gone"));
        test.append(new Node("Wrong"));
        test.append(new Node(1));
        test.append(new Node(2));
        Node expected = new Node(0);
        test.append(expected);
        test.print();
        assertEquals(expected.value, test.getFromEnd(0));
    }

    @Test
    public void KthEndTestMiddle() {
        LinkedList test = new LinkedList();
        test.append(new Node("Something"));
        test.append(new Node("Has"));
        test.append(new Node("Gone"));
        Node middleNode = new Node("Wrong");
        test.append(middleNode);
        test.append(new Node(1));
        test.append(new Node(2));
        Node expected = new Node(0);
        test.append(expected);
        test.print();
        assertEquals(middleNode.value, test.getFromEnd(3));
    }


    @Test
    public void KthEndTestEnd() {
        LinkedList test = new LinkedList();
        Node frontNode = new Node("Something");
        test.append(frontNode);
        test.append(new Node("Has"));
        test.append(new Node("Gone"));
        test.append(new Node("Wrong"));
        test.append(new Node(1));
        test.append(new Node(2));
        Node expected = new Node(0);
        test.append(expected);
        test.print();
        assertEquals(frontNode.value, test.getFromEnd(6));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void KthEndTestFail() {
        LinkedList test = new LinkedList();
        test.append(new Node("Something"));
        test.append(new Node("Has"));
        test.append(new Node("Gone"));
        test.append(new Node("Wrong"));
        test.append(new Node(1));
        test.append(new Node(2));
        Node expected = new Node(0);
        test.append(expected);
        test.print();
        assertEquals(expected.value, test.getFromEnd(7));
    }

    @Test(expected = IllegalArgumentException.class)
    public void KthEndTestFailNegative() {
        LinkedList test = new LinkedList();
        test.append(new Node("Something"));
        test.append(new Node("Has"));
        test.append(new Node("Gone"));
        test.append(new Node("Wrong"));
        test.append(new Node(1));
        test.append(new Node(2));
        Node expected = new Node(0);
        test.append(expected);
        test.print();
        assertEquals(expected.value, test.getFromEnd(-6));
    }


}