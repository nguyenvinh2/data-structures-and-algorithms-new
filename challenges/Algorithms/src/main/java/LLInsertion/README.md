# LinkedList Insertion

    Manipulate Linked Lists with various insertion methods.

## Challenge

   Write the following methods for the Linked List class:
   
       .append(value) which adds a new node with the given value to the end of the list
       .insertBefore(value, newVal) which add a new node with the given newValue immediately before the first value node
       .insertAfter(value, newVal) which add a new node with the given newValue immediately after the first value node
   
   Input/Output
   
        .append(value)
        Input 	                    Args 	Output
        head -> [1] -> [3] -> [2]       5 ->   	head -> [1] -> [3] -> [2] -> [5] -> X


        .insertBefore(value, newVal)
        Input 	                    Args 	Output
        head -> [1] -> [3] -> [2]       3, 5 	head -> [1] -> [5] -> [3] -> [2] -> X
        head -> [1] -> [3] -> [2]       1, 5 	head -> [5] -> [1] -> [3] -> [2] -> X
        head -> [1] -> [2] -> [2]       2, 5 	head -> [1] -> [5] -> [2] -> [2] -> X
        head -> [1] -> [3] -> [2]       4, 5 	Exception
   
        .insertAfter(value, newVal)
        Input 	                    Args 	Output
        head -> [1] -> [3] -> [2]       3, 5 	head -> [1] -> [3] -> [5] -> [2] -> X
        head -> [1] -> [3] -> [2]       2, 5 	head -> [1] -> [3] -> [2] -> [5] -> X
        head -> [1] -> [2] -> [2]       2, 5 	head -> [1] -> [2] -> [5] -> [2] -> X
        head -> [1] -> [3] -> [2]       4, 5 	Exception

## Approach & Efficiency

[Solution](./DataStructures/LinkedList)

    Solved using while loops to traverse through LL

    Big O:
      Space -> O(N)
      Time -> O(N)

## Solution

![LLI]()

## Notes