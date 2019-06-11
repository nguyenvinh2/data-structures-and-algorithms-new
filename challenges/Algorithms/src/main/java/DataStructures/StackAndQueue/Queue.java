package DataStructures.StackAndQueue;

public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;

    public Queue(){}

    public Queue(T input) {
        Node<T> add = new Node<T>(input);
        front = add;
        rear = add;
    }

    public T peek() {
        if(front != null) {
            return front.value;
        } else {
            return null;
        }
    }

    public void enqueue(T input) {
        Node<T> add = new Node<T>(input);
        if (front == null) {
            front = add;
            rear = add;
        } else {
            rear.next = add;
            rear = add;
        }
    }

    public T dequeue() {
        if (front != null) {
            Node<T> removedNode = front;
            front = front.next;
            removedNode.next = null;
            return removedNode.value;
        }
        return null;
    }
}
