Dijkstras Algorithm: Conceptual Runtime
    How efficient is Dijkstra’s algorithm? Let’s break it into different parts:
        : Searching through the graph
        : Keeping track of distances

    Just like breadth-first search and depth-first search, to "search through an entire graph, in the worst case", we would go through all of the edges and all of the vertices resulting in a runtime of "O(E + V)".

    For Dijkstra’s, we use a "min-heap" to "keep track of all the distances". Searching through and "updating a min-heap with V nodes takes O(log V)" because in each layer of the min-heap, we reduce the number of nodes we are looking at by a factor of 2.

    In the worst case, we would update the min-heap every iteration. Since there are at most E + V iterations of Dijkstra’s and it takes log V to update a min-heap in the worst case, then the runtime of Dijkstra’s is "O((E+V)log V)".