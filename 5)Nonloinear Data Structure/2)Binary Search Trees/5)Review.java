Review
    In this lesson, you have successfully built a Binary Search Tree (BST) data structure in Java. You have implemented:
        : a BinarySearchTree class ''containing value, left and right child nodes and a depth value.
        
        : an ".insert()" method to place a node of that value at the correct location in the Binary Search Tree. The time efficiency of this operation is O(logN) – if there are N nodes in the BST, the max depth of an average tree is log(n), so this method makes at most log(n) value comparisons. In the worst case of an imbalanced tree (all values on one side), the performance would be O(N).
    
        : a ".getNodeByValue()" method to retrieve a node in the tree by its value. The time efficiency of this operation is also O(logN) – if there are N nodes in the BST, the max depth of the tree is log(n), so this method makes at most log(n) value comparisons. In the worst case of an imbalanced tree (all values on one side), the performance would be O(N).

        : a ".depthFirstTraversal()" method to print the inorder traversal of the Binary Search Tree. This visits every single node, so if there are N nodes, time efficiency for traversal is O(N).

    Great job! The Binary Search Tree (BST) is a dynamic data structure that provides efficient insertion and search of data. It has the benefit of being easily expandable while maintaining a sorted order of the data. In more complex implementations, we could include:
        : a "delete()" method
        : a "self-balancing feature" as data is inserted so that the two sides of the tree are even, guaranteeing a max depth of logN
        
    Try these out for yourself if you are up for the challenge!

Instructions
    Let’s review by verifying the correctness of our implementation!

    The main method generates ten random values to be added to the Binary Search Tree with a root value of 15.

    <Run the file multiple times.>
        After each run, verify that the nodes are in the right places by paying attention to the outputs. To print the in-order traversal at the end, uncomment the last two lines of code in the main method.