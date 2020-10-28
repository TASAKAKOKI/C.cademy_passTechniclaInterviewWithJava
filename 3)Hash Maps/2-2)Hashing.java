Hashing
    The hashing function is the secret to efficiently storing and retrieving values in a hash map. A hashing function "takes a key as input" and "returns an index within the hash map’s underlying array".

    This function is said to be deterministic. That means the hashing function must always return the same index when given the same key. This is important because we will need to hash the key again later to retrieve the stored value. We won’t be able to do this unless our hashing function behaves in a predictable and consistent way.

    Getting an integer representing an index can be done by summing the character codes, or integer representation, of all the characters in the key, a string. A variable can be used to keep track of the running total of the character codes until .hash() is finished looping over the key and the sum can be returned.

    The code for the hashing function should look something like this:
        declare hashCode variable with value of 0

        for each character in the key
            add the character code value to hashCode

        return hashCode
    
Instructions
    1.
    Create a public HashMap method, .hash(), with key as a parameter. This method will take a String and use it to generate an index in the hash map’s internal array. This method will return an int value. For now, in your method body, return 0. We’ll change that soon!

    2.
    To generate an index for each key-value pair, we’ll calculate a number based on the characters in the input String. Declare a variable of type int whose value can be changed within .hash() called hashCode. Assign it an initial value of 0.

    Return hashCode.

    This variable will keep a running total of character codes.

    3.
    After declaring hashCode but before the return statement create a for loop that loops over each character in key.

    4.
    Inside of the for loop convert each character in key to an integer using the Java .codePointAt() method of Character class.

    This method accepts two parameters. A sequence of characters and the index to the character values to be converted and returns the Unicode point at the given index.

    This method only works on strings and converts a character at a specific index into an integer between 0 and 65535. This integer represents the equivalent Unicode value of that character.

    To use Character.codePointAt() call it on a String and provide the index of the character you want the character code of:
        // The code below will return the character code of 'H'
        Character.codePointAt(“Hello world!”, 0); // => 104
        // The code below will return the character code of 'e'
        Character.codePointAt(“Hello world!”, 1); // => 101
    Add the result of calling .codePointAt() on the current character index saved in the loop iterator variable to the hashCode variable.

    5.
    Let’s test our code. In the main method provided, create a new hash map with an array size of 3 and save it to a variable name newHashMap. Call the .hash() method multiple times on newHashMap passing in the Strings “c”, “ca” and “car”. Print the results to the terminal. Note how the hash value changes as the input changes. In our next lesson we will address what happens when the hash value is greater than the size of our hash map.