Tracking the Shortest Path
    The next thing "we want to track is the shortest paths to each vertex". Instead of recording the full path to every vertex, "we just need the previous vertex". This is because we are guaranteed that the vertices leading up to the previous vertex are also the shortest distance, and we can reconstruct the full path by tracing through each vertex’s previous vertex.

Instructions
    1.
    After the distances Dictionary is created, create another Dictionary, previous, expecting a key String and a value Vertex and set it equal to a new empty Hashtable. This will be a map of every vertex to its corresponding previous vertex.

    We will also need to initialize the vertices in the previous dictionary. In the for-each loop and after the distances are initialized, map each v’s data in the previous dictionary to a new vertex with data of Null. This accounts for situations where the graph is disconnected, or there are vertices that do not have edges leading to them.

    2.
    Now, you may be wondering, “but the distance from the starting vertex to the starting vertex is 0, not Integer.MAX_VALUE!” Let’s resolve this by adjusting the initial distance for the starting vertex.

    After we finish iterating through the graph’s vertices, set the distance of the startingVertex data in distances to 0.

    3.
    Great! Now we want to return the results of our evaluations in distances and previous. This allows for the user who makes a call to our method to use these computed values.

    You can now return an Array of dictionaries instead of null. The first element is the distances Dictionary while the second element is the previous Dictionary.
        return new Dictionary[]{___, ___};

    4.
    Let’s go ahead and check our output for dijkstra() to make sure we set up our distances and previous Dictionaries correctly.

    In the main() method, we have already set up a test graph, testGraph. Let’s call dijkstraResultPrinter(), after we add our edges to our testGraph, and pass in an argument dijkstra(testGraph, a);.

    In the distances Dictionary, we should see A with a distance of 0 and the remaining vertices in the graph mapped to 2147483647, the equivalent of Integer.MAX_VALUE. In previous, we should see every vertex in the graph mapped to Null.

    If you would like, you can take a look at the dijkstraResultsPrinter() method to see how we are printing this information.