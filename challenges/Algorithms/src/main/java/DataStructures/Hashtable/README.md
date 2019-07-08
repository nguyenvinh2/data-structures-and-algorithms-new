# Hashtable

Create a Hashtable Data Structure

## Challenge

### Assignment Requirements

Implement a Hashtable with the following methods:

    add: takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    get: takes in the key and returns the value from the table.
    contains: takes in the key and returns a boolean, indicating if the key exists in the table already.
    hash: takes in an arbitrary key and returns an index in the collection.



## Approach & Efficiency

    Static array of LinkedLists (size = 1024) to store values

    Big O:
      Space => O(1) provided there is no collision. Otherwise linkedlist will
      grow in size.
      
      
      Time => O(1) provided no collision

## API

    add(String key, T value) => takes in both the key and value. This method should hash the key, and add the key and value pair to the table, handling collisions as needed.
    get(String key) => takes in the key and returns the value from the table.
    contains(String key) => takes in the key and returns a boolean, indicating if the key exists in the table already.
    hash(String key) => static method, takes in an arbitrary key and returns an index in the collection.
    
## Notes
