Breadth First Traversal
    "Breadth-first-search (BFS)" is a technique in a tree that 'visits all children of a node first before visiting any further levels.'

    Based on this tree displayed using .print():
        15
        -- 3
        -- -- 6
        -- -- 9
        -- 12
        -- -- 19
        -- -- 8
        -- 0
        -- -- 10
        -- -- 19
    we can traverse the tree breadth-first to produce this result:
        15 3 12 0 6 9 19 8 10 19
    
    Notice that the root comes first, then all nodes in the first level next, then all nodes in the second level.

    Let’s implement our breadth-first traversal for the Tree class. A "queue"–where elements are first in, first out–is particularly "useful for implementing this BFS technique", since all sibling nodes are added in at the same time, before any of those node’s children are.

    The algorithm is as follows:
        - Create a queue
        - Initialize by adding the root node
        - While the queue is not empty
            - Set the first tree node from the queue as current
            - Print current tree node''s data
            - Add all current tree node''s children to the queue

  Instructions
    1.
    Create a new public void method, .breadthFirstTraversal(), below .depthFirstTraversal() which takes no parameters.

    2.
    In breadthFirstTraversal(), create a TreeNode variable called current and set it to this tree’s root.

    3.
    Inside .breadthFirstTraversal(), declare a Queue of TreeNodes called queue as a new LinkedList. Add current to the queue.

    4.
    Create a while loop that runs if queue is NOT empty. To write the while condition, you can use the isEmpty() method from queue. Don’t forget to negate the condition with a !.

    Caution: If your while condition mistakenly makes the loop run infinitely, refresh this page!

    5.
    Inside the while loop,
        - Set current to queue.poll(), which is the first element extracted from queue.
        - On the next line, use System.out.print() to print out current‘s data with a space.
        - In the last line of the while loop, add all of current‘s children to the queue. You can use the queue’s .addAll() method to do so.

    6.
    Congrats! You just implemented the Breadth First Traversal algorithm on a tree.

    Try it out by calling the .breadthFirstTraversal() method on tree.

    Compare the outputs from .print() and .breadthFirstTraversal(). What do you notice?