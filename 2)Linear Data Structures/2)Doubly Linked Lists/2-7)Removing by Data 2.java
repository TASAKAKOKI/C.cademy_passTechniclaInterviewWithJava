Removing by Data II
    Now that we’ve found the node that we want to remove from the list (or returned null if it didn’t exist), it’s time to actually remove it. This means resetting the pointers around the node. There are three cases here:
        The node was the head of the list, in which case we can just call .removeHead()
        The node was the tail of the list, in which case we can just call .removeTail()
        The node was somewhere in the middle of the list, in which case we will need to manually change the pointers for its previous and next nodes

Instructions
    1.
    Still in your .removeByData() method and above the final return statement, check if nodeToRemove is the list’s head. If so, call .removeHead().

    2.
    Else if nodeToRemove is the list’s tail, call .removeTail().

    3.
    Else, we know that the node is somewhere in the middle of the list. To remove it, we will need to reset the pointers for the nodes around it. In an else block, create:
        A nextNode node that is equal to nodeToRemove‘s next node
        A previousNode node that is equal to nodeToRemove‘s previous node

    4.
    Now that we have our nodes, the last step is to remove the pointers to and from nodeToRemove and have nextNode and previousNode point to each other.
    Still in the else block:
        Set nextNode‘s previous node to previousNode
        Set previousNode‘s next node to nextNode