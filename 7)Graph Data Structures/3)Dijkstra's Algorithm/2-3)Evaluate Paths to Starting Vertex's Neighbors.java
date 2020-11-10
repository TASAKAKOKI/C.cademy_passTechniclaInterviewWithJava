Evaluate Paths to Starting Vertex''s Neighbors
    We have all of our records set up, so "we can start traversing through the graph and evaluating the distances from the starting vertex to its neighbors".

    In the evaluation of each neighbor, "we compare the distance of the new path to the starting distance of the previous path". We can "think of the new path as the best possible distance to the starting vertex as found in the distances Dictionary". In this case, 0, for the starting vertex plus the distance between the starting vertex and the vertex we are looking at.

    "We can think of the distance of the previous path as the value stored in the distances Dictionary for the vertex we’re looking at". In this case, infinity. "If the distance of the new path is shorter, we will update our records of distances" and previous vertices with the new path.

    Every time we evaluate an edge between a vertex and its neighbor, the "if condition ensures that the record will always maintain the shortest path among the evaluations so far". This is why we can use the previously recorded distance for comparison in our evaluation.

Instructions
    1.
    Let’s start evaluating the distances to the starting vertex’s neighbors by iterating through its list of edges.

    Right before we return our dictionaries, create a Vertex current, and set it to startingVertex. Then use a for-each loop to go through the current’s list of edges. We will use the Edge e argument for this variable.

    2.
    On each iteration through the edges, we are evaluating an alternate path to a different neighbor. The distance of the new path is the sum of the distance from the vertex to the neighbor and the distance from the starting vertex to the vertex.

    Inside the for-each loop, create an Integer variable, alternate, and set it to the sum of the edges, e, weight and the value of the current vertex’s distance in the distances dictionary.
        The distances dictionary is a mapping of each vertex in the graph to the shortest distance from the starting vertex to the vertex (that has been evaluated so far). We are using the vertex’s data as keys by calling the .getData() method on current to its respective shortest distance.

        To get the edges weight, check out the methods available to you in the Edge.java file.
            Integer alternate = e.getWeight() + distances.get(current.getData());

    3.
    Now we can compare the distance of the new alternate path to the distance of the last recorded path to the neighbor. The distance of the neighbor’s last recorded path is in the distances dictionary. However, in order to use that dictionary to find the distance, we need to know the data associated with the vertex we’re looking at. For example, if the vertex we’re looking at has data of “B”, we’ll want to do something like distances.get(“B”).

    Let’s use a variable to hold the key that we will use to access the neighbor’s distance in distances. This will help with code readability.
        Still in the for-each loop, create a String variable, neighborValue, and set it to the data property of the node we’re interested in. This can be done by using our edge, e, finding the vertex at the end of that edge using .getEnd(), and finally using the .getData() to get the data associated with that vertex.  
            String neighborValue = e.getEnd().getData();
    4.
    Still in the for-each loop, set up an if condition that checks if the alternate distance is shorter than the value at neighborValue in distances. We can do this by calling the .get() method on distances and pass in neighborValue.

    5.
    If the condition is satisfied, then we have found a shorter path and should update the neighbor’s recorded distance and previous vertex.

    If the alternate path is shorter, set distances at the neighborValue to the new alternate value. We also want to set the previous vertex at the neighborValue to current.

    6.
    When we evaluate the distances, we are determining if the path from the starting vertex to the neighbor is shorter than the previously evaluated distance. Since we have not evaluated any paths to the neighbors yet, the previously recorded distances to all of the neighbors is Integer.MAX_VALUE.

    Run the code and look at the output of the function. The shortest paths evaluated so far should be the paths from the starting vertex to its neighbors. In distances we should see the starting vertex with a distance of 0, its neighbors set to the evaluated distances, and all other vertices with Integer.MAX_VALUE distances. In previous, we should see the neighbors with the starting vertex as their previous vertex, and all other vertices with null.

    Our upcoming exercise will expand our search past the starting vertex to every connected vertex in the graph.