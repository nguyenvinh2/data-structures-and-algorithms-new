# Stack and Queue

Stack and Queue data structure for algorithm problem solving.

## Challenge

Implement a Stack and a Queue. Your Stack should meet the following criteria:

    O(1) - .push(Node node) - Add a node to the stack
    O(1) - .pop() - removes and return the top node of the stack
    O(1) - .peek() - returns the top node of the stack.

Your Queue should meet the following criteria:

    O(1) - .enqueue(Node node) - Add a node to the queue
    O(1) - .dequeue() - removes and return the front node of the queue
    O(1) - .peek() - returns the front node of the queue.


## Approach & Efficiency

    Collection of Nodes to store data, similary to Linked Lists but differs in order

    Big O:
      Space -> O(N)
      Time -> O(1)

## API

    Stack
    
        push(Node node) - Add a node to the stack
        pop() - removes and return the top node of the stack
        peek() - returns the top node of the stack.

    Queue
    
        enqueue(Node node) - Add a node to the queue
        dequeue() - removes and return the front node of the queue
        peek() - returns the front node of the queue.

## Notes