Removing the Head
    So far we can:
        create a new LinkedList using its constructor
        add to the head of the list using .addToHead()
        add to the tail of the list using .addToTail()
    Now we’re going to learn how to remove from the head of the list. To do this, we are first going to check to see if the list has a head. If it doesn’t, there is nothing to return. If there is a head, we will remove it by setting the list’s head equal to the original head’s next node, and then return that original head.

Instructions
    1.
    Define a .removeHead() method that takes no arguments. This method should be accessible outside of the class, and return a String, which will be the data of the removed head.
    We need to have a return statement for the code to compile, so return null for now. We will change this later.

    2.
    Above your return statement, create a Node named removedHead and set it equal to the list’s head.

    3.
    Delete your existing return null statement.
    If removedHead has no value, return null. Outside the if, return removedHead‘s data.

    4.
    Finally, we need to update the head of the list so that it is not longer the removed head.
    Before your final return statement, set the list’s head equal to removedHead‘s next node.