package DataStructures.Graph;
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

}