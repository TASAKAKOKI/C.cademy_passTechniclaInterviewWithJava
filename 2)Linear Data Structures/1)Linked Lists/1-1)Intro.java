Linked List Introduction
    Linked lists are one of the basic data structures used in computer science. They have many direct applications and serve as the foundation for more complex data structures.

    The list is comprised of a series of nodes as shown in the diagram. The "head node" is the node at the beginning of the list. Each node contains data and a link (or pointer) to the next node in the list. The list is terminated when a node’s link is null. This is called the "tail node".

    Consider a one-way air travel itinerary. The trip could involve traveling through several airports (nodes) connected by air travel segments (links). In this example, the initial departure city is the head node and the final arrival city is the tail node.

    Since the nodes use links to denote the next node in the sequence, the nodes are not required to be sequentially located in memory. These links also allow for quick insertion and removal of nodes as you will see in future exercises.

    Common operations on a linked list may include:
        adding nodes
        removing nodes
        finding a node
        traversing (or travelling through) the linked list
    
    Linked lists typically contain unidirectional links (next node), but some implementations make use of bidirectional links (next and previous nodes).
   
Linked List Example
    As an example, we added values to the linked list diagram from the introduction.

    This linked list contains three nodes (node_a, node_b, and node_c).

    Each node in this particular list contains a string as its data. As the sequence is defined, the order is "cats", "dogs", and "birds".

    The list ends at node_c, since the link within that node is set to null.

    What links would need to be established to add a new head node to this list? What about the tail?   