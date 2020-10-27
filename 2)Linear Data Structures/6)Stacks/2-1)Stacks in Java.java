Introduction to Stacks in Java
    As you may recall, a "stack is a linear data structure that contains an ordered set of data which follows a LIFO (last in, first out) protocol for accessing its data". A stack can be imagined as a literal stack of dishes to wash. Since you have an understanding of how stacks work in theory, now let’s see how they can be useful in the wild – with Java!

    Remember that there are three main methods we want our stacks to have:
        .push(): adds data to the top of the stack
        .pop(): removes data from the top of the stack
        .peek(): views the data at the top of the stack without removing it

    We will also need to consider the stack’s size and tweak our methods a bit so that our stack does not “overflow” or “underflow”.

    If you’ve taken our course where we created a linked list, you’ll see that many of the methods we created there will work perfectly for our stack implementation. To create a stack, we will use both our well-established LinkedList and Node data structures. Files containing these classes can be found at the top of the code editor.

    Let’s get started building our Stack class!

Instructions
    1.
    To the right in Stack.java, we’ve given you the Stack class which contains its instance variables and constructor.

    Inside the constructor, instantiate .stack as an empty LinkedList. Also instantiate .size such that it tracks the number of nodes in .stack.

    2.
    Uncomment the code in .main() at the bottom of the file and run it. You should see a message logged to the terminal. You’ve created an empty stack!