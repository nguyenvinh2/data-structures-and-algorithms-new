# Tree

Create a Tree Data Structure

## Challenge

### Assignment Requirements

- Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
- Create a BinaryTree class

        Define a method for each of the depth first traversals called preOrder, inOrder, 
        and postOrder which returns an array of the values, ordered appropriately.

- At no time should an exception or stack trace be shown to the end user. Catch and handle any such exceptions and return a printed value or operation which cleanly represents the state and either stops execution cleanly, or provides the user with clear direction and output.
    
- Create a BinarySearchTree class
                
        Define a method named add that accepts a value, and adds a new node with 
        that value in the correct location in the binary search tree.
        
        Define a method named contains that accepts a value, and returns a boolean 
        indicating whether or not the value is in the tree at least once.



## Approach & Efficiency

    Collection of Nodes to store data, similary to Linked Lists but differs in order

    Big O:
      Space -> O(N)
      
      
      Time: 
      preOrder -> O(n)
      inOrder -> O(n)
      postOrder -> O(n)
      
      BST contains -> log2(O(n))

## API

    Binary Tree
        
        Instantiation:
        new BinaryTree()
        new BinaryTree(T input)
        
        Methods:
        getRoot() - returns value of root node.
        getRootNode() - retuns root node.
        addLeftChild(Node root, T input) - sets value as left child to the selected node
        addRightChild(Node root, T input) - sets valueas right child to the selected node
        inOrder() - retuns a list of values in order.
        preOrder() - returns a list of values pre order.
        postOrder() - returns a list of values postOrder.

    Binary Search Tree
    
        Instantiation:
        new BinarySearchTree()
        new BinarySearchTree(T input)
        
        Methods:
        add(double input) - adds value as a node in the right binary search structure
        contains(double input) - checks if the value exists in the binary search tree. returns boolean

## Notes
