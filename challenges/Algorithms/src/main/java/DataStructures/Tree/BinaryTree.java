package DataStructures.Tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree <T>{

    private List<T> values;

    private Node<T> root;

    public T getRoot() {
        return root.value;
    }

    public Node getRootNode() {
        return root;
    }

    public void setRoot(T input) {
        if(root != null) {
            System.out.println("This tree already has a root node");
        } else {
            root = new Node(input);
        }
    }

    public BinaryTree() {}

    public BinaryTree(T input) {
        root = new Node(input);
    }

    public void addLeftChild(T leftChild) {
        root.left = new Node(leftChild);
    }

    public void addRightChild(T rightChild) {
        root.right = new Node(rightChild);
    }

    public void addLeftChild(Node leftChild) {
        root.left = leftChild;
    }

    public void addRightChild(Node rightChild) {
        root.right = rightChild;
    }

    public void addLeftChild(Node root, T leftChild) {
        root.left = new Node(leftChild);
    }

    public void addRightChild(Node root, T rightChild) {
        root.right = new Node(rightChild);
    }


    public void addLeftChild(Node root, Node leftChild) {
        root.left = leftChild;
    }

    public void addRightChild(Node root, Node rightChild) {
        root.right = rightChild;
    }

    public List<T> preOrder() {
        values = new ArrayList<>();
        preOrder(root);
        return values;
    }

    public List<T> inOrder() {
        values = new ArrayList<>();
        inOrder(root);
        return values;
    }

    public List<T> postOrder() {
        values = new ArrayList<>();
        postOrder(root);
        return values;
    }

    private List<T> preOrder(Node input) {
        if (input != null) {
            values.add((T)input.value);
            preOrder(input.left);
            preOrder(input.right);
        }
        return values;
    }

    private List<T> inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            values.add((T)root.value);
            inOrder(root.right);
        }
        return values;
    }

    private List<T> postOrder(Node root) {
        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            values.add((T)root.value);
        }
        return values;
    }
}
