# Graph: Adjacency List

## Challenge

Create a custom graph data structure

## Requirements

    The graph should be represented as an adjacency list, and should include the following methods:

    AddNode()
        Adds a new node to the graph
        Takes in the value of that node
        Returns the added node
    AddEdge()
        Adds a new edge between two nodes in the graph
        Include the ability to have a “weight”
        Takes in the two nodes to be connected by the edge
            Both nodes should already be in the Graph
    GetNodes()
        Returns all of the nodes in the graph as a collection (set, list, or similar)
    GetNeighbors()
        Returns a collection of nodes connected to the given node
        Takes in a given node
        Include the weight of the connection in the returned collection
    Size()
        Returns the total number of nodes in the graph


## API

The Graph Data Structure consists of a Nested Linked List which contains a Tuple containing the Node and the Edge value.

    addNode(T value)
        returns Node of value

    addEdge(Node parent, Node child, T weight)
        returns void

    getNodes()
        returns List<Node>

    getNeighbors(Node input)
        returns List<Tuple<Node, Edge>>

    size()
        returns int




