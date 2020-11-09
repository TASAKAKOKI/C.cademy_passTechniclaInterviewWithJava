Depth-First Traversal (One path)
    "Traversals" are incredibly "useful when you are trying to find a particular value or a particular path in a graph". We’ll first explore the depth-first traversal method for recursively traversing through a directed graph. To recap, depth-first traversals iterate down each vertex, one neighbor at a time, before going back up and looking at the neighbor’s connected vertices. In this exercise, we will focus on traversing down the full length of one path and printing each vertex’s data value.

    We set up a sample graph in TestGraph.java for you to test the traversals against. Feel free to take a look at the file to familiarize yourself with the structure of the graph. It contains a method that returns the starting vertex of the graph, which we will use as the starting point for the traversal.

    For simplicity, we set up a GraphTraverser utility class in GraphTraverser.java so we can implement the traversal iterator as a static method. In other implementations, the iterator can also be seen as a static method on the Graph class. We already created the .main() method with an instance of the TestGraph.

Instructions
    1.
    Let’s start by setting up our traversal method. Since it will be used to traverse a graph, we can expect the graph to be provided in the form of the starting vertex.

    There is an empty .depthFirstTraversal() method provided. Set the first parameter to be a Vertex, start.

    In the .main() method, we set up a test graph with a startingVertex and list of visitedVertices for you. At the end, add the startingVertex to the call to .depthFirstTraversal().

    2.
    To make sure we are looking at the right vertex, print out the start vertex’s data in the .depthFirstTraversal().

    3.
    Since we are focusing on the full length of one path, the next vertex we want to traverse is the starting vertex’s first neighbor. We cannot always assume that all vertices have outgoing edges, so we need to handle this case.

    Right after we print the start vertex’s data attribute, add an if statement with a condition that checks if the start vertex has any edges to traverse.

    Inside the if block, create a variable, neighbor, and set it to the first neighbor, which is accessible through the start vertex’s list of edges. Go ahead and print out the neighbor‘s data attribute to make sure we have the right neighbor.

    4.
    Now that we have the first neighbor, we want to go down this neighbor’s first edge, and then traverse down that vertex’s first edge, and so on. To do that, we can leverage recursion to take care of the downward traversal by passing the neighbor vertex as the new starting vertex in the function call.

    Since we’re making a recursive call through the neighbors, we don’t need to see each visited vertex printed more than once. Remove the statement that prints out the neighbor‘s data.

    In the if block and after we fetch the neighbor vertex, call the .depthFirstTraversal() method. Make sure to pass in the neighbor vertex to the recursive call so that we can go down the path and iterate through the neighbor’s first connected vertex.