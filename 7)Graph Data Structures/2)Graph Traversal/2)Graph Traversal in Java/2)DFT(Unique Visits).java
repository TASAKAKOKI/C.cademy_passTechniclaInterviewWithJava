Depth-First Traversal (Unique Visits)
    So far, we are able to traverse down one entire path of the graph. However, there will be a problem if the graph has a cycle.

    If there was a cycle, like if there was a path from one vertex to itself, we would be stuck in an infinite loop, continuously iterating over the same neighbors. To account for this, we can use an ArrayList to keep track of all the vertices that we have visited.

Instructions
    1.
    To set up the list of visited vertices, we need to pass it in to every call to the .depthFirstTraversal() method. Add a second parameter to the method, and call it visitedVertices. It is an ArrayList that contains the Vertex type.

    We can assume that when the method is first called, the visitedVertices already contains the start vertex. Go ahead and update the recursive call to include the visitedVertices as the second parameter, and the call to .depthFirstTraversal() in the .main() method to include the visitedVertices.

    2.
    Now we should use the visitedVertices to ensure we don’t visit the same vertex more than once. Wrap the recursive call to the .depthFirstTraversal() function with an if statement that checks if the visitedVertices does not contain the neighbor vertex.

    Whenever we make another call to traverse down the paths, we visit a new vertex, so we should update the list of visitedVertices to reflect that. Inside the if statement, add the neighbor vertex to the array of visitedVertices.

    The visitedVertices is now changed, and these changes are passed to our recursive call. This is because it is passed as the second argument.

    3.
    Let’s check our work! Starting with the starting vertex, it should traverse down the leftmost path until there are no children left. The order of vertices should be v0.0.0, v1.0.0, v1.1.0, and finally v1.1.1.