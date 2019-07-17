package GetEdge;

import DataStructures.Graph.Graph;
import DataStructures.Graph.Tuple;
import DataStructures.LinkedList.Node;

import java.util.List;

public class GetEdge {

    public static String directFlights(String[] cities, Graph graph) {
        if (cities.length <= 1 || graph.size() <= 1) {
            return "Invalid Input";
        }
        int costs = 0;
        boolean directPath = true;
        List<Node> cityNodes = graph.getNodes();
        for (int i = 0; i < cities.length-1; i++)
        {
            directPath = false;
            Node city = returnCityNode(cities[i], cityNodes);
            List<Tuple> neighborNodes = graph.getNeighbors(city);
            for(int j = 0; j < neighborNodes.size(); j++) {
                if (neighborNodes.get(j).getNode().value == cities[i+1]) {
                    costs += (int) neighborNodes.get(j).getEdge();
                    directPath = true;
                    break;
                }
            }
            if (!directPath) {
                break;
            }
        }
        if(!directPath) {
            return "false, $0";
        } else {
            return "true, $" + costs;
        }
    }

    private static Node returnCityNode(String city, List<Node> allCities) {
        for(int i = 0; i < allCities.size(); i++) {
            if(allCities.get(i).value.equals(city)) {
                return allCities.get(i);
            }
        }
        return null;
    }
}
