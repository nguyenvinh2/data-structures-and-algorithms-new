package QueueWithStacks;

import DataStructures.StackAndQueue.*;

public class PseudoQueue<T> {
    private Stack<T> stackOne = new Stack<T>();
    private Stack<T> stackTwo = new Stack<T>();

    public PseudoQueue() {
    }

    public PseudoQueue(T input) {
        stackOne.push(input);
    }

    public void enqueue(T input) {

        while (stackOne.peek() != null) {
            stackTwo.push(stackOne.pop());
        }
        stackOne.push(input);
        while (stackTwo.peek() != null) {
            stackOne.push(stackTwo.pop());
        }
    }

    public T dequeue() {
        return (T) stackOne.pop();
    }

    public T peek() {
        return (T) stackOne.peek();
    }
}
