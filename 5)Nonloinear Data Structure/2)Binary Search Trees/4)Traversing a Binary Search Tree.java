Traversing a Binary Search Tree
    There are "two main ways of traversing a binary tree": 'breadth-first' and 'depth-first'.
    
    1) With "breadth-first traversal", we begin traversing at the top of the tree’s root node, displaying its value and continuing the process with the left child node and the right child node. Descend a level and repeat this step until we finish displaying all the child nodes at the deepest level from left to right.

    2) With "depth-first traversal", we always traverse down each left-side branch of a tree fully before proceeding down the right branch. However, there are three traversal options:
        : "Preorder" is when we perform an action on the 'current node first', followed by its 'left child node' and its 'right child node'
        : "Inorder" is when we perform an action on the 'left child node first', followed by the 'current node' and the 'right child node'
        : "Postorder" is when we perform an action on the 'left child node first', followed by the 'right child node' and then the 'current node'
    
    For this lesson, we will implement the "inorder option". The "advantage" of this option is that the "value is displayed in sorted order from the smallest" to the biggest.

    To illustrate, let’s say we have a binary tree that looks like this:
                 15
           /------+-----\
          12            20
         /   \         /   \   
       10     13     18     22
       / \   /  \    / \   /  \
      8  11 12  14  16 19 21  25
    
    We begin by traversing the left subtree at each level, which brings us to 8, 10, and 11 reside. The inorder traversal would be:
        8, 10, 11

    We ascend one level up to visit root node 12 before we descend back to the bottom where the right subtree of 12, 13, and 14 resides. Inorder traversal continues with:
        12, 12, 13, 14
    
    We again ascend one level up to visit root node 15 before we traverse the right subtree starting at the bottom level again. We continue with the bottom leftmost subtree where 16, 18, and 19 reside. The inorder traversal continues with:
        15, 16, 18, 19
    
    We ascend one level up to visit root node 20 before we descend back to the bottom where the rightmost subtree of 21, 22, and 25 resides.
    Traversal finishes with:
        20, 21, 22, 25
    
    The entire traversal becomes:
        8, 10, 11, 12, 12, 13, 14, 15, 16, 18, 19, 20, 21, 22, 25
    
    Notice that all the values displayed are sorted in ascending order.

    Let’s implement a method that prints the inorder traversal for the BinarySearchTree class!

Instructions
    1.
    Define a public method of return type void, .depthFirstTraversal() below .getNodeByValue(). It takes no parameters.

    2.
    Inorder traversal means we will traverse the left child node followed by the root node and the right child node. Inside .depthFirstTraversal():

    Check to see if the left child node exists
    If it does, call this traversal method on the left child node
    This traverses the left subtree.


    3.
    Now we want to look at the root node. We can simply print out the value this contains and the tree level of the root node.

    After the if statement you just created checking for the left, print out the value of the root node.


    4.
    The next step is to traverse the right child tree. The code to traverse the right one will be very similar to the code we’ve written to traverse the left child tree. Continuing the code in depthFirstTraversal() after the print statement,

    Check to see if the right child node exists
    If it does, call this method on the right child node

    5.
    Go to the main method and print the inorder depth-first traversal of the BinarySearchTree called tree.