Hash Map Methodology
    "In the case of a map between two things," we don’t really care about the exact sequence of the data. "We only care that a given input", when fed into the map, "gives the accurate output". Developing a data structure that performs this is tricky because computers care much more about values than relationships. A computer doesn’t really care to memorize the astrological signs of all of our friends, so we need to trick the computer into caring.

    We perform this trick using a structure that our computer is already familiar with, an "array". An array uses indices to keep track of values in memory, so "we’ll need a way of turning each key in our map to an index in our array".

    Imagine we want our computer to remember that our good friend Joan McNeil is a Libra. We take her name, and we turn that name into a number. Let’s say that the number we correspond with the name “Joan McNeil” is 17. We find the 17th index of the array we’re using to store our map and save the value (Libra) there.

    How did we get 17, though? We use a special function that turns data like the string “Joan McNeil” into a number. This function is called a "hashing function", or a "hash function". Hashing functions are useful in many domains, but for our data structure the most important aspect is that a hashing function returns an array index as output.

Instructions
    What are some hashing functions we can build with the tools we have so far? What if we add up the number of vowels in the key? What if we assign a value to every letter in the alphabet (say A=1, B=2, etc.,) and add up all of those values? What if the string “Codecademy” returns 1 and all other strings return 0? All of these are hashing functions (some admittedly much more useful than others).

    Does the key to a hash table need to be a string? Can you define a hash function that takes a different kind of input?