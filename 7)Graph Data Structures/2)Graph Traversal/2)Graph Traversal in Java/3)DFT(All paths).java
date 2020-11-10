Depth-First Traversal (All paths)
    We got the hang of traversing down one path, but we want to traverse down all the paths (not just the first possible path). Let’s modify our existing implementation to iterate down all the other paths by using a for-each loop to iterate through all of the start vertex’s edges.

    We won’t have to worry about iterating through all the neighbors before going down the neighbor’s first connected vertex. This is because the recursive call occurs before the next iteration of the for-each loop.

Instructions
    1.
    To traverse down all paths, we no longer need the first if statement to check if there are edges to traverse. Instead, we will use a for-each loop to go through all of the vertex’s edges. If there are no edges, then the edges array is empty and nothing happens. We also need to update the neighbor to be the connected vertex at each edge on each iteration of the loop.

    Replace the outer if statement with a for-each loop that iterates through the start vertex’s list of edges.

    Replace the value of the neighbor vertex, so that it is set to the end vertex of the edge loop variable from the for-each loop.

    2.
    We completed the depth-first traversal! It iterates down each path until it hits a dead-end, continues down the next path at the neighboring vertex until it hits a dead end, and so on.

    You should see the traversal iterate in the following order: v0.0.0, v1.0.0, v1.1.0, v1.1.1, v1.1.2, v1.2.0, v1.2.1, v2.0.0, v2.1.0, and v2.1.1 