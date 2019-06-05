package DataStructures.StackAndQueue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(){}

    public Queue(Node node) {
        front = node;
        rear = node;
    }

    public Node peek() {
        return front;
    }

    public void enqueue(Node node) {
        if (node == null) {
            throw new IllegalArgumentException("You cannot add a null node to the Queue");
        } else if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public Node dequeue() {
        if (front != null) {
            Node removedNode = front;
            front = front.next;
            removedNode.next = null;
            return removedNode;
        }
        return null;
    }
}
