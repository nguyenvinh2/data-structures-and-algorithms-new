# Breadth First Graph Traversal

Breadth-first Traversal of a graph

## Challenge Requirements

Extend your graph object with a breadth-first traversal method that accepts a 
starting node. Without utilizing any of the built-in methods available to your 
language, return a collection of nodes in the order they were visited. Display 
the collection.

Visual

                    3---5
                       /\     =>          3, 5, 5, 8, 4, 15
                      5--8            
                      /\ /                                    
                     4  15                   

## Approach & Efficiency

[Code](../../../main/java/DataStructures/Graph/Graph.java)

[Test Code](../../../test/java/DataStructures/Graph/GraphTest.java)

    Big O:
      Space -> O(N) -  Using a list to store nodes
      Time -> O(N^2) - nested while loop

## Solution

![Kth](../../../../../../assets/breadth_graph.jpg)

## Notes