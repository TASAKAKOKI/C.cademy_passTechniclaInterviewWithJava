Removing Vertex Connections
    Now that we can connect vertices together, we want to make the Graph more flexible by giving it the "ability to remove connections". We will use its ".removeEdge() method" to remove any Edge between vertices.

    When removing elements from an ArrayList, one way is to use the ArrayList’s ".removeIf() method" to 'filter the element we want to remove'. This method accepts a predicate, which is used to 'evaluate each element in the ArrayList' and 'determine if the element should be removed or not'.

    A predicate is a generic interface'' that accepts a value and determines if it is true or false. "We can also pass a lambda expression as a predicate". In order to do so, it will need to "accept an argument on the left side of the arrow", followed by an arrow, and then "use condition that evaluates to a boolean on the right".
        arg -> condition
    
    In the context of the .removeIf() method, this argument will be each element in the list. We can use this argument to create the condition. If the condition evaluates to true, the element will be removed from the ArrayList.
        list.removeIf(element -> element === "removeMe");

    This example removes the element from the list if it is equal to the string "removeMe".

Instructions
    1.
    We will start by setting up .removeEdge() in our Vertex class to remove the connection between a vertex the given ending vertex from the vertex’s list of edges. In our Vertex class, create a public .removeEdge() method that does not return anything and expects an endVertex parameter.

    2.
    In order to remove the edge from the list of edges, we can use its .removeIf() method.

    Call .removeIf() on the list of edges.

    We can then pass in a predicate to run on each edge. It will check if the vertex at the end of the edge is equal to the endVertex. Pass in a predicate where we expect an edge.

    In the condition, use the .getEnd() of the edge to fetch the vertex at the end. Then chain the .equals() method to check if the vertex at the end of the edge is equal to the endVertex parameter.
        Following the general syntax of the lambda expression for the predicate, we will want the edge variable to go on the left of the arrow. Then in the condition, we can use this edge variable to get its end vertex with the .getEnd() method. We will also want to chain a call to .equals() and pass in the endVertex to check if the two are equal.
            edge -> edge.getEnd().equals(endVertex)
        
        An alternative to the .removeIf() method is to create a new ArrayList of Edges, and use a for loop to iterate through the current list of edges.
        
        For each edge, we would get the vertex at the end of the edge and check if it is not equal to the endVertex. If it is not equal, then add the edge into the new list of edges. After we have iterated through all of the vertices, then we should set edges to the new list of edges.

    3.
    We’re ready to remove an edge between vertices through the Graph class. In the Graph class, create the public .removeEdge() method that does not return anything. It should expect the vertices as two Vertex parameters: vertex1 and vertex2.

    This method will remove the edge between two given vertices.

    4.
    Then use the vertices’ .removeEdge() method to remove the edge to the other vertex. Remember to do this for both vertices.

    5.
    Let’s verify that we can successfully remove an edge between two vertices through the Graph class. After the edge between Atlanta and New York is added in the .main() method, remove the edges between the two cities. Call the trainNetwork’s .removeEdge() method with atlantaStation and newYorkStation.

    We should see the atlantaStation and newYorkStation vertices with no connecting edges.