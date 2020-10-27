Avoiding Overflow
    Overflow occurs when we add an element to a queue that does not have room for more nodes because it is bounded. A fixed, bounded queue does not allow for a number of nodes that is greater than its maximum size. For unbounded queues, though they don’t have a size restriction, at some point the size of the queue will exceed the memory available to store this queue.

    Here, we’ll add code to check for overflow in our Queue class whenever we try to add a new node to the queue.

Instructions
    1.
    Within the .enqueue() method, let’s add code that checks if the queue has space before proceeding. We can use a helper method we previously created to do this. If the queue has space, we should add the new node, increase .size, and print a message with our adjustments.

    2.
    If there is no more space in the queue, we should let the user know with an error message. Add an else branch that throws an error with the specific message "Queue is full!".

    3.
    Watch your code in action. Uncomment the code found at the bottom of the editor. This created a queue of coffee drinks. Now, enqueue as many additional drink orders as you can, being mindful of overflow. Then, dequeue as many orders as you can, being mindful of underflow.    