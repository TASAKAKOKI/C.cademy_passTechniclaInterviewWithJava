Removing Vertices
    We also want our Graph to manage its own vertex removal, similar to how it handles its own vertex creation.

    We will use the .removeVertex() method to look for the requested vertex and remove it from the list of vertices.

Instructions
    1.
    Inside the Graph class, create .removeVertex() as a public method that accepts a vertex object of type Vertex to be removed as a parameter and does not return anything.

    2.
    Remove the vertex parameter from the list of vertices.

    3.
    In the main() method, let’s remove the Atlanta vertex we added in the previous exercise using the trainNetwork‘s .removeVertex() method. Remember to do it before the call to .print() so we can see what the resulting graph looks like.

    We should see our graph with only the New York vertex remaining, and no edges.