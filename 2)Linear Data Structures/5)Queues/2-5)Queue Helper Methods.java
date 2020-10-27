Queue Helper Methods
    Well done! We’ve covered the real movers and shakers in the queue world: enqueue and dequeue. Now we will create two helper methods that will allow us to make our queue implementation more robust by further incorporating queue size into our methods.
        .hasSpace(): returns true if the queue has space for another node
        .isEmpty(): return true is size of the queue is 0

Instructions
    1.
    Within the Queue class and right below the constructors, define a helper method called .hasSpace() which for now returns true.

    2.
    The .hasSpace() method will check if the current size of the queue is less than the maximum size. Within it:
        Return true if the size of the queue is less than the maximum size limit.
        Return false if the size is equal to or greater than the maximum size.
    
    3.
    Define another helper method within Queue called .isEmpty() which for now returns false.

    4.
    The .isEmpty() function will verify whether or not the queue is empty by checking its size. Within it:
        Return true if the queue is empty (has no nodes).
        Return false if the queue has one or more nodes.

    5.
    Uncomment the code at the bottom and run it to see two queues created. The first has a maximum size of 25, the second has a maximum size of 0. Check out if there is space left in either queue for more nodes and whether or not they are empty.