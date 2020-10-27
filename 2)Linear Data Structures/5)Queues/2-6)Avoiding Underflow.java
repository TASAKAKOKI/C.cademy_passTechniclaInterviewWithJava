Avoiding Underflow
    Our queue implementation is solid, but there are "two conditions that we should be aware of and avoid when enqueuing and dequeuing": underflow and overflow.

    "Underflow" occurs when we try to remove elements from an empty queue. It’s not possible to take a coffee order if there is no one standing in line! Underflow can affect both bounded and unbounded queues.

    We need to make some adjustments in .dequeue() to account for this condition. Let’s do it!

Instructions
    1.
    Within the .dequeue() method, let’s add code that checks if the queue is empty before proceeding. We can use a helper method we previously created to do this.

    If the queue is not empty, we should remove the head node, decrease .size, print a message with our adjustments and return data.

    If the queue is empty, return an empty String for now.

    2.
    If the queue is empty, instead of returning an empty string, we should let the user know that a node cannot be removed at this point. Do so with an error message.

    In an else branch, remove the return statement. Instead, throw an error with the specific message “Queue is empty!”.

    3.
    In the same way that we can’t dequeue from an empty queue, we can’t peek at an empty queue. Let’s adjust our .peek() code similarly. Within .peek(), if the queue is not empty, return the head node like we already do in the method. Otherwise, return null.

    4.
    Uncomment the code at the bottom of the editor and run it. Then, dequeue as many nodes as you can from boundedQueue, reading any messages that appear in the terminal, including errors. How many nodes can you remove from the queue before there’s an error?