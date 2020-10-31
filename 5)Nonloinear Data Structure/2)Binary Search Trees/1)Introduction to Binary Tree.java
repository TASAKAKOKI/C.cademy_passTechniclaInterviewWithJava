Introduction
    A "Binary Search Tree" is an 'efficient value structure for fast (O(log N)) data storage and retrieval'. It is a specialized tree data structure that is "made up of a root node, and at most two child branches or subtrees".

    In this lesson’s implementation, each node will be an instance of the BinarySearchTree class. Each Binary Search Tree node has the following properties:
        : "a value"
        : "a depth value", where a "depth of 1 indicates the top level of the tree" and a depth greater than 1 is a level somewhere lower in the tree
        : a "left pointer" that points to a left child which is itself a Binary Search Tree, and "must have a data lesser than its parent node’s data"
        : a "right pointer" that points to a right child which is itself a Binary Search Tree, and "must have a data greater than or equal to its parent node’s data"

    In this lesson, we will implement a Binary Search Tree in Java. Each node in the tree will be a BinarySearchTree instance, containing integer data, an integer depth, and insertion and retrieval methods. Let’s get started!

Instructions
    1.
    We have provided an empty BinarySearchTree class in BinarySearchTree.java. Create the following public instance variables as the first lines of the class:
        int value
        int depth
        BinarySearchTree left
        BinarySearchTree right

    2.
    Below the instance variables, create a constructor. It should take two parameters: int value and int depth. Inside this constructor, set the values of the value and depth instance variables equal to the parameters. Set left and right trees both to null.

    3.
    Create another constructor that takes one parameter: int value. Inside this constructor, set the instance variable value equal to the value parameter. Set the instance variable depth equal to 1. Set left and right trees both to null.

    4.
    In the main method, create a BinarySearchTree instance called bt with value 15. This creates a root tree node. Print bt‘s value to the output.