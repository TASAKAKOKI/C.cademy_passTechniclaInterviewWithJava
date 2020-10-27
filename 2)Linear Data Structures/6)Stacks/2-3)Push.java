Push
    Stacks operate by making modifications just to the top, or head, of the stack. If we want to add a plate to our dish stack, we add it to the top of the pile. To add an item to the stack, we will use the .push() method. Keep in mind that our stack is an instance of a LinkedList which is built using the Node class.

    We will implement the .push() method of the Stack class below.

Instructions
    1.
    Below the constructors, define a method called .push() that takes a String parameter, data, which is the value used to create the Node instance that will be added to the stack. .push() does not return anything.

    2.
    Inside .push(), use the LinkedList method that will add a new value to the head of this.stack. Increment this.size by one as well since we are increasing the total number of nodes in the stack.

    3.
    Let’s also keep track of what nodes have been added and their respective updated sizes by printing out a message in .push(). Print a message with this information after the stack is updated in the method. If we ran the following:
        Stack animals = new Stack();
        animals.push("fish");

    The program should print exactly the following, including capitalization and punctuation.

    Added fish! Stack size is now 1

    4.
    Check out how your .push() method works by uncommenting the code in .main(). Each plate is added to the top of the stack of dishes!