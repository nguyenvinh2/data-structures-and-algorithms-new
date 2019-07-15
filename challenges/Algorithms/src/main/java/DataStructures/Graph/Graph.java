package DataStructures.Graph;

import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class Graph<T> {
    private LinkedList<LinkedList<Tuple>> adjacencyList;

    public LinkedList<LinkedList<Tuple>> getAdjacencyList() {
        return adjacencyList;
    }

    public void setAdjacencyList(LinkedList<LinkedList<Tuple>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public Graph() {
        adjacencyList = new LinkedList();
    }

    public Node addNode(T value) {
        adjacencyList.current = adjacencyList.head;
        while(adjacencyList.current != null) {
            if (adjacencyList.current.value.head.value.getNode().value.equals(value)) {
                throw new IllegalArgumentException("This value already exists in the graph");
            }
            adjacencyList.current = adjacencyList.current.next;
        }
        Node input = new Node(value);
        LinkedList<Tuple<Node>> addList = new LinkedList();
        Tuple data = new Tuple(input);
        addList.append(new Node(data));
        adjacencyList.append(new Node(addList));
        return input;
    }

    public void addEdge(Node parent, Node child, T weight) {
        if(child == parent) {
            throw new IllegalArgumentException("Both nodes cannot be the same");
        }
        LinkedList parentList = new LinkedList(), childList = new LinkedList();
        boolean parentExist = false, childExist = false;
        adjacencyList.current = adjacencyList.head;
        while (adjacencyList.current != null) {
            if (adjacencyList.current.value.head.value.getNode() == parent) {
                adjacencyList.current.value.current = adjacencyList.current.value.head;
                while(adjacencyList.current.value.current != null) {
                    if(adjacencyList.current.value.current.value.getNode() == child) {
                        throw new IllegalArgumentException("There is already an edge between the two nodes");
                    }
                    adjacencyList.current.value.current = adjacencyList.current.value.current.next;
                }
                parentExist = true;
                parentList = adjacencyList.current.value;
            }
            if (adjacencyList.current.value.head.value.getNode() == child) {
                childExist = true;
                childList = adjacencyList.current.value;
            }
            if (parentExist && childExist) {
                Tuple dataChild = new Tuple(child, weight);
                parentList.append(new Node(dataChild));
                Tuple dataParent = new Tuple(parent, weight);
                childList.append(new Node(dataParent));
                break;
            }
            adjacencyList.current = adjacencyList.current.next;
        }
        if (!parentExist) {
            throw new IllegalArgumentException("Parent node does not exist in the graph");
        }
        if(!childExist) {
            throw new IllegalArgumentException("Child node does not exist in the graph");
        }
    }

    public List<Node> getNodes() {
        List<Node> nodeList = new ArrayList<>();
        adjacencyList.current = adjacencyList.head;
        while (adjacencyList.current != null) {
            nodeList.add(adjacencyList.current.value.head.value.getNode());
            adjacencyList.current = adjacencyList.current.next;
        }
        return nodeList;
    }

    public List<Tuple> getNeighbors(Node parent) {
        List<Tuple> neighborList = new ArrayList<>();
        adjacencyList.current = adjacencyList.head;
        while (adjacencyList.current != null) {
            if(adjacencyList.current.value.head.value.getNode() == parent) {
                adjacencyList.current.value.current = adjacencyList.current.value.head.next;
                while(adjacencyList.current.value.current != null) {
                    neighborList.add(adjacencyList.current.value.current.value);
                    adjacencyList.current.value.current = adjacencyList.current.value.current.next;
                }
                break;
            }
            adjacencyList.current = adjacencyList.current.next;
        }
        return neighborList;
    }

    public int size() {
        int count = 0;
        adjacencyList.current = adjacencyList.head;
        while (adjacencyList.current != null) {
            count++;
            adjacencyList.current = adjacencyList.current.next;
        }
        return count;
    }
}
