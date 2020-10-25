Adding to the Tail
    Now that we can add to the head of the linked list, the next step is to be able to add to the tail. This will require a few more steps since we don’t have a tail property for our class.

    To do this, we are going to start with a temporary tail variable that will be set equal to the list’s head. If there is no head, that means that the list is empty, and we will add the node to the head of the list. Otherwise, we will iterate through the list until we find the last node. Once we’ve found the current tail, we will add a pointer from that node to our new tail.

Instructions
    1.
    Define an .addToTail() method for the LinkedList class that takes a data String as an argument. Like the .addToHead() method, .addToTail() should be accessible outside of the class and return nothing.

    2.
    Inside your .addToTail() method:
        Create a new Node named tail and set it equal to the list’s head.
        Add an if statement that checks if tail has no value. If so, set the list’s head equal to a new Node that takes data as an argument.

    3.
    Add an else clause after your if statement. Inside the else:
    Create a while loop that runs while tail has a next Node
    Inside the loop, set tail equal to its next Node

    4.
    Finally, inside the else clause, but outside the while loop, set tail’s next Node equal to a new Node that takes data as an argument.   