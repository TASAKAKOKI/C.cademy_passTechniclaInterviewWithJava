Basic Hash Maps
    Now that we have all of the main ingredients for a hash map, let’s put them all together. 
        :First, we need some sort of associated data that we’re hoping to preserve.
        :Second, we need an array of a fixed size to insert our data into. :Lastly, we need a hash function that translates the keys of our array into indexes into the array.
    The storage location at the index given by a hash is called the hash bucket.

    Let’s use the following example for our hash map:
        Key: Album Name                                     Value: Release Year
        People’s Instinctive Travels and the Paths of Rhythm	1990
        The Low End Theory	                                    1991
        Midnight Marauders	                                    1993
        Beats, Rhymes and Life	                                1996

    Our map here relates the first four A Tribe Called Quest studio albums with the year they were produced in. We’ll need an array of at least size 4 to contain all of these elements. And a way to turn each album name into an index into that array.

    For each album name, find that album’s hash by performing the following calculation:
        hash value = ((number of 'a's in album title) + (number of 'e's in album title))

    And then take that hash and calculate an array index by performing hash value mod 4. Following these steps we get the following schema:
        Album Name	                                 /Hash/Hash mod 4/Release Year
        People’s Instinctive Travels and the Paths of Rhythm/ 8	/0	       /1990
        The Low End Theory                                  / 2	/2	       /1991
        Midnight Marauders	                                / 3	/3	       /1993
        Beats, Rhymes and Life	                            / 5	/1	       /1996

    First the key is translated into the hash via our hashing function. Then our hash map performs modulo arithmetic to turn the hash into an array index.

Instructions
    Where would you save the value for a given key? It depends on the length of the array and the key itself. Update the values for those two to see how different keys and array lengths change the place a key is saved.