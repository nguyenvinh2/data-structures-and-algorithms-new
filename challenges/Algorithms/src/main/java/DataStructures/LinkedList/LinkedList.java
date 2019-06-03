package DataStructures.LinkedList;


import java.util.ArrayList;
import java.util.List;

public class LinkedList<T> {

    public Node head;
    public Node current;


    public List<Node> print() {
        List<Node> nodes = new ArrayList<>();
        current = head;
        while (current != null) {
            nodes.add(current);
            System.out.println(current.value);
            current = current.next;
        }
        current = head;
        return nodes;
    }

    public void insert(Node node) {
        node.next = head;
        head = node;
        current = head;
    }

    public void append(Node node) {
        if (head == null) {
            head = node;
            head.next = null;
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        current = head;
    }

    public boolean includes(T data) {
        current = head;
        while (current != null) {
            if (current.value == data) {
                return true;
            }
            current = current.next;
        }
        current = head;
        return false;
    }
}


