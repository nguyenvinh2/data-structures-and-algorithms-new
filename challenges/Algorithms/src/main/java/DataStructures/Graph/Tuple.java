package DataStructures.Graph;

import DataStructures.LinkedList.Node;

public class Tuple<T> {
    private Node node;
    private T edge;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public T getEdge() {
        return edge;
    }

    public void setEdge(T edge) {
        this.edge = edge;
    }


    public Tuple(Node node, T edge) {
        this.node = node;
        this.edge = edge;
    }

    public Tuple(Node node) {
        this.node = node;
    }
}
