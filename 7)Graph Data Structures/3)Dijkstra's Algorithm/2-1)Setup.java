Setup
    "Dijkstra’s Algorithm" is "used for evaluating the shortest paths between vertices in a graph". The general "strategy" is to "iterate through the vertices" in such a way that will always allow us to only "consider the shortest path to each vertex" and "maintain the possible shortest path to each vertex" as we go.

    We will first implement the algorithm to find the shortest distance to every vertex. Our implementation will take the following steps:
        1. "Evaluate the distances" between the starting vertex and its neighbors
        2. "If the new distance to the neighbor is lower than the previous distance", record it, and queue up the neighbor
        3. "Dequeue the next vertex" to evaluate
        4. "Repeat steps 2 - 3 until there are no more vertices left in the queue".

    In this exercise, we will set up the Dictionaries that will keep track of the shortest distances between the starting vertex and each other vertex, and the shortest paths.

    A "Java Dictionary" is an "abstract class" that stores key-value pairs. Given a key, its corresponding value can be stored and retrieved as needed.

    To create a Dictionary that looks for specified data types of a String for a key and an Integer for a value we would write the following:
        Dictionary<String, Integer> myDictionary = new Hashtable<>();

    We will be using a "priority queue", which is a specialized heap data structure, to "maintain the vertices we need to evaluate next". We’ll explain in a later exercise exactly what it is and the reason for using it instead of a regular queue.

    When we create our dictionary we want the shortest path to each node to be marked as infinity - as we begin to traverse the graph we’ll write over those values of infinity with the actual shortest path to each node. In Java, the best "way to represent infinity" is by "using the constant MAX_VALUE available with the Integer class" and will store the maximum integer value in Java, 2147483647.

    We have also set up a test graph in our main() method to test the output of the method as you complete the exercises.

Instructions
    1.
    To begin, we need to provision our dijkstra() method with two parameters: a Graph g, and a Vertex startingVertex. g is the actual graph that we will be traversing. startingVertex indicates the starting point from which we will construct the paths.

    In the dijkstra() method, specify the Graph g, as the first parameter and a Vertex startingVertex, as the second parameter.

    For now, we will return null.

    2.
    In the dijkstra() method, above the return statement, create a Dictionary distances that requires a key type String and a value type Integer and set it to a new empty Hashtable. distances will be used to map each vertex, a String, to the distance of its path to the starting vertex, an Integer.

    3.
    Before our return statement, iterate through the graph’s, g, vertices using a for-each loop and store in a variable v of type Vertex.

    For each vertex we want to add a key/value pair to distances. The key should be v’s data property, and the value should be Integer.MAX_VALUE. We’re setting up our dictionary so the distance to every node starts at infinity.