Constructor and Adding to the Head
    Let’s implement a linked list in Java. As you might recall, a linked list is a sequential chain of nodes. Remember that a node contains two elements:
        data (in our case, a String)
        a link to the next node
    We are going to use the Node class you created in the last exercise. You can find it in Node.java.
    Depending on the end-use of the linked list, there are a variety of methods that we can define.

    For our use, we want to be able to:
        add a new node to the beginning (head) of the list
        add a new node to the end (tail) of the list
        remove a node from the beginning (head) of the list
    print out the nodes in the list in order from head to tail
    Ready? Let’s get started!

Instructions
    1.
    A linked list needs a head, so let’s start by creating the head property. At the top of the LinkedList class, outside of the main method, declare a head Node instance variable. It should be public.

    2.
    Inside the LinkedList class, below your instance variable, define the constructor. It should take no arguments, and set the list’s head to null.

    3.
    Define an .addToHead() method that takes a String data as an argument. It returns nothing, and should be accessible outside of the class.
    Inside it, create a Node variable named newHead that takes data as an argument.

    4.
    Still inside your .addToHead() method, create a currentHead node, and set it equal to the list’s head. Then change the list’s head to equal newHead.

    5.
    Finally, we want to set our new head’s next node to the past head, so that we can maintain the linked list.
    Create an if statement that checks if there was a head to the list. If there is, set the this.head’s next node to currentHead.