package DepthFirst;

import DataStructures.Graph.Graph;
import DataStructures.LinkedList.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DepthFirstTest {

    @Test
    public void traverseTest() {
        Graph testGraph = new Graph();
        Node a = testGraph.addNode("A");
        Node b = testGraph.addNode("B");
        Node c = testGraph.addNode("C");
        Node d = testGraph.addNode("D");
        Node e = testGraph.addNode("E");
        Node f = testGraph.addNode("F");
        Node g = testGraph.addNode("G");
        Node h = testGraph.addNode("H");

        testGraph.addEdge(a, b, 1);
        testGraph.addEdge(a, d, 1);
        testGraph.addEdge(b, c, 1);
        testGraph.addEdge(b, d, 1);
        testGraph.addEdge(c, g, 1);
        testGraph.addEdge(d, e, 1);
        testGraph.addEdge(d, h, 1);
        testGraph.addEdge(d, f, 1);
        testGraph.addEdge(h, f, 1);

        List<Node> expected = new ArrayList<>(Arrays.asList(a, b, c, g, d, e, h, f));
        List<Node> depth = DepthFirst.traverse(testGraph);

        assertEquals(expected, depth);
    }

    @Test
    public void traverseTestUnconnected() {
        Graph testGraph = new Graph();
        Node a = testGraph.addNode("A");
        Node b = testGraph.addNode("B");
        Node c = testGraph.addNode("C");
        Node d = testGraph.addNode("D");
        Node e = testGraph.addNode("E");
        Node f = testGraph.addNode("F");
        Node g = testGraph.addNode("G");
        Node h = testGraph.addNode("H");

        List<Node> depth = DepthFirst.traverse(testGraph);

        assertEquals(a, depth.get(0));
        assertEquals(1, depth.size());
    }

    @Test
    public void traverseTestNull() {
        Graph testGraph = new Graph();
        List<Node> depth = DepthFirst.traverse(testGraph);
        assertNull(depth);
    }
}