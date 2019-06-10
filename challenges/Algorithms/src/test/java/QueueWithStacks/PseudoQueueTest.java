package QueueWithStacks;

import DataStructures.StackAndQueue.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void enqueueOrderTest() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(1);
        test.enqueue(2);
        test.enqueue(3);
        test.enqueue(4);
        test.enqueue(5);
        int i = 0;
        while(test.peek()!=null) {
            assertEquals(i+1, test.dequeue());
            i++;
        }
    }

    @Test()
    public void enqueueSingleTest() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue("one");
        assertEquals("one", test.peek());
    }

    @Test
    public void dequeueTest() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue(1);
        test.enqueue(2);
        assertEquals(1, test.dequeue());
        assertEquals(2, test.peek());
    }

    @Test
    public void dequeueNullTest() {
        PseudoQueue test = new PseudoQueue();
        test.enqueue("a");
        test.dequeue();
        assertNull(test.dequeue());
    }

    @Test
    public void peekNullTest() {
        PseudoQueue test = new PseudoQueue();
        assertNull(test.peek());
    }

    @Test
    public void pseudoQueueNullTest() {
        PseudoQueue test = new PseudoQueue();
        assertNull(test.peek());
        assertNull(test.dequeue());
    }
}