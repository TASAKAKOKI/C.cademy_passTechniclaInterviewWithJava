Representing Graphs
    We "typically represent the vertex-edge relationship of a graph" in two ways: an "adjacency list or an adjacency matrix".

    An "adjacency matrix" is a "table". "Across the top, every vertex in the graph appears as a column". Down the side, every vertex appears again as a row. Edges can be bi-directional, so each vertex is listed twice.

    To find an edge between B and P, we would look for the B row and then trace across to the P column. The contents of this cell represent a possible edge.

    Our diagram uses 1 to mark an edge, 0 for the absence of an edge. In a weighted graph, the cell contains the cost of that edge.

    In an adjacency list, each vertex contains a list of the vertices where an edge exists. To find an edge, one looks through the list for the desired vertex.

Instructions
    What kind of graph would have an adjacency matrix with every cell filled?

    Looking for an edge in the adjacency list, how many vertices do we need to search through for P?

    How many for B?