Adding Vertices
    Now that we have set up our data structures, we can provide an easier way to manage the graph’s list of vertices. This gives us an opportunity to abstract out the places that use the Vertex class.

    Currently, if we wanted to populate the graph with vertices, we have to manually create a new Vertex instance and add it to the Graph’s list of vertices to populate the graph. If we create an .addVertex() method in the Graph class, it simplifies the process of adding a vertex to the graph. This alleviates the burden of knowing how the Vertex class interacts with the Graph class for whoever is using our Graph. They only need to interact with the Graph class.

Instructions
    1.
    Inside the Graph class, create a public .addVertex() method that returns a Vertex. It should expect a single String parameter, data, which contains the data of the new vertex.

    We will want to return a new vertex, but return null for now.

    2.
    Using the data argument, create a Vertex instance and add it to the Graph’s list of vertices.

    Then return the newly created Vertex, instead of null, to signal to the method caller that a vertex was successfully created and added to the list.

    3.
    Great! Now we can set up our train network graph and see what it looks like with our train station vertices.

    In the main() method of the Graph class, create a trainNetwork Graph variable and assign it to a new instance of a Graph. Then use the .addVertex() method to add two train stations with the names, "Atlanta" and "New York".

    Create two variables, atlantaStation and newYorkStation, and assign them to the output of the vertices that were just added. We will use these variables later on.

    Call the .print() method on the trainNetwork. We should see our graph with two vertices inside it. They should be labeled Atlanta and New York, respectively.