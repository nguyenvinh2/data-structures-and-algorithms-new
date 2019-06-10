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
        String sample = "Woooz";
        int sampleTwo = 5;
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        assertEquals(sampleTwo, test.peek());
        assertEquals(sampleTwo, test.pop());
        assertEquals(sample, test.peek());
    }

    @Test
    public void popTestNull() {
        Stack test = new Stack();
        assertNull(test.pop());
        assertNull(test.peek());
    }

    @Test
    public void pushTest() {
        String sample = "Woooz";
        int sampleTwo = 5;
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        assertEquals(sampleTwo, test.peek());
    }

    @Test
    public void pushTestMultiple() {
        String sample = "Woooz";
        int sampleTwo = 5;
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        test.push("allow");
        assertEquals("allow", test.peek());
    }

    @Test
    public void popTestMultiple() {
        String sample = "Woooz";
        int sampleTwo = 5;
        Stack test = new Stack(sample);
        test.push(sampleTwo);
        test.push("allow");
        test.pop();
        test.pop();
        test.pop();
        assertNull(test.peek());
    }
}