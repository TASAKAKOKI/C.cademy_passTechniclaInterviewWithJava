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

    3.
    We’re ready to connect vertices with edges through our Graph class. In the Graph class, create a public .addEdge() method that does not return anything and expects two Vertex parameters, vertex1 and vertex2. We will use them to create edges between each other.

    4.
    Then use the .addEdge() method of both vertices to create an edge to the other vertex. Calling both vertices’ methods creates edges between both vertices. This simplifies the user’s experience since they won’t need to understand how the Vertex class interacts with the Edge class.

    5.
    Let’s verify that we can successfully create an edge between two vertices through the Graph class. In the Graph class’s .main() method, there are two Vertex instances: atlantaStation and newYorkStation.

    Before the trainNetwork is printed, use the trainNetwork’s .addEdge() method to create an edge between the two vertices. We should see Atlanta connect to New York, and New York connect to Atlanta.