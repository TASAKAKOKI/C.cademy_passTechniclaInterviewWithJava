Retrieve
    To be a fully functional hash map, we have to be able to retrieve the values we are storing. To implement retrieval for our hash map we’ll create a new HashMap method, .retrieve().

    This method will make use of .hash()‘s deterministic nature to find the value we’re looking for in the hash map.

Instructions
    1.
    Define a method .retrieve() for HashMap with a return type String. It should have one parameter, key, the key of the value we want to retrieve. For now, return an empty String.

    2.
    .retrieve() should calculate the array index in the same way .assign() does and then retrieve the value at that index.

    Inside of retrieve() declare an int arrayIndex with the value of the hashed key. Use the HashMap method that takes a key and returns an index in the hash map’s array.

    Return the value stored at the arrayIndex of this.hashmap.

    3.
    Check your work. At the bottom of the HashMap.java file declare a new hash map aboutMe that stores a hashmap with a size of 3.
        Add a new key of: "favoriteColor”
        With a value of: "brown”
        
    Call .retrieve() using “favoriteColor” as the key. Print the results. What do you expect to print?