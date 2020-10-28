Intro to Hash Maps
    "Hash maps" are 'data structures that serve as efficient key-value stores'. They are 'capable of assigning and retrieving data in the fastest way possible'. This is because the underlying 'data structure that hash maps use is an "array"'.

    A value is stored at an 'array index determined by plugging the key into a hash function'. Because we always know exactly where to find values in a hash map, we have constant access to any of the values it contains.

    This quick access to values makes a hash map a good choice of data structure whenever we need to store a lot of values but need fast look-up time.

    In this lesson you will create your own implementation of a hash map by building out a HashMap class. You’ll build:
        : methods to hash 
        : and compress a given key,
        : assign an index at which to store a value,
        : and retrieve that value.

    To implement a hash map, the "HashMap constructor method will create an empty array that will hold values". A "hashing function will return an index in the array where the value will be stored". While going through the following exercises, remember that the purpose of this lesson is to gain a deeper understanding of the data structure rather than creating a production-quality data structure.

Instructions
    The hash map class we will be completing is stored in the HashMap.java file. Look over the code you’ve been given which includes the constructor method.

    "Hash maps are based on arrays", so whenever we create a new hash map instance, we’ll create a String array filled with null values that can be replaced with key-value pairs.