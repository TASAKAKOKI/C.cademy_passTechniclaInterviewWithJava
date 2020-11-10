Shortest Path to a Target Vertex
    Our current implementation of Dijkstra’s returns the shortest paths for all of the vertices in the graph. We can build upon this to create a method "shortestPathBetween" that "reconstructs the full path to one vertex".

    We will need to make a call to dijkstras() to get the map of distances and previous vertices. From there "we can grab the target vertex’s shortest distance from distances" and "build the entire path using the previous vertices".

    We "cannot do this while dijkstra() continues to calculate the paths", because we cannot guarantee that the first encounter of the target vertex is the shortest path. Doing it after all the paths have been evaluated covers the possibility that an alternate path later in the queue will be shorter than the first one, particularly when there are negative distances.

Instructions
    1.
    We should first supply our shortestPathBetween() method with the graph, starting vertex, and target vertex.

    Add 3 parameters to the shortestPathBetween() method: Graph g, Vertex startingVertex, and Vertex targetVertex.

    2.
    Now we should make a call to dijkstra() to retrieve the shortest distances and previous vertices. Create a Dictionary[], dijkstraDicts and set it equal to the value of calling dijkstra() and pass the given g and startingVertex as arguments.

    Create a Dictionary distances and set it to the first index value of dijkstraDicts. Create a Dictionary previous and set it to the second index value of dijkstraDicts.
        Dictionary[] dijkstraDicts = dijkstra(g, startingVertex);
        Dictionary distances = dijkstraDicts[___];
        Dictionary previous = dijkstraDicts[___];

    3.
    We will want to return the shortest distance from the starting vertex to the target vertex. We can access this in distances using the targetVertex’s data.

    After creating our dictionaries distances and previous, create an Integer distance and set it to the target vertex’s shortest distance in distances. Remember, you can get the value out of distances by using the target vertex’s data as the key.
        Integer distance = (Integer) distances.get(targetVertex.getData());
    
    4.
    Next, we want to print out a message to the terminal: “Shortest Distance between the startingVertex and the targetVertex”. Then, on the next line print the value of distance. In this step we will print out the following:
        Shortest Distance between A and G
        -38

    This will print when we call shortestPathBetween() in our main() method. Underneath distance, please add:
        ...
        Integer distance = (Integer) distances.get(targetVertex.getData());
        System.out.println("Shortest Distance between " + startingVertex.getData() + " and " + targetVertex.getData());
        System.out.println(distance);
        ...
    Let’s check our work. Print out our results of calling shortestPathBetween() on vertices a and g at the bottom of our main() method. We should see:
        Shortest Distance between A and G
        -38

    5.
    We also want to construct the path and return it back. Since each entry in previous is a reference to the previous vertex in the shortest path, we can walk backwards through the previous vertices and store the vertex in our path. This is similar to a linked list traversal, just in reverse.

    After we have printed our message, create an ArrayList for Vertex‘s named path, and set it to a new ArrayList.

    Then create a temporary Vertex, tempVertex, and set it to the targetVertex. This is the end of the path where we will start our backwards traversal.

    6.
    We will add tempVertex into the path, set the next vertex to the previous vertex, and repeat until there are no vertices left in the path. To do this, we will set up a while loop to control the iterations.

    When there are no vertices left, then the vertex will be Null. After tempVertex is initialized, set up a while loop that continues to run as long as vertexs data is not Null.

    Inside the loop, call .add() on path and pass in 0 and the vertex tempVertex. This will allow the vertex to be inserted at the beginning of the array instead of the end.

    We will also want to update tempVertex to be the previous vertex so it can get added in. Set tempVertex to the tempVertex’s data in previous.

    7.
    Next, we want to print to the terminal the message Shortest Path with the shortest path printed out on the next line.

    After the while loop print out Shortest Path. On the next line loop through our ArrayList path with a for-each loop. Capture each item in our ArrayList with Vertex pathVertex. By printing the data property of each vertex.
        System.out.println("Shortest Path");
        for (Vertex pathVertex: path) {
            System.out.println(pathVertex.___);
        }

    All that’s left is to print out our results of calling shortestPathBetween() again on vertices a and g when we run our code. We should see:
        Shortest Distance between A and G
        -38
        Shortest Path
        A
        D
        E
        G
    the distance is -38 and the path is A, D, E, and G.