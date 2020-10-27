Avoiding Overflow & Underflow
    With these methods under our belt, we can now use them to make the modifications to our Stack class to prevent overflow and underflow. A stack without a maximum size limit can experience underflow, but not overflow. A stack with a maximum size limit can experience both underflow and overflow.

    Brainstorm whether .hasSpace() or .isEmpty() would be more helpful in guarding against each of these stack scenarios:
        Trying to .peek() or .pop() from an empty stack
        Trying to .push() onto a stack that is full

Instructions
    1.
    Go back to your .push() method. Inside it, let’s add a conditional statement that checks if the stack has space (using a helper method) before proceeding. If there is space in the stack, the rest of the body of the method should execute.

    2.
    If there is no space, we should throw an error letting the user know with the message “Stack is full!”. Add an else branch in .push() and throw this error within it.

    3.
    Similarly in .pop(), add a conditional statement that checks if the stack is empty (using a helper method) before proceeding. If the stack is not empty, the rest of the body of the method should execute. If the stack is empty, return an empty String for now.

    4.
    If the stack is empty, we should throw an error letting the user know with the message "Stack is empty!". In an else branch, remove the return statement and replace it with this thrown error.

    5.
    Let’s make sure .peek() also returns a valid value when it is not empty. Inside .peek(), if the stack is empty, return null. Otherwise, if the stack is not empty, return the head node like we already do in the method.

    6.
    Uncomment the code at the bottom of the file and run it. Push and pop as many cars as you can onto/from the driveway stack. Check out the messages logged to the terminal, including errors.