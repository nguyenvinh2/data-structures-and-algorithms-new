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

    public void insertBefore(Node newValue, Node existingValue) {
        boolean success = false;
        if (newValue.next != null) {
            System.out.println("Cannot add node - input node contains reference to another node.");
        } else {
            current = head;
            if (current.value == existingValue.value)
            {
                insert(newValue);
                success = true;
            } else {
                while (current.next != null) {
                    if (current.next.value == existingValue.value) {
                        newValue.next = current.next;
                        current.next = newValue;
                        success = true;
                        break;
                    }
                    current = current.next;
                }
            }
            if(success) {
                System.out.println("Successfully added Node " + newValue.value + " to Node " + current.value);
            } else {
                System.out.println("Unable to add Node. Check if reference node exists in the Linked List");
            }
            current = head;
        }
    }

    public void insertAfter(Node existingValue, Node newValue) {
        boolean success = false;
        if (newValue.next != null) {
            System.out.println("Cannot add node - input node contains reference to another node.");
        } else {
            current = head;
            while (current != null) {
                if (current.value == existingValue.value) {
                    newValue.next = current.next;
                    current.next = newValue;
                    success = true;
                    break;
                }
                current = current.next;
            }
        }
        if(success) {
            System.out.println("Successfully added Node " + newValue.value + " to Node " + current.value);
        } else {
            System.out.println("Unable to add Node. Check if reference node exists in the Linked List");
        }
        current = head;
    }

}


