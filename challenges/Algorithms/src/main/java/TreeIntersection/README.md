# Tree Intersection

Find common values in two trees.

## Challenge

### Assignment Requirements

   
    Write a function that takes two binary tree parameters.
    Without utilizing any of the built-in library methods available to your language, return a set of values found in both trees.


## Approach & Efficiency
    
    PreOrder traversal of first trees to retrieve values to store in hashTable
    preorder traversal of second tree to check if value is contained in hastable
    return list of values contained

    Big O:
      Space -> O(N) - uses list to store values
      
      
      Time: 
      O(N) traverse through the tree, dependent on size


## Solution:
 
![See Lecture](../../../../../../assets/tree_intersection.jpg)

  
## Notes
