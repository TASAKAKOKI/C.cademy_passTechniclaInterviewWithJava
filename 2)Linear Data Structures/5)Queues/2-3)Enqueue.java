Enqueue
    Since our queue is currently empty, let’s add to it! To enqueue literally means “add to the queue”. In creating the .enqueue() method, that’s exactly what we’ll do.

    When adding a new node to the queue, the new node is always added to the end of the queue.
        - If the queue is empty, the new node becomes the head and tail of the queue. (Imagine only one person is in line).
        - If the queue has at least one other node, the new node becomes the new tail. (Someone joins a line of people).
    We can put this into action by creating the .enqueue() method of the Queue class. It’s important to remember that our this.queue is an instance of the LinkedList class which is built using the Node class.

Instructions
    1.
    Within the Queue class, define a method called .enqueue() that takes a String, data, as its argument. data is the value used to create the Node instance that will be added to the queue. .enqueue() does not return anything.

    2.
    Now write the code to add a new element to the queue. Because the queue is built from a linked list, use the method that adds a new node to this type of object. Reference the LinkedList.java file if necessary.

    3.
    The .size instance variable tracks the number of nodes in a queue, as we’ve learned. Therefore, it should increase when a node is added. Add one line of code to .enqueue() that will increment this variable accordingly.

    4.
    It might be nice to keep track of what nodes are added to the queue and their respective updated sizes of the queue. Print a message with this information after the queue is updated in .enqueue().

    If we ran the following:
        Queue animals = new Queue();
        animals.enqueue(“fish”);
    The program should print exactly the following, including capitalization and punctuation.
        Added fish! Queue size is now 1
    5.
    Check your work by uncommenting the code at the bottom and running your program. Do the messages printed make sense?