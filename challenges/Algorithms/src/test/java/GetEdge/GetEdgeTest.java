package GetEdge;

import DataStructures.Graph.Graph;
import DataStructures.LinkedList.Node;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetEdgeTest {

    @Test
    public void directFlightsTestTrue() {
        Graph testFlight = new Graph();

        Node pandora = testFlight.addNode("Pandora");
        Node metroville = testFlight.addNode("Metroville");
        Node arendelle = testFlight.addNode("Arendelle");
        Node monstropolis = testFlight.addNode("Monstropolis");
        Node narnia = testFlight.addNode("Narnia");
        Node naboo = testFlight.addNode("Naboo");

        testFlight.addEdge(pandora, arendelle, 150);
        testFlight.addEdge(pandora, metroville, 82);
        testFlight.addEdge(arendelle, monstropolis, 42);
        testFlight.addEdge(arendelle, metroville, 99);
        testFlight.addEdge(metroville, narnia, 37);
        testFlight.addEdge(metroville, naboo, 26);
        testFlight.addEdge(metroville, monstropolis, 105);
        testFlight.addEdge(narnia, naboo, 250);
        testFlight.addEdge(naboo, monstropolis, 73);

        String[] flightOne = new String[] {"Metroville", "Pandora"};
        String[] flightTwo = new String[] {"Arendelle", "Monstropolis", "Naboo"};

        assertEquals("true, $82", GetEdge.directFlights(flightOne, testFlight));
        assertEquals("true, $115", GetEdge.directFlights(flightTwo, testFlight));
    }

    @Test
    public void directFlightsTestFalse() {
        Graph testFlight = new Graph();

        Node pandora = testFlight.addNode("Pandora");
        Node metroville = testFlight.addNode("Metroville");
        Node arendelle = testFlight.addNode("Arendelle");
        Node monstropolis = testFlight.addNode("Monstropolis");
        Node narnia = testFlight.addNode("Narnia");
        Node naboo = testFlight.addNode("Naboo");

        testFlight.addEdge(pandora, arendelle, 150);
        testFlight.addEdge(pandora, metroville, 82);
        testFlight.addEdge(arendelle, monstropolis, 42);
        testFlight.addEdge(arendelle, metroville, 99);
        testFlight.addEdge(metroville, narnia, 37);
        testFlight.addEdge(metroville, naboo, 26);
        testFlight.addEdge(metroville, monstropolis, 105);
        testFlight.addEdge(narnia, naboo, 250);
        testFlight.addEdge(naboo, monstropolis, 73);

        String[] flightOne = new String[] {"Naboo", "Pandora"};
        String[] flightTwo = new String[] {"Narnia", "Arendelle", "Naboo"};

        assertEquals("false, $0", GetEdge.directFlights(flightOne, testFlight));
        assertEquals("false, $0", GetEdge.directFlights(flightTwo, testFlight));
    }

    @Test
    public void directFlightsTestOneCity() {
        Graph testFlight = new Graph();

        Node pandora = testFlight.addNode("Pandora");
        Node metroville = testFlight.addNode("Metroville");
        Node arendelle = testFlight.addNode("Arendelle");
        Node monstropolis = testFlight.addNode("Monstropolis");
        Node narnia = testFlight.addNode("Narnia");
        Node naboo = testFlight.addNode("Naboo");

        testFlight.addEdge(pandora, arendelle, 150);
        testFlight.addEdge(pandora, metroville, 82);
        testFlight.addEdge(arendelle, monstropolis, 42);
        testFlight.addEdge(arendelle, metroville, 99);
        testFlight.addEdge(metroville, narnia, 37);
        testFlight.addEdge(metroville, naboo, 26);
        testFlight.addEdge(metroville, monstropolis, 105);
        testFlight.addEdge(narnia, naboo, 250);
        testFlight.addEdge(naboo, monstropolis, 73);

        String[] flightOne = new String[] {"Naboo"};

        assertEquals("Invalid Input", GetEdge.directFlights(flightOne, testFlight));
    }

    @Test
    public void directFlightsTestUnconnectedGraph() {
        Graph testFlight = new Graph();

        Node pandora = testFlight.addNode("Pandora");
        Node metroville = testFlight.addNode("Metroville");
        Node arendelle = testFlight.addNode("Arendelle");
        Node monstropolis = testFlight.addNode("Monstropolis");
        Node narnia = testFlight.addNode("Narnia");
        Node naboo = testFlight.addNode("Naboo");
        String[] flightOne = new String[] {"Naboo", "Narnia"};
        assertEquals("false, $0", GetEdge.directFlights(flightOne, testFlight));
    }
}