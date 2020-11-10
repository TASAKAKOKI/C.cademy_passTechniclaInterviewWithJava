Evaluating All Paths
    Currently, we’re evaluating the distances to the neighbors of the starting vertex, but "we want to expand this to every connected vertex in the graph". 'Every time we discover a shorter path to a neighbor, we should queue up the neighbor to explore its connections and evaluate them'.

    This will accomplish two things:
        "Any paths that have not yet been explored will be explored"
        "For vertices that already have a path found, we will re-evaluate if the alternate path through the neighbor will result in a shorter distance".
    
    We are guaranteed that every vertex is evaluated because whenever a path is found to a vertex, then it will be queued up and its neighbors will be evaluated. "The only way for a vertex to escape evaluation is if there are no connections to the vertex".

    For our queue, "we will use a priority queue". A priority queue is a "specialized form of a min-heap", where "the priority of a piece of data is stored alongside data", "elements are popped based on the priority value". In the meantime, take a look through QueueObject.java to familiarize yourself with the data structure. We "mainly need the .add() method to queue up elements with a priority", and the ".poll() method to grab the element with the lowest priority".

    The following is an example of creating a PriorityQueue and calling the .add() method in which we pass in a vertex and a distance:
        PriorityQueue<QueueObject> myQueue = new PriorityQueue<QueueObject>();
        queue.add(new QueueObject(vertex, distance));

    This "priority queue" is better than a regular queue since it "allows us to evaluate the vertices with the shortest distances first". This way we can "avoid unnecessarily re-evaluating paths later in the queue since it is less likely that a longer path will result in a shorter distance".

Instructions
    1.
    First, let’s set up the Priority Queue that we will use to hold the vertices we will evaluate as we traverse through the graph.

    Right after the previous dictionary is instantiated, create a PriorityQueue, queue, and set it to a new instance of a PriorityQueue:
        PriorityQueue<QueueObject> queue = new PriorityQueue<QueueObject>();

    The first vertex we want to evaluate is the starting vertex. After instantiating the queue, make a call to .add() the starting vertex to the queue. Pass in a new QueObject setting the vertex property to startingVertex, and the priority property set to 0. The priority is the vertex’s distance to the starting vertex.

    2.
    Currently, we are iterating through the startingVertex’s edges and calculating the distance of the alternate path using the startingVertex’s distance. Now, we want to shift to evaluate the vertices in the queue.

    Instead of setting the current variable to the starting vertex, we want to set it to the vertex with the smallest priority in the queue, which will initially be the starting vertex. Dequeue the vertex with the smallest priority from the queue by calling the .poll() method and accessing the vertex property.

    Take a look at QueueObject.java to see how to access the vertex property.

    3.
    For now, we only have the startingVertex queued up for evaluation. However, we also want to queue up any neighbors where a shorter distance from the vertex to the neighbor is found. This is because other paths that go through this neighbor could be shorter than what was previously recorded.

    If the alternate path to the neighbor is shorter than the previously recorded distance, use .add() to add a new QueueObject where the vertex property is set to the neighbor, and the priority is the new neighborValue in distances.

    4.
    Great! Our queue is running along, so we just need to set up a loop to go through all of the vertices in the queue. As long as there are vertices left in the queue, we should continue evaluating alternate paths.

    After the distance of startingVertex is set to 0, set up a while loop that continues to evaluate the distances as long as the queue is not empty. You can call .size() on queue to check if it is empty or not by checking if it is not equal to 0 using !=. This should come right before the vertices are popped from the queue and end right after we iterate through the neighbors.
        ...
        
        // open while loop
        Vertex current = queue.poll().vertex;
        ...
        queue.add(new QueueObject(e.getEnd(), distances.get(neighborValue)));
            }  
        }
        // close while loop
        ...
    
    5.
    Awesome job! We’ve gotten through the basis of Dijkstra’s. Run the function on the test graph and print out the result, you should see the following shortest distances:
        A: 0
        G: -38
        F: 22
        E: 12
        D: 4
        C: 7
        B: 3

    These should be the following previous vertices:
        A: Null
        G: E
        F: E
        E: D
        D: A
        C: D
        B: A

    This shows that the shortest distance to get to C, starting at vertex A, is 7 units. In order to travel that shortest path to C, we should go through vertex D.