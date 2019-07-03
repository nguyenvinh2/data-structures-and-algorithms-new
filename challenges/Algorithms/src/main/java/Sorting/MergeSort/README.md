# Merge Sort

Implement Merge Sort

## Challenge

### Assignment Requirements

Complete a working, tested implementation of Merge Sort, based on the pseudo code provided

        ALGORITHM Mergesort(arr)
            DECLARE n <-- arr.length
                   
            if arr.length > 1
              DECLARE mid <-- n/2
              DECLARE b <-- arr[0...mid]
              DECLARE c <-- arr[mid...n]
              // break down the left side
              Mergesort(b)
              // break down the right side
              Mergesort(c)
              // merge the left and the right side together
              Merge(b, c, arr)
        
        ALGORITHM Merge(b, c, a)
            DECLARE i <-- 0
            DECLARE j <-- 0
            DECLARE k <-- 0
        
            while i < b && j < c
                if b[i] <= c[j]
                    a[k] <-- b[i]
                    i <-- i + 1
                else
                    a[k] = c[j]
                    j <-- j + 1
                    
                k <-- k + 1
        
            if i = b.length
               add remaining items in array c to array a
            else
               add remaining items in array b to array a
               
            return a



## Approach & Efficiency

    Big O:
      Space -> O(N)
      
      
      Time: 
      O(NlogN)


## Solution: [See Lecture Notes](LECTURE_NOTES.md)

## Notes
