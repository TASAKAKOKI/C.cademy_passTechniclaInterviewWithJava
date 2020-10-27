Dequeue
    We can add items to the tail of our queue, but when we remove them, we remove them from the head. Remember that this protocol is described as first in, first out (FIFO). The method that performs this is called .dequeue(), or “remove from the queue”.

    This method removes the head node and replaces it with the following node. It also returns the head node.

    If the queue has one node, when we remove it, the queue will be empty. (Imagine only one person was in line).
    If the queue has more than one node, we remove the head node and reset the head to the following node. (Once the first person places their order, the next person in line moves up).
    If we want to just take a peek at the head node to see what the next order is, we can use the method .peek(), which we will also implement below.   

Instructions
    1.
    Inside the Queue class, define a method .dequeue() that:

    Gets the value from the correct node using a LinkedList method
    Stores this value in a String variable called data
    Returns the value stored in data

    2.
    Whenever we remove a node from the queue using .dequeue(), we’ll need to update .size. Add one line of code to .dequeue() that will decrement the queue’s size variable accordingly.

    3.
    Let’s keep track of the updated queue size whenever we dequeue a node. Print a message with this information after the queue updates in the .dequeue() method.

    If we ran the following:
        Queue orders = new Queue();
        orders.enqueue(“mocha”);
        orders.dequeue();
    The .dequeue() method should return the exact following String that details what was removed and what the updated queue size is. Make sure to use the exact capitalization and punctuation used below.

    Removed mocha! Queue size is now 0

    4.
    To just see the value of the head node in a queue, we can use the method .peek(). Define a method with this name in the Queue class that returns an empty String for now.

    5.
    Within .peek(), we want to return the data in the head of the queue. We can do this using an attribute of the head node, data, found in Node.java. Replace the empty String with this value.

    6.
    Check your implementation by uncommenting the code at the bottom of the editor and running it. There should be a sequence of food orders taken and fulfilled, leaving the queue empty. Is this the case?    