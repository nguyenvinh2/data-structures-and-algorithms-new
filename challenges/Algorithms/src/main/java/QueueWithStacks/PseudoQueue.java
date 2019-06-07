package QueueWithStacks;

import DataStructures.StackAndQueue.*;

public class PseudoQueue {
    private Stack stackOne = new Stack();
    private Stack stackTwo = new Stack();

    public PseudoQueue() {
    }

    public PseudoQueue(Node input) {
        stackOne.push(input);
    }

    public void enqueue(Node input) {
        if (input != null) {
            while (stackOne.peek() != null) {
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(input);
            while (stackTwo.peek() != null) {
                stackOne.push(stackTwo.pop());
            }
        } else {
            throw new IllegalArgumentException("input cannot be null");
        }
    }

    public Node dequeue() {
        return stackOne.pop();
    }

    public Node peek() {
        return stackOne.peek();
    }
}
