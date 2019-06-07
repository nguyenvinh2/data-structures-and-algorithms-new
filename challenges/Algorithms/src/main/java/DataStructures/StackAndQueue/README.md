# Stack and Queue

Stack and Queue data structure for algorithm problem solving.

## Challenge

### Assignment Requirements

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
        
        Instantiation:
        new Stack()
        new Stack(Node input)
        
        Methods:
        push(Node input) - Add a node of any value to the top of the stack
        pop() - remove and return the top node of the stack
        peek() - return but not remove the top node of the stack.

    Queue
    
        Instantiation:
        new Queue()
        new Queue(Node node)
        
        Methods:
        enqueue(Node node) - Add a node to the queue
        dequeue() - remove and return the front node of the queue
        peek() - return but not remove the front node of the queue.

## Notes
