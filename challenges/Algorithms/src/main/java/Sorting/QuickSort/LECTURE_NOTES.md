# Quick Sort Lecture

## Learning Objectives

How to implement a quick sort.

## Lecture Flow

- Ask students how was their day, questions, concerns.
- Discuss sorting in general
- Introduce Quick Sort
- Show video of merge sort in action
- Discuss algorithm
- Code demo
- Any Questions?

## Diagram

![Insertion](quicksort.png)
[Source](https://www.techiedelight.com/quicksort/)

## Algorithm

    Use recursion
    
    Define a pivot point based on the range of the unsorted array (until the array size is 0)
    
    pivot is based on a partition method:
        use while loop:
        set an array value of the pivot point to equal left most value of array
        check values from the left so see if it is less than the pivot value
        iterate forward until it is no longer less - keep track of this left index
        
        do the converse of the right-most value of the array, check to see if it is
        greater than the pivot value, iterate backwards until it is no longer greater -
        keep track of this right index
        
        compare the left index value to the right index value, if left < right
        swap the two array values.
        
        if the array values are equal iterate left forward
        
        if left is not < right, return right as the new pivot point.
        
    use the pivot point as the array partition point and recursively call
    the quicksort method again for the split arrays
    
    i.e. 
    
    sortRange(unsortArray, start, pivot - 1);
    sortRange(unsortArray, pivot + 1, stop);
        
        
## Pseudo

        ALGORITHM QuickSort(arr, left, right)
            if left < right
                // Partition the array by setting the position of the pivot value 
                DEFINE position <-- Partition(arr, left, right)
                // Sort the left
                QuickSort(arr, left, position - 1)
                // Sort the right
                QuickSort(arr, position + 1, right)
        
        ALGORITHM Partition(arr, left, right)
            // set a pivot value as a point of reference
            DEFINE pivot <-- arr[left]
            
            while true
                while arr[left] < pivot
                    left++;
                while arr[right] > pivot
                    right++
                if left < right
                      DEFINE temp;
                      temp <-- arr[i]
                      arr[i] <-- arr[low]
                      arr[low] <-- temp
                      
                      if arr[left] = arr[right]
                        left++
                else 
                    return right;
                     
## Readings and References

### Watch

- [Video](https://www.youtube.com/watch?v=ywWBy6J5gz8)

### Read

- [Reading #1](https://www.geeksforgeeks.org/quick-sort/)
- [Reading #2](https://en.wikipedia.org/wiki/Merge_sort)

### Bookmark

- [Website](https://www.khanacademy.org/computing/computer-science/algorithms)


