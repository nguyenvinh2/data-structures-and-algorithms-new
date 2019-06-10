package DataStructures.StackAndQueue;

public class Queue<T> {
    private Node front;
    private Node rear;

    public Queue(){}

    public Queue(T input) {
        Node add = new Node(input);
        front = add;
        rear = add;
    }

    public T peek() {
        if(front != null) {
            return (T) front.value;
        } else {
            return null;
        }
    }

    public void enqueue(T input) {
        Node add = new Node(input);
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
            Node removedNode = front;
            front = front.next;
            removedNode.next = null;
            return (T) removedNode.value;
        }
        return null;
    }
}
