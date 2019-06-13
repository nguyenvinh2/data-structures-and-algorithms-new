package DataStructures.Tree;

public class BinarySearchTree {

    private Node root;

    public double getRoot() {
        return (double) root.value;
    }

    public Node getRootNode() {
        return root;
    }

    public void setRoot(double input) {
        if (root != null) {
            System.out.println("This tree already has a root node");
        } else {
            root = new Node(input);
        }
    }

    public BinarySearchTree() {
    }

    public BinarySearchTree(double input) {
        root = new Node(input);
    }

    public void add(double input) {
        if (root == null) {
            System.out.println("No root node detected; setting value as root");
            root = new Node(input);
        } else {
            add(input, root);
        }
    }

    private void add(double input, Node current) {
        if (input < (double) current.value) {
            if (current.left != null) {
                add(input, current.left);
            } else {
                current.left = new Node(input);
            }
        } else if (input > (double) current.value) {
            if (current.right != null) {
                add(input, current.right);
            } else {
                current.right = new Node(input);
            }
        } else {
            System.out.println("Cannot add duplicate number to BST");
        }

    }

    public boolean contains(double search) {
        if(root == null) {
            return false;
        } else {
            return contains(search, root, false);
        }
    }

    private boolean contains(double search, Node current, boolean searchTracker) {
        if ((double) current.value == search) {
            return true;
        } else if ((double) current.value <  search && current.right != null) {
            return contains(search, current.right, searchTracker);
        } else if ((double) current.value >  search && current.left != null) {
            return contains(search, current.left, searchTracker);
        }
        return searchTracker;
    }
}
