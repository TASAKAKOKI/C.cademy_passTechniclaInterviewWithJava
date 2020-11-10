Breadth-First Traversal (All layers)
    So far, we can iterate down one layer, but we have yet to iterate down the remaining layers. In order to do so, we will introduce a queue that will keep track of all of the vertices to visit.

    "As we iterate through the neighbors", we will "add their connected vertices to the end of the queue", remove the next neighbor from the queue, add its connected vertices, and so on. This way allows us to "maintain the visiting order"; we will visit the vertices across the same layer while queueing up the next layer. When there are no vertices left in the current layer, the vertices of the next layer are already queued up, so we move down and iterate across the next layer.

    We will use our implementation of the Queue data structure that was covered in a previous course. It is located in Queue.java. Go ahead and take a quick look to refresh your memory of the data structure and the available methods. We modified it slightly to accept Vertex objects instead of the String type.

Instructions
    1.
    We will create our queue with the start vertex as the first connected vertex to iterate through.

    Right before we iterate through the edges, instantiate a new Queue instance and assign it to the visitQueue.

    Then .enqueue() the start vertex to the queue.

    2.
    When we look at a vertex from visitQueue, we want to dequeue it and ensure that we don’t look at it again. The list of visitedVertices maintains this record so we can prevent any duplicates from enqueuing into the visitQueue again.

    Right before the for-each loop (and after the start vertex is enqueued), create a current Vertex variable and assign it to the vertex that we .dequeue() from the visitQueue.

    Print out the data attribute of the current vertex so we can see which vertex we’re looking at.

    3.
    The visitQueue holds all of the vertices that we have yet to iterate through. This means we want to continue iterating through these vertices as long as there are vertices left in the queue.

    After we enqueue the start vertex, add a while loop that continues to run as long as the visitQueue is not empty. Make sure that it includes dequeuing the next vertex and the for-each loop, since we also want to update visitedVertices if there are still vertices in the queue.

    4.
    Next, we want to iterate through the current vertex’s neighbors and enqueue them, not just the start vertex’s neighbors.

    Update the for-each loop to iterate through the current vertex’s edges instead.

    Then, inside the for-each loop, if the visitedVertices does not include the neighbor, we should also enqueue the neighbor to the visitQueue.

    5.
    That’s it! When we run the graph traversal with the testGraph, we should see the vertices printed out in the following order: v0.0.0, v1.0.0, v2.0.0, v1.1.0, v1.2.0, v2.1.0, v1.1.1, v1.1.2, v1.2.1, and v2.1.1.

    If you’re feeling up for a challenge, take a moment to consider the following:
        How would you modify this to take a recursive approach?
        How would you add in a callback to expand the utility of the method?