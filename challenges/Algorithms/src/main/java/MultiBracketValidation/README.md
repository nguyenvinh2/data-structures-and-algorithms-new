# Queue With Stacks

Multi-bracket Validation.

## Challenge

Create a validation method that takes in a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

    Round Brackets : ()
    Square Brackets : []
    Curly Brackets : {}

Visual

    Input 	                    Output
    {} 	                    TRUE
    {}(){} 	                    TRUE
    ()[[Extra Characters]] 	    TRUE
    (){}[[]] 	            TRUE
    {}{Code}[Fellows](()) 	    TRUE
    [({}] 	                    FALSE
    (]( 	                    FALSE
    {(}) 	                    FALSE
        
## Approach & Efficiency

[Test Code](../../../test/java/MultiBracketValidation)

    Solved using for loop and a Stack

    Big O:
      Space -> O(N) - Stacks take up spaced dependent on the number of brackets.
      Time -> O(N) - for loops dependeds on the number of Nodes

## Solution

![Kth](../../../../../../assets/multi_bracket_validation.jpg)

## Notes