package DataStructures.Graph;
import DataStructures.LinkedList.LinkedList;
import DataStructures.LinkedList.Node;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class GraphTest {

    @Test
    public void addNodeTest() {
        Graph testList = new Graph();
        Node excell = testList.addNode("hey");
        Node woopa = testList.addNode("woo");

        assertEquals(excell.value, "hey");
        assertEquals(woopa.value, "woo");
        assertEquals(2, testList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addNodeTestFailRepeat() {
        Graph testList = new Graph();
        Node excell = testList.addNode("hey");
        Node excellTwo = testList.addNode("hey");
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

        assertEquals(2, testList.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEdgeTestRepeatFail() {
        Graph testList = new Graph();
        Node excel = testList.addNode("hey");
        Node woopa = testList.addNode("woo");
        testList.addEdge(excel, woopa, 2);
        testList.addEdge(excel, woopa, 4);
    }

    @Test(expected = IllegalArgumentException.class)
    public void addEdgeTestRepeatFailReverse() {
        Graph testList = new Graph();
        Node excel = testList.addNode("hey");
        Node woopa = testList.addNode("woo");
        testList.addEdge(excel, woopa, 2);
        testList.addEdge(woopa, excel, 4);
    }

    @Test
    public void getNodesTest() {
        Graph test = new Graph();
        Node one = test.addNode("Node One");
        Node two = test.addNode("Node Two");
        Node three = test.addNode("Node Three");
        Node four = test.addNode("Node Four");
        Node five = test.addNode("Node Five");

        List<Node> nodeList = test.getNodes();

        assertEquals("Node One", nodeList.get(0).value);
        assertEquals("Node Two", nodeList.get(1).value);
        assertEquals("Node Three", nodeList.get(2).value);
        assertEquals("Node Four", nodeList.get(3).value);
        assertEquals("Node Five", nodeList.get(4).value);

    }

    @Test
    public void getNeighborsTest() {
        Graph test = new Graph();
        Node one = test.addNode("Node One");
        Node two = test.addNode("Node Two");
        Node three = test.addNode("Node Three");
        Node four = test.addNode("Node Four");
        Node five = test.addNode("Node Five");

        test.addEdge(one, two, 1);
        test.addEdge(one, three, 2);
        test.addEdge(one, four, 3);
        test.addEdge(one, five, 4);

        test.addEdge(two, three, 5);
        test.addEdge(two, four, 6);

        List<Tuple> neighborsOne = test.getNeighbors(one);
        List<Tuple> neighborsTwo = test.getNeighbors(two);
        List<Tuple> neighborsThree = test.getNeighbors(three);
        List<Tuple> neighborsFour = test.getNeighbors(four);
        List<Tuple> neighborsFive = test.getNeighbors(five);

        assertEquals(5, test.size());

        assertEquals(4, neighborsOne.size());
        assertEquals(1, neighborsOne.get(0).getEdge());
        assertEquals(2, neighborsOne.get(1).getEdge());
        assertEquals(3, neighborsOne.get(2).getEdge());
        assertEquals(4, neighborsOne.get(3).getEdge());
        assertEquals("Node Two", neighborsOne.get(0).getNode().value);
        assertEquals("Node Three", neighborsOne.get(1).getNode().value);
        assertEquals("Node Four", neighborsOne.get(2).getNode().value);
        assertEquals("Node Five", neighborsOne.get(3).getNode().value);

        assertEquals(3, neighborsTwo.size());
        assertEquals(1, neighborsTwo.get(0).getEdge());
        assertEquals(5, neighborsTwo.get(1).getEdge());
        assertEquals(6, neighborsTwo.get(2).getEdge());
        assertEquals("Node One", neighborsTwo.get(0).getNode().value);
        assertEquals("Node Three", neighborsTwo.get(1).getNode().value);
        assertEquals("Node Four", neighborsTwo.get(2).getNode().value);

        assertEquals(2, neighborsThree.size());
        assertEquals(2, neighborsThree.get(0).getEdge());
        assertEquals(5, neighborsThree.get(1).getEdge());
        assertEquals("Node One", neighborsThree.get(0).getNode().value);
        assertEquals("Node Two", neighborsThree.get(1).getNode().value);

        assertEquals(2, neighborsFour.size());
        assertEquals(3, neighborsFour.get(0).getEdge());
        assertEquals(6, neighborsFour.get(1).getEdge());
        assertEquals("Node One", neighborsFour.get(0).getNode().value);
        assertEquals("Node Two", neighborsFour.get(1).getNode().value);

        assertEquals(1, neighborsFive.size());
        assertEquals(4, neighborsFive.get(0).getEdge());
        assertEquals("Node One", neighborsFive.get(0).getNode().value);

    }

    @Test
    public void emptyGraphTest() {
        Graph test = new Graph();
        assertTrue(test.getNodes().isEmpty());
        assertEquals(0,test.size());
    }

}