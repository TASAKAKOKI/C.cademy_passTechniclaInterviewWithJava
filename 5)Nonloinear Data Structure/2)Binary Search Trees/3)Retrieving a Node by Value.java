Retrieving A Node By Value
    Recall that a Binary Search Tree provides a fast and efficient way to store and retrieve values. Like with .insert(), "the procedure to retrieve a tree node by its value is recursive". We want to 
    "traverse the correct branch of the tree by comparing the target value to the current node’s value".

    The "base case for our recursive method is that when the values match, we return the current node". The "recursive step is for the method to call itself from an existing left or right child node with the value".

        If: target value is the same as the current node value
            Return the current node
        Else if: target value is less than the current node''s value and there is a left child node
            Recursively search from the left child node
        Else if: target value is greater than or equal to current node''s value and there is a right child node
            Recursively search from the right child node
        Else return null
        
    Given the following tree:
             100
            /   \
          50    125
         /  \
        25  75
    
    To retrieve 75, the algorithm would proceed as follows:
        At root node, 75 < 100 and there is a left child
             100
            /   \
        ==>50    125
          /  \
         25  75

        At the node 50, 75 > 50 and there is a right child
             100
            /   \
          50    125
         /  \
        25  75 <==

        Node 75 = 75, return this node

    If on the other hand we were retrieving 55 from the same tree, To retrieve 55, the algorithm would proceed as follows:
        At root node, 55 < 100 and there is a left child
              100
             /   \
        ==>50    125
          /  \
         25  75

        At the node 50, 55 > 50 and there is a right child
              100
             /   \
           50    125
          /  \
         25  75 <==

        At the node 75, 55 < 75 and there is no left child. Whole tree is correctly searched at this point, so we return null.
    
    Let’s get to implementing the .getNodeByValue() method in BinarySearchTree! Just like .insert(), we are assuming we call this method from the root of the tree.

Instructions
    1.
    Define a new method, .getNodeByValue(), below the .insert() method that takes one int parameter, value, and returns type BinarySearchTree.

    At the bottom of the method, add a default return statement that returns null.

    2.
    Let’s write the base case. The first thing we do is to compare the target value with the root node’s value (this.value). If they are the same, return this node.

    3.
    If the target value cannot be found in the root node, we want to navigate further down the Binary Search Tree. We start with the left child node if it exists and recursively search in the left subtree. To traverse the left tree, we need to make sure the target value is less than the root node’s value.

    Write an else if statement that checks:
        : if the target value is less than this.value, AND
        : if the left child node exists
    
    Inside the else if block, return with a call to .getNodeByValue() method from the left child node.

    4.
    Next, we want to implement the recursive step for the right child node if it exists and

    Write another else if block that:
        : if the target value is greater than this.value, AND
        : if the right child node exists
    
    Inside the else if block, return with a call to .getNodeByValue() method from the right child node.

    5.
    Congrats on finishing the code for getNodeByValue()! Let’s test it by going to the main method. We’ve already created a Binary Search Tree.
        : Print the output of searching for value 75 in the tree.
        : Print the output of searching for value 55 in the tree.
    
    The search for 75 should return a BinarySearchTree instance, whereas the search for 55 should return a null. Use System.out.println()!