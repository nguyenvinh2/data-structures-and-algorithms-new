package DataStructures.LinkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

    @Test
    public void testNodeGetterValue() {
        Node test = new Node(5);
        assertEquals(5, test.value);
    }

    @Test
    public void testNodeSetterValue() {
        Node test = new Node(5);
        test.value = "String";
        assertEquals("String", test.value);
    }

    @Test
    public void testNodeSetterNext() {
        Node test = new Node(5);
        Node testTwo = new Node("aha");
        test.next = testTwo;
        assertEquals(testTwo, test.next);
    }

}