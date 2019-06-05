package DataStructures.StackAndQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

    @Test
    public void peekNullTest() {
        Queue test = new Queue();
        assertNull(test.peek());
    }

    @Test
    public void peekTest() {
        Node sample = new Node("Hweibh");
        Queue test = new Queue(sample);
        assertEquals(sample, test.peek());
    }

    @Test
    public void enqueueFromNullTest() {
        Queue test = new Queue();
        Node sample = new Node("Hweibh");
        test.enqueue(sample);
        assertEquals(sample, test.peek());
    }

    @Test
    public void enqueueTest() {
        Node starting = new Node("Huhd");
        Queue test = new Queue(starting);
        Node sample = new Node("Hweibh");
        test.enqueue(sample);
        assertEquals(starting, test.peek());
    }

    @Test(expected = IllegalArgumentException.class)
    public void enqueueNullTest() {
        Node starting = new Node("Huhd");
        Queue test = new Queue(starting);
        test.enqueue(null);
    }

    @Test
    public void dequeueTest() {
        Node starting = new Node("Huhd");
        Queue test = new Queue(starting);
        Node sample = new Node("Hweibh");
        test.enqueue(sample);
        Node testRemoved = test.dequeue();
        assertEquals(starting, testRemoved);
        assertEquals(sample, test.peek());
    }

    @Test
    public void dequeueNullTest() {
        Queue test = new Queue();
        Node testRemoved = test.dequeue();
        assertNull(testRemoved);
        assertNull(test.peek());
    }

    @Test
    public void dequeueLastTest() {
        Node starting = new Node("Huhd");
        Queue test = new Queue(starting);
        Node testRemoved = test.dequeue();
        assertEquals(starting, testRemoved);
        assertNull(test.peek());
    }
}