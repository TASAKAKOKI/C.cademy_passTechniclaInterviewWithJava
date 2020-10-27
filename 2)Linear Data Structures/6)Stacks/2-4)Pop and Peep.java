Pop and Peek
    Once we’ve added nodes to a stack, we have the option to remove them! Unlike queues which function with a first in, first out protocol, the nature of stacks requires us to both add AND remove nodes from the head of the stack. We will create a method called .pop() which will remove the head node, reset the head to the following node (ie. the next dish in a pile), and return the original head.

    If we want to just view the head node without removing it, we can use the method .peek(), which we will also implement below.

Instructions
    1.
    Below .push(), define the method .pop() which will return a String. Return an empty String for this step.

    2.
    Inside .pop(), use the LinkedList method that will get the value of the head of this.stack and set this value equal to a String data. Decrement this.size by one since we are decreasing the total number of nodes in the stack. After this, replace return "" with a statement returning data inside .pop().

    3.
    Let’s also keep track of what nodes have been removed and their respective updated sizes by printing out a message in .pop(). Print a message with this information after the stack is updated and before the return statement in the method.

    If we ran the following:
        Stack animals = new Stack();
        animals.push("cat");
        animals.pop();
    The .pop() method should print the following String. Make sure to use the exact capitalization and punctuation used below:
        Removed cat! Stack size is now 0

    4.
    To just see the value of the head node in a stack, we can create a method .peek(). Define a method named .peek() in the Stack class. .peek() should return an empty String for now.

    5.
    Inside .peek(), we want to return the data in the head of the stack. We can do this using an attribute of the head node, data, found in Node.java. Replace the empty String with this value.

    6.
    Check your implementation by uncommenting the code at the bottom and running your program. Each colored bracelet is pushed onto the bracelets stack as someone puts it on. The first one put on is the last to come off!