Collisions
    Remember hash functions are designed to compress data from a large number of possible keys to a much smaller range. Because of this compression, it’s likely that our "hash function might produce the same hash for two different keys". This is known as a "hash collision". There are several strategies for resolving hash collisions.

    The first strategy we’re going to learn about is called "separate chaining". The separate chaining strategy avoids collisions by updating the underlying data structure. Instead of an array of values that are mapped to by hashes, it could be an array of linked lists!

Instructions
    When is it most likely for a collision to happen? Can a collision happen when the array is empty?