package DataStructures.StackAndQueue;


public class Stack<T> {
    private Node top;

    public Stack() {
    }

    public Stack(T input) {
        top = new Node(input);
    }

    public T peek() {
        if (top != null) {
            return (T) top.value;
        } else {
            return null;
        }
    }

    public T pop() {
        if (top == null) {
            return null;
        } else {
            Node poppedNode = top;
            top = top.next;
            poppedNode.next = null;
            return (T) poppedNode.value;
        }
    }

    public void push(T input) {
        Node add = new Node(input);
        add.next = top;
        top = add;
    }
}
