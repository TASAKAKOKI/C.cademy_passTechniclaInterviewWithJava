Intro to Dijkstra''s Algorithm: Conceptual
    Now that we know how to properly search a graph, how can we use these skills in real life?

    One of the most common applications of graph searches is to "find the shortest distance between vertices". Finding this distance has a variety of applications such as finding the optimal route to a destination or transferring data in a computer network.

    Take a look at the graph below. Finding the shortest path between vertex A and vertex E may seem easy in your brain, but telling a computer how to find it is a bit more complicated.
        https://www.codecademy.com/paths/pass-the-technical-interview-with-java/tracks/graph-data-structures-java/modules/dijkstras-algorithm-java/lessons/dijkstra-conceptual/exercises/dijkstras-conceptual-intro

    Fortunately, there is an "algorithm that computes the shortest distance from a given vertex to the rest of the vertices in a graph". This is called "Dijkstra’s Algorithm".

    Dijkstra’s Algorithm works like the following:
        1. "Instantiate a dictionary" that will eventually map vertices to their distance from the start vertex
        2. "Assign the start vertex a distance of 0" in a min heap
        3. "Assign every other vertex a distance of infinity" in a min heap
        4. "Remove the vertex with the smallest distance from the min heap" and "set that to the current vertex"
        5. For the current vertex, "consider all of its adjacent vertices and calculate the distance to them" as (distance to the current vertex) + (edge weight of current vertex to adjacent vertex).
        6. "If this new distance is less than the current distance, replace the current distance".
        7. "Repeat 4 and 5 until the heap is empty"
        8. After the heap is empty, "return the distances"

    That may seem confusing! Be sure to check out the video in order to better visualize this algorithm.