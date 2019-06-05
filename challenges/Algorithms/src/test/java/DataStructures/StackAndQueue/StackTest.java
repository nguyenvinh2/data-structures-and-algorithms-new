package DataStructures.StackAndQueue;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void peekTestNull() {
        Stack test = new Stack();
        assertNull(test.peek());
    }

    @Test
    public void peekTestNormal() {
        Node sample = new Node("Woooz");
        Stack test = new Stack(sample);
        assertEquals(sample, test.peek());
    }

    @Test
    public void popTest() {
        Node sample = new Node("Woooz");
        Node sampleTwo = new Node("Woooze");
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        Node removed = test.pop();
        assertEquals(sample, test.peek());
        assertEquals(sampleTwo, removed);
    }

    @Test
    public void popTestNull() {
        Stack test = new Stack();
        Node result = test.pop();
        assertNull(result);
        assertNull(test.peek());
    }

    @Test(expected = IllegalArgumentException.class)
    public void pushNullTest() {
        Node sample = new Node("Woooz");
        Stack test = new Stack(sample);
        test.push(null);
    }

    @Test
    public void pushTest() {
        Node sample = new Node("Woooz");
        Node sampleTwo = new Node("Weeoooz");
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        assertEquals(sampleTwo, test.peek());
    }
}