Compression
    The current hashing function will return a wide range of integers — some of which are not indices of the hash map array. In our previous exercise if we hash “car” we returned the number 310. This is a problem because our hash map was size 3 and did not have that many indices. To fix this, we need to use compression.

    "Compression" means 'taking some input' and 'returning an output only within a specific range'.

    In our hash map implementation, we’re going to have our hashing function handle compression in addition to hashing. This means we’ll add an additional line of code to compress the hashCode before we return it.

    The updated .hash() should follow these steps:
        initialize hashCode variable to 0

        for each character in the key
            add the character code and hashCode to hashCode

        return compressed hashCode
    
    Currently, our .hash() method is generating an integer representing an index but it’s not guaranteed that this index will be within the bounds of the hash map’s array.

    To do this, we’ll use "modular arithmetic". Because modular arithmetic prevents a value from growing larger than some limit, it’s a common solution when we want a value to “wrap around”.

    The modulo operator, %, in Java returns the remainder when dividing two numbers.

    For example:
        11 % 2 // => 1

Instructions
    1.
    After the for loop in the .hash() method of HashMap, compress the value stored in hashCode by using modular arithmetic to return the remainder of dividing hashCode by the length of the hash map.

    2.
    Check your work. Save a new HashMap instance with a size of 3, in a variable named myHashMap. Call .hash() using the key car and print the result. Hash and log car again. Are the logged values the same or are they different?