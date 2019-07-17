package DepthFirst;

import DataStructures.Graph.Graph;
import DataStructures.Graph.Tuple;
import DataStructures.LinkedList.Node;

import java.util.ArrayList;
import java.util.List;

public class DepthFirst {
    public static List<Node> traverse(Graph graph) {
        if (graph.size() > 0) {
            List<Node> depthList = new ArrayList<>();
            List<Node> nodeList = graph.getNodes();
            List<Node> queueList = new ArrayList<>();
            queueList.add(nodeList.get(0));
            depthList.add(nodeList.get(0));
            traverseHelper(nodeList.get(0), queueList, graph, depthList);
            return depthList;
        }
        return null;
    }

    private static void traverseHelper(Node input, List<Node> queueList, Graph graph, List<Node> depthList) {
        while(queueList.size() != 0) {
            List<Tuple> tuples = graph.getNeighbors(input);
            tuples.forEach(tuple -> {
                if(!depthList.contains(tuple.getNode())) {
                    depthList.add(tuple.getNode());
                    queueList.add(tuple.getNode());
                    traverseHelper(tuple.getNode(), queueList, graph, depthList);
                }
            });
            if (queueList.size() > 0) {
                queueList.remove(queueList.get(0));
            }
        }
    }
}
