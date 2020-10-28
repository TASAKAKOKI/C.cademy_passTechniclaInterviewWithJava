Assign
    We now have everything we need to find a place in the hash map array to store a value. The only thing left to do is assign the value to the index we generated. A method, .assign() will handle the logic needed to take in a key-value pair and store the value at a particular index.

    A general outline of how .assign() will work is this:
        Store the hashed key in a variable arrayIndex.
        Assign the value to the element at arrayIndex in the hash map.

Instructions
    1.
    Declare a public HashMap method called .assign() with the String parameters key and value that returns void.

    2.
    Declare a variable of type int called arrayIndex with the value of the hashed and compressed key.

    3.
    Assign the value to the element of this.hashmap at the index you derived from hashing, arrayIndex.

    4.
    Check your work. At the bottom of the HashMap.java file store a new instance of HashMap with a size of 3 in a variable named employees. Assign employees a new key-value pair where the key is "34-567" and the value is "Mara".