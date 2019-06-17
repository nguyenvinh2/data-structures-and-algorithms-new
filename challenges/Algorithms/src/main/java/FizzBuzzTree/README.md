# Fizz Buzz Tree

Conduct “FizzBuzz” on a tree while traversing through it. Change the values of each of the nodes dependent on the current node’s value

## Challenge Requirements

Write a function called FizzBuzzTree which takes a tree as an argument.
Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:

    If the value is divisible by 3, replace the value with “Fizz”
    If the value is divisible by 5, replace the value with “Buzz”
    If the value is divisible by 3 and 5, replace the value with “FizzBuzz”

Return the tree with its new values.


Visual

                 3          =>          Fizz
                /\                       /\
               5  8                   Buzz 8
              /\                       /\
             4  15                    4  FizzBuzz

## Approach & Efficiency

[Test Code](../../../test/java/FizzBuzzTree)

    Big O:
      Space -> O(1) -  Using existing Tee
      Time -> O(N) - Have to go through entire tree

## Solution

![Kth](../../../../../../assets/fizz_buzz_tree.jpg)

## Notes