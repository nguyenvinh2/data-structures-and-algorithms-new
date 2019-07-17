# Graph Get Edge

## Challenge Description

Given a business trip itinerary, and an Alaska Airlines route map, is the trip 
possible with direct flights? 
If so, how much will the total trip cost be?

## Challenge

### Assignment Requirements

Write a function based on the specifications above, which takes in a graph, 
and an array of city names. Without utilizing any of the built-in methods 
available to your language, return whether the full trip is possible with 
direct flights, and how much it would cost.


## Approach & Efficiency
    
    use Graphs
    iterate through city list
    check the neighboring nodes of the current city to see if it contains
    the next city in the array.

    Big O:
      Space -> O(n) - Creates lists of neighbors
      
     
      Time: 
      O(n) - nested for loops


## Solution:
 
![See Lecture](../../../../../../assets/get_edge.jpg)

  
## Notes
