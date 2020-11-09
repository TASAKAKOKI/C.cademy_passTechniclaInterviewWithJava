Graph Search Conceptual Introduction
    Using graphs to model complex networks is pretty swell, but one way that graphs can really come in handy is with graph search algorithms. You can use a graph search algorithm to traverse the entirety of a graph data structure in search of a specific vertex value.

    There are two common approaches to using a graph search to progress through a graph:
        "depth-first search", known as DFS follows each possible path to its end
        "breadth-first search", known as BFS broadens its search from the point of origin to an ever-expanding circle of neighboring vertices

    To enable searching, we "add vertices to a list, visited". This list is pretty important because it "keeps the search from visiting the same vertex multiple times"! This is particularly "vital for cyclical" graphs where you might otherwise end up in an infinite loop.

    So how do you calculate the runtime for graph search algorithms?

    In an upper bound scenario, we would be looking at every vertex and every edge. Because of this, the big O runtime for both depth-first search and breadth-first search is "O(vertices + edges)".