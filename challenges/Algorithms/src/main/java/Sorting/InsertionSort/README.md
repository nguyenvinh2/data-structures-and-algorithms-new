# Insertion Sort

Implement Insertion Sort

## Challenge

### Assignment Requirements

Complete a working, tested implementation of Insertion Sort, based on the pseudo code provided

        InsertionSort(int[] arr)
          
            FOR i = 1 to arr.length
            
              int j <-- i - 1
              int temp <-- arr[i]
              
              WHILE j >= 0 AND temp < arr[j]
                arr[j + 1] <-- arr[j]
                j <-- j - 1
                
              arr[j + 1] <-- temp



## Approach & Efficiency

    Collection of Nodes to store data, similary to Linked Lists but differs in order

    Big O:
      Space -> O(1)
      
      
      Time: 
      O(N^2) due to nested loops


## Solution: [See Lecture](LECTURE_NOTES.md)

    Use nested loops.
    iterate forward in the for loop starting from the second index till the end
    Keep a temp to remember the latest for loop variable
    use a while loop to swap numbers if the previous number is greater than the current one
    iterate down in the while loop until out of index range or previous value is less than current one
    update the current index with the stored temp variable
    TADA.

## Notes
