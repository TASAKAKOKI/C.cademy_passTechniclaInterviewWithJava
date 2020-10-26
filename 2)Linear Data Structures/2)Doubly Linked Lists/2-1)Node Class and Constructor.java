Node Class and Constructor
    Let’s implement a doubly linked list in Java. A doubly linked list is a sequential chain of nodes, just like a singly linked list. The nodes we used for our linked lists contained two elements:
        data
        a link to the next node
    The difference between a doubly linked list and a singly linked list is that in a doubly linked list, the nodes have pointers to the previous node as well as the next node. This means that the doubly linked list data structure has a tail property in addition to a head property.
    
    Depending on the end-use of the doubly linked list, there are a variety of methods that we can define.

    For our use, we want to be able to:
        add a new node to the beginning (head) of the list
        add a new node to the end (tail) of the list
        remove a node from the beginning (head) of the list
        remove a node from the end (tail) of the list
        find and remove a specific node by its data
        print out the nodes in the list in order from head to tail
    We will reuse the .printList() method from our LinkedList class, but the rest of the DoublyLinkedList methods will either be modified or new.

    To start, we are going to look at the updated Node class and create the constructor.

    Ready? Let’s get started!

Instructions
    1.
    We are going to use a provided Node class, which you can find in Node.java. We’ve added a previous property to the class, as well as .setPreviousNode() and .getPreviousNode() methods. Take a look at it to see the changes.

    2.
    In your DoublyLinkedList class, create:
        a public head Node instance variable
        a public tail Node instance variable
        a constructor that has no parameters.

    3.
    Inside your DoublyLinkedList constructor:
        Set the list’s head to null
        Set the list’s tail to null