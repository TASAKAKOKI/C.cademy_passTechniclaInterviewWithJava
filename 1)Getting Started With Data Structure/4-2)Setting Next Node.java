Setting the Next Node
    Currently, when a Node is created, its next Node is set to null. However, we want to allow the next property to be updated so a sequence of nodes can be traversed and used in more complex data structures. For this, we will create a setter method to modify the this.next property.

    The method will be called .setNextNode() and take a Node as an argument, updating the next property appropriately.

Instructions
    1.
    Create the .setNextNode() method in the Node class. It should take a Node named node as an argument. This method will return nothing, so it should be a public void.

    2.
    Inside the method, set the Node’s next property to the node parameter.

    3.
    To verify that our .setNextNode() performs as intended, let’s call the method on our Node instance.
    Inside the main method, create a second Node instance named secondNode with the argument "I am the second Node!". Set firstNode‘s next node to secondNode using the appropriate method.
    Print out firstNode‘s next node’s data. You should see the second node instance instead of the default null value.