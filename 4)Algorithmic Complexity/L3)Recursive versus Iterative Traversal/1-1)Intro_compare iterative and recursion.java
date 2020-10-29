Introduction
    In this lesson, you will learn how to implement a method called findNodeRecursively() inside the LinkedList class. The method accepts a value as input and recursively checks each node in the linked list until the node of interest is found. If it is found, the method should return the node. Otherwise, it should return null.

    Before you begin, let’s take a look at how we can search for an element in a linked list using an iterative approach. The code below is taken from the LinkedList() class in LinkedList.java
        ...
        public Node findNodeIteratively(String data) {
            Node currentNode = this.head;

            while (currentNode != null) {
                if (currentNode.data == data) {
                    return currentNode;
                }
                    currentNode = currentNode.getNextNode();
            }

            return null;
        }
    The method starts at the head of the linked list and checks if the input data is equal to the data value at the head. The method continues to iterate through the linked list until the node is found or the end of the list is reached. If the node is not found by the end, the method returns null.

Instructions
    1.
    Scroll to the main() method in LinkedList.java, and use findNodeIteratively() to find the Node in myList with data equal to "Node 3".

    Save the returned value to foundNode, then print foundNode.data to the console.