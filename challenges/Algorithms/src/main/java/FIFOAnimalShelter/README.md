# FIFO Animal Shelter

First-in, First out Animal Shelter.

## Challenge

Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.

    Implement the following methods:
    
        enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
        dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.
        dequeue(): returns the animal that has been in the shelter the longest.

        
## Approach & Efficiency

[Test Code](../../../test/java/FIFOAnimalShelter)

    Solved using 4 queues. 2 dedicated to holding dogs or cats. The other 2 holds the timestamp for each corresponding animal that is placed in the shelter for comparison.

    Big O:
      Space -> O(N) - Stacks take up spaced dependent on the number of Nodes on the "Queue"
      Time -> O(1) - Always gets the first Node at the front.

## Solution

![Shelter](../../../../../../assets/aninal_shelter.jpg)

## Notes