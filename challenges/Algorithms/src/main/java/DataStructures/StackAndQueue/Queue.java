package DataStructures.StackAndQueue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue(){};

    public Queue(Node node) {
        front = node;
        rear = node;
    }

    public Node Peek() {
        return front;
    }

    public void Enqueue(Node node) {
        if (node == null) {
            System.out.println("You cannot add a null node to the Queue");
        } else if (front == null) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
    }

    public Node Dequeue() {
        if (front != null) {
            Node removedNode = front;
            front = front.next;
            removedNode.next = null;
            return removedNode;
        }
        return null;
    }
}
