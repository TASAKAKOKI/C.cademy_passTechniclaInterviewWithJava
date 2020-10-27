Welcome to Queues in Java
    As you may remember, a queue is a data structure that contains an ordered set of data that follows a FIFO (first in, first out) protocol for accessing its data. Here’s a helpful way to remember how queues function: In Europe people often say “Are you in the queue?” to ask if someone is in line. You can imagine a queue as a line of people waiting to order coffee:
        - The person who gets to order first is at the front of the line, or the head of the queue.
        - Any new customer must go to the back of the line, the tail of the queue, and wait for everyone in front of them to order.
        - The barista only takes the order of a customer at the front of the line.
    
    This model can actually be built by creating a Java class, Queue. How cool! This is a super helpful data structure to know how to create because "queues are used" in many computer science applications such as "breadth-first search algorithms".

    The queue structure can be modeled with three primary Java functions:
        .enqueue(): add a new element to the tail
        .dequeue(): remove the element at the head and return its value
        .peek(): view the value of the head without removing it
    Additional helper methods will let us keep track of queue size so the queue doesn’t “overflow” or “underflow”. We will learn these terms in the coming exercises!

    To create the queue, we will use our handy Node and LinkedList data structures. These implementations can be found at the top of the text editor–take a peek (queue-style!) at their methods which will help us with our Queue class implementation.

Instructions
    1.
    To the right in Queue.java, we’ve given you the Queue class which includes variables and its constructor.

    The instance variables are queue properties. In the constructor, instantiate .queue as an empty LinkedList object. Also, instantiate .size such that it tracks the number of nodes in the queue.

    2.
    Make sure you understand your work. Uncomment the lines at the bottom of the file, run your program, and read the message logged in the terminal. You’ve created an empty queue!