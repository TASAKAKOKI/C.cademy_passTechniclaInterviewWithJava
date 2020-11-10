Breadth-First Traversal (First layer)
    Now it’s time to focus on breadth-first traversal! As a reminder, the "breadth-first traversal iterates through the graph in layers". It goes down one layer, which comprises the start vertex’s direct neighbors. Then it proceeds down to the next layer which consists of all the vertices that are neighbors of the vertices in the previous layer.

    For this exercise, we’ll focus on traversing down one layer. We will take a similar approach as we did with the depth-first traversal by "keeping an array of visitedVertices to prevent us from iterating through the same vertices".

    However, "we will iterate through all of the direct neighbor vertices" instead of iterating down the neighbor’s first edge. "We will also use a queue to traverse through the graph" instead of recursion to explore the different ways we can implement the traversals.

    We will reuse the same test graph that was used in the depth-first traversal implementation.

Instructions
    1.
    Start by setting up the parameters for our .breadthFirstTraversal() method. We should expect for the graph to be provided in the form of the starting vertex, just like we did in depth-first traversal. We also want a parameter to track any vertices we visit, which will help to ensure we do not visit each vertex more than once.

    Add the start vertex as the first parameter and the visitedVertices list as the second parameter to .breadthFirstTraversal(). The start parameter should be a Vertex, and the visitedVertices parameter should be an ArrayList of the Vertex type.

    2.
    Next, we will go down one layer and traverse all of the start vertex’s neighbors. In the .breadFirstTraversal() method, set up a for-each loop to iterate through all of its edges. You will need the start vertex’s .getEdges() method to get all of its edges.

    3.
    Each edge in the start vertex’s list of edges holds a neighbor vertex in its end attribute.

    Next, create a Vertex variable, neighbor, and set it to the end vertex in each edge. You will need the Edge’s .getEnd() method to retrieve the vertex.

    4.
    Almost there! Before we can mark the neighbor as “visited,” we need to check that the visitedVertices does not already include the neighbor vertex. Otherwise, we could end up “visiting” the vertices multiple times by adding duplicates of the vertex in our visitedVertices list.

    After the neighbor vertex is declared, add an if statement that checks that the neighbor is not included in the visitedVertices. If the neighbor is not, then we can mark it as “visited” by adding it to the list of visitedVertices.

    5.
    We can now successfully iterate through all of the start vertex’s neighbors. To check that we are “visiting” the right vertices, print out the visitedVertices right before the end of the method.

    In the .main() method, go ahead and call the .breadthFirstTraversal() method with the startingVertex and visitedVertices as parameters. When we run the function with our test graph, we should see 3 different Vertex objects in the array.
        Since the ".breadthFirstTraversal() method is static", it "belongs to the class" 'instead of an instance of the class'. In order to call the method, "we will have to use the class itself to reference the method". Consider the following class, Foo, with the static method, .bar():
            public class Foo {
                public static void bar() {}
            }

        In order to make a call to .bar(), we need the following statement:
            Foo.bar();