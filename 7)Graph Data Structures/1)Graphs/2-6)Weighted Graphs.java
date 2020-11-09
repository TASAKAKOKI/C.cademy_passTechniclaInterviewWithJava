Weighted Graphs
    The current implementation of our Graph class'' is unweighted, meaning there is no cost associated with the edge that connects the vertices together. Since we want our Graph to be flexible, we should give the "option for weights to be added to the edge when a new edge is created."

Instructions
    1.
    In the constructor of the Graph class, add an inputIsWeighted boolean parameter for the user to designate that the graph is weighted.

    Update the trainNetwork in the main() method to be a weighted graph by passing true when it is instantiated.

    2.
    Still in the constructor, set the isWeighted instance variable to the inputIsWeighted parameter in the constructor.

    3.
    When the graph is weighted, the edges should also have a weight. We will do this by opening a weight parameter in the .addEdge() methods and attach it to the edges as they are created. When an edge is created, the Graph class should expect the weight to be provided and pass it to the Vertex class. Let’s make the following changes:
        In the .addEdge() method of the Graph class in Graph.java, add an Integer parameter, weight. Using an Integer instead of the primitive int allows us to set the weight to null for unweighted graphs.

        Pass the weight to both method calls that create edges between the given vertices.

        In the .addEdge() method of the Vertex class in Vertex.java, add an Integer parameter called weight.

    4.
    In .addEdge() of the Vertex class, we currently create a new Edge instance with the weight set to the third argument, null. Replace null with the weight parameter to create the Edge instance with the given weight.

    5.
    In the .addEdge() method of the Graph class, we want a safety precaution to handle the weight argument when the graph is not weighted. Before the edges are created, set the weight argument to null if the graph is not weighted.

    This way, we can prevent the user from accidentally setting the weight on unweighted graphs.