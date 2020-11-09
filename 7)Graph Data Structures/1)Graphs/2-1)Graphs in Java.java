Introduction to Graphs
    In this lesson, we’ll take an "object-oriented approach" to building an implementation of the graph data structure in Java. With "three classes", "Edge", "Vertex", and "Graph", we can implement a variety of graphs that satisfy the requirements of many algorithms. Remember that a Graph consists of vertices and their corresponding edges.

    We want our Graph class'' to be flexible enough to support "directed", "undirected", "weighted", and "unweighted" graphs. We will provide you with an "Edge class" that 'connects two vertices' and 'stores the weight of the connection' (to support weighted graphs).

    With this in mind, we will create our Graph with the following requirements:
        : A Vertex can store any data.
        : A Vertex maintains a list of connections to other vertices, represented by a list of Edge instances.
        : A Vertex can add and remove edges going to another Vertex.

        : A Graph stores all of its vertices, represented by a list of Vertex instances.
        : A Graph knows if it is directed or undirected.
        : A Graph knows if it is weighted or unweighted.
        : A Graph can add and remove its own vertices.
        : A Graph can add and remove edges between stored vertices.

    Let’s go ahead and familiarize yourself ourselves with the classes that we will build in Vertex.java and Graph.java. We already set up .print() methods for you that will print out the state of the graph structure. Don’t worry about the class in Edge.java yet. We will use it to connect the vertices in a later exercise.

    To keep the concepts grounded in a real-world application, we’ll build a transportation network of railroads and train stations as we go.

Instructions
    1.
    Let’s start by setting up the constructor for our Vertex class.

    When a vertex is first instantiated, it should allow the user to pass in data, which will represent the vertex’s data. In the constructor, set up a String inputData parameter.

    2.
    Next, let’s use the inputData parameter to set the data instance variable so it will be stored as part of the Vertex. Inside the constructor, set the data instance variable to the parameter.

    3.
    We can use the edges instance variable to set up the vertex’s list of edges in the constructor. This way the edges will be immediately available when a Vertex is created.

    In the constructor, set the edges instance variable to a new instance of an ArrayList of the Edge type.

    4.
    Let’s move on to the constructor in the Graph class, located in Graph.java. A graph is essentially a collection of vertices and edges; it only needs to keep track of a list of vertices. We already set up the Graph class with instance variables to hold its list of vertices and graph properties. We’ll take a closer look at the properties later.

    Since a graph doesn’t have any vertices when it is first created, set the vertices to a new instance of an ArrayList of type Vertex.