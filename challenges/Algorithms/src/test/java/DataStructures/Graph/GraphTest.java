package DataStructures.Graph;
import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNodeTest() {
        Graph testList = new Graph();
        Node excell = testList.addNode("hey");
        Node woopa = testList.addNode("woo");

        assertEquals(excell.value, "hey");
        assertEquals(woopa.value, "woo");
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEdgeTestFailChild() {
        Graph testList = new Graph();
        Node excel = testList.addNode("hey");
        Node woopa = testList.addNode("woo");
        testList.addEdge(excel, new Node("woo"), 2);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEdgeTestFailParent() {
        Graph testList = new Graph();
        Node excel = testList.addNode("hey");
        Node woopa = testList.addNode("woo");
        testList.addEdge(new Node("hey"), woopa, 2);
    }

    @Test
    public void addEdgeTest() {
        Graph testList = new Graph();
        Node excel = testList.addNode("hey");
        Node woopa = testList.addNode("woo");
        testList.addEdge(excel, woopa, 2);

        LinkedList parentList = (LinkedList) testList.getAdjacencyList().head.value;
        Tuple tuple = (Tuple) parentList.head.next.value;

        LinkedList childList = (LinkedList) testList.getAdjacencyList().head.next.value;
        Tuple tupleChild = (Tuple) childList.head.next.value;

        assertEquals(2, tuple.getEdge());
        assertEquals("woo", tuple.getNode().value);

        assertEquals(2, tupleChild.getEdge());
        assertEquals("hey", tupleChild.getNode().value);
    }

}