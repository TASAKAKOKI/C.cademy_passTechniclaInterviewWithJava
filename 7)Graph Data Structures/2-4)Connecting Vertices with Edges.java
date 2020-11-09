Connecting Vertices with Edges
    Now that we can add vertices to our graph, the next step is to connect them together. We want to provide this functionality in the Graph class to add a layer of abstraction that will simplify adding edges, similar to how we abstracted vertex creation. This is where our Edge class in Edge.java will come in handy. Go ahead and take a look at the class.

    The start and end instance variables mark the vertices connected by the edge. If the graph is directed, we can indicate the direction the edge points (from the start vertex towards the end vertex).

    Moving back to Vertex.java, we will create an .addEdge() method in the Vertex class that connects two vertices together by creating an Edge and adding it to the vertices’ lists of edges. When the Edge is created, it expects two Vertex instances. This tracks the connection between the two vertices.

    We will call this method inside the Graph‘s .addEdge() method to create edges going in both directions between the two vertices. Even though we are currently focusing on undirected graphs, we want to create two edges going in both directions to indicate that the two vertices are interlinked.

Instructions
    1.
    In our Vertex class, create a public .addEdge() method that does not return anything and expects a Vertex endVertex parameter, which will represent the other end of the edge.

    2.
    Next, create an Edge instance to represent the connection from this vertex instance to the endVertex. For now, pass in null for the third argument. We will revisit this in a later exercise to support weighted graphs.

    Add the Edge instance to the vertex’s list of edges to open the connection from one vertex to another.
        When creating an instance of an object, you will want to pass in arguments that the object’s class expects in the constructor. The Edge class expects the following arguments: a starting Vertex instance, an ending Vertex instance, and a weight integer. We should use this as the Vertex instance for the first argument, followed by the endVertex parameter for the second argument, and finally null for the third argument.

        You can either add the new Edge instance directly into the list of edges, or store the Edge instance to a temporary variable and add that variable into the list of edges.

        To verify that we can successfully create an edge between two vertices, create two vertices in the Vertex’s main() method with any value. Add an edge from the first vertex to the second vertex by calling .addEdge() on the first vertex (the vertex at the start of the edge), and passing the second vertex (the vertex at the end of the edge) as an argument.

        Print out the resulting connection by calling the .print() method on the first vertex and pass in false to omit the weight. We should see that the first vertex points to the second vertex. You can also call the .print() method on the second vertex to verify that it has no connections to the first vertex.

    3.
    We’re ready to connect vertices with edges through our Graph class. In the Graph class, create a public .addEdge() method that does not return anything and expects two Vertex parameters, vertex1 and vertex2. We will use them to create edges between each other.

    4.
    Then use the .addEdge() method of both vertices to create an edge to the other vertex. Calling both vertices’ methods creates edges between both vertices. This simplifies the user’s experience since they won’t need to understand how the Vertex class interacts with the Edge class.

    5.
    Let’s verify that we can successfully create an edge between two vertices through the Graph class. In the Graph class’s .main() method, there are two Vertex instances: atlantaStation and newYorkStation.

    Before the trainNetwork is printed, use the trainNetwork’s .addEdge() method to create an edge between the two vertices. We should see Atlanta connect to New York, and New York connect to Atlanta.