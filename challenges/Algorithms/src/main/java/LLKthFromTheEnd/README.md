# LinkedList Kth From the End

    Get the k-th value from the end of a linked list.

## Challenge

   Write a method for the Linked List class which takes a number, k, as a parameter. Return the node’s value that is k from the end of the linked list. You have access to the Node class and all the properties on the Linked List class as well as the methods created in previous challenges.

        Data                        Arg     Output
        
        head -> [2] -> [4] -> [5]   0       [5]
        head -> [2] -> [4] -> [5]   1       [4]
        head -> [2] -> [4] -> [5]   3       Exception
        
## Approach & Efficiency

[Solution Code](../DataStructures/LinkedList)

    Solved using while loops to traverse through LL

    Big O:
      Space -> O(1) - Only using a set number of Nodes
      Time -> O(N)

## Solution

![Kth](../../../../../../assets/kth_linkedlist.jpg)

## Notes

Challenge done in existing Linked List Data Structure