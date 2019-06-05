package DataStructures.StackAndQueue;


public class Stack {
    private Node top;

    public Stack(Node input) {
        top = input;
    }

    public Node Peek() {
        return top;
    }

    public Node Pop() {
        if (top == null) {
            return null;
        }
        Node poppedNode = top;
        top = top.next;
        poppedNode.next = null;
        return poppedNode;
    }

    public void Push(Node input) {
        if (input == null) {
            System.out.println("You cannot add a null node to the Stack");
        } else {
            input.next = top;
            top = input;
        }
    }
}
