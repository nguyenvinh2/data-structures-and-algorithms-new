package DataStructures.StackAndQueue;


public class Stack<T> {
    private Node<T> top;

    public Stack() {
    }

    public Stack(T input) {
        top = new Node<T>(input);
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
            Node<T> poppedNode = top;
            top = top.next;
            poppedNode.next = null;
            return (T) poppedNode.value;
        }
    }

    public void push(T input) {
        Node<T> add = new Node<T>(input);
        add.next = top;
        top = add;
    }
}
