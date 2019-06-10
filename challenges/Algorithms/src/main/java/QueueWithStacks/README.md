# Queue With Stacks

Implement a Queue using two Stacks.

## Challenge

Create a brand new PseudoQueue class. Do not use an existing Queue. Instead, this PseudoQueue class will implement our standard queue interface (the two methods listed below), but will internally only utilize 2 Stack objects. Ensure that you create your class with the following methods:

    enqueue(value) which inserts value into the PseudoQueue, using a first-in, first-out approach.
    dequeue() which extracts a value from the PseudoQueue, using a first-in, first-out approach.

The Stack instances have only push, pop, and peek methods. You should use your own Stack implementation. Instantiate these Stack objects in your PseudoQueue constructor.

    enqueue(value)
	                        Args 	Output
    [10]->[15]->[20] 	5 	[5]->[10]->[15]->[20]
  
    dequeue()
  	                        Output 	Internal State
    [5]->[10]->[15]->[20] 	20 	[5]->[10]->[15]
    [5]->[10]->[15] 	15 	[5]->[10]
        
## Approach & Efficiency

[Test Code](../../../test/java/QueueWithStacks)

    Solved using while loops with stacks for enqueue

    Big O:
      Space -> O(N) - Stacks take up spaced dependent on the number of Nodes on the "Queue"
      Time -> O(N) - While loops dependeds on the number of Nodes

## Solution

![Kth](../../../../../../assets/queue_with_stacks.jpg)

## Notes

Challenge done in existing Stack Data Structure