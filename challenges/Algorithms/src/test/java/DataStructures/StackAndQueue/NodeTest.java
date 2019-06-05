package DataStructures.StackAndQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {
    @Test
    public void testNodeGetterValue() {
        Node test = new Node(15);
        assertEquals(15, test.value);
    }

    @Test
    public void testNodeSetterValue() {
        Node test = new Node(19);
        test.value = "Wowza";
        assertEquals("Wowza", test.value);
    }

    @Test
    public void testNodeSetterNext() {
        Node test = new Node(3);
        Node testTwo = new Node("yessm");
        test.next = testTwo;
        assertEquals(testTwo, test.next);
    }
}