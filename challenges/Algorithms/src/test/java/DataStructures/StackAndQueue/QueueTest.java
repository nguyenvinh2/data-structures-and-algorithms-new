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
        String sample = "Hweibh";
        Queue test = new Queue(sample);
        assertEquals(sample, test.peek());
    }

    @Test
    public void enqueueFromNullTest() {
        Queue test = new Queue();
        String sample = "Hweibh";
        test.enqueue(sample);
        assertEquals(sample, test.peek());
    }

    @Test
    public void enqueueTest() {
        int starting = 5;
        Queue test = new Queue(starting);
        String sample ="Hweibh";
        test.enqueue(sample);
        assertEquals(starting, test.peek());
    }

    @Test
    public void enqueueTestMultiple() {
        int starting = 5;
        Queue test = new Queue(starting);
        String sample ="Hweibh";
        test.enqueue(sample);
        test.enqueue(5);
        test.enqueue(new Node("allowed"));
        assertEquals(starting, test.peek());
    }

    @Test
    public void dequeueTest() {
        int starting = 5;
        Queue test = new Queue(starting);
        String sample = "Hweibh";
        test.enqueue(sample);
        assertEquals(starting, test.dequeue());
        assertEquals(sample, test.peek());
    }

    @Test
    public void dequeueNullTest() {
        Queue test = new Queue();
        assertNull(test.dequeue());
        assertNull(test.peek());
    }

    @Test
    public void dequeueLastTest() {
        String starting = "Huhd";
        Queue test = new Queue(starting);
        test.enqueue(5);
        assertEquals(starting, test.dequeue());
        assertEquals(5, test.peek());
        assertEquals(5, test.dequeue());
        assertNull(test.peek());
    }
}