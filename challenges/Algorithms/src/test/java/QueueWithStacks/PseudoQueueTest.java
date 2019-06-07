package QueueWithStacks;

import DataStructures.StackAndQueue.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueueOrderTest() {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);

        Node[] expected = new Node[]{one, two, three, four, five};
        PseudoQueue test = new PseudoQueue();
        test.enqueue(one);
        test.enqueue(two);
        test.enqueue(three);
        test.enqueue(four);
        test.enqueue(five);
        int i = 0;
        while(test.peek()!=null) {
            assertEquals(expected[i], test.dequeue());
            i++;
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void enqueueNullTest() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(null);
    }

    @Test()
    public void enqueueSingleTest() {
        Node one = new Node("one");
        PseudoQueue test = new PseudoQueue();
        test.enqueue(one);
        assertEquals(one, test.peek());
    }

    @Test
    public void dequeueTest() {
        Node one = new Node(1);
        Node two = new Node(2);
        PseudoQueue test = new PseudoQueue();
        test.enqueue(one);
        test.enqueue(two);
        Node result = test.dequeue();
        assertEquals(one, result);
        assertEquals(two, test.peek());
    }

    @Test
    public void dequeueNullTest() {
        PseudoQueue test = new PseudoQueue();
        Node result = test.dequeue();
        assertNull(result);
    }

    @Test
    public void peekNullTest() {
        PseudoQueue test = new PseudoQueue();
        assertNull(test.peek());
    }

    @Test
    public void pseudoQueueNullTest() {
        PseudoQueue test = new PseudoQueue();
        Node result = test.dequeue();
        assertNull(test.peek());
        assertNull(result);
    }
}