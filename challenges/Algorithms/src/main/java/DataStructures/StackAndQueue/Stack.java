package DataStructures.StackAndQueue;


public class Stack {
    private Node top;

    public Stack(){}

    public Stack(Node input) {
        top = input;
    }

    public Node peek() {
        return top;
    }

    public Node pop() {
        if (top == null) {
            return null;
        }
        Node poppedNode = top;
        top = top.next;
        poppedNode.next = null;
        return poppedNode;
    }

    public void push(Node input) {
        if (input == null) {
            throw new IllegalArgumentException("You cannot add a null node to the Stack");
        } else {
            input.next = top;
            top = input;
        }
    }
}
