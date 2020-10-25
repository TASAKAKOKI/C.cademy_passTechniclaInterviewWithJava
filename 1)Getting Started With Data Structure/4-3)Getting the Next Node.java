Getting the Next Node
    While we could continue accessing the next node property directly it’s safer to have important variables only accessible through methods.
    Let’s go ahead and create a simple .getNextNode() method that will return the next node property.

Instructions
    1.
    Create the .getNextNode() method in the Node class. It should take no arguments. This method will return a Node, so it should be a public Node method.
    Inside the method, return the next node.

    2.
    Now that we have setter and getter methods for the next instance variable, we can change it from a public variable to a private one. This will ensure that it can never be accessed outside of the Node class.
    At the top of the class, change next to a private variable.

    3.
    Using the Node instances that we have already created in our main method, verify that the .getNextNode() method returns the correct next node property by printing firstNode‘s next node’s data using the new method.
    We should note that since our main method is in the Node class, it’s still possible to access the next property directly. This won’t be possible anywhere outside the class.