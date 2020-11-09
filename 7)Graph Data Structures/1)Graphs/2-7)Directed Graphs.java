Directed Graphs
    So far, we only support undirected graphs. Now let’s expand the functionality so we can create "directed graphs", where "there does not necessarily have to be edges going in both directions between the vertices". These "directions indicate which vertices are connected to each other", and "detail how the graph can be traversed from one vertex to another".

    The "main difference" between our undirected graph and directed graph is that our undirected graph uses two edges going in opposite directions to indicate that there is a connection between two vertices. On the other hand, "directed graphs use one edge to show the connection between the vertices".

Instructions
    1.
    When a Graph is first created, it uses the private instance variable, isDirected, as a way to identify if it is directed or not.

    In the constructor, add another boolean parameter, inputIsDirected. This argument indicates whether or not the graph is directed.

    Update the trainNetwork in the main() method to be a directed graph by adding the true argument when it is instantiated.

    2.
    Next, set the Graph’s isDirected instance variable to the inputIsDirected argument.

    3.
    We only want to create one edge that points in one direction between two vertices for directed graphs.

    Modify the Graph‘s .addEdge() method to create the edge from vertex2 to vertex1 only if the isDirected instance variable is false.

    We should see only one edge connection going from Atlanta to New York. New York should have no edges going out.

    4.
    Similar to how we only want to create one edge between vertices in a directed graph, we also want to remove the edge from the first to second vertex. This allows us to preserve the edge going in the other direction, if there is one.

    Modify the Graph‘s .removeEdge() method to only remove the edge from vertex2 to vertex1 if the isDirected instance variable is false.

    5.
    Finally, let’s test our edge removal. Call .removeEdge() on the trainNetwork graph in the .main() method to remove the edge between atlantaStation and newYorkStation.

    When we print out the resulting graph, Atlanta and New York should have no connections.