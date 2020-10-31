Review
    In this lesson, you have successfully built a tree data structure in Java. You have implemented:
        : A "TreeNode class" that contains an "Object data" and maintains a "list of TreeNodes called children".
        : In the TreeNode class, two versions of ."addChild()", which 'accepts either a specific TreeNode or a data value' and adds it to the immediate list of children from the TreeNode the method is called in.
        : In the TreeNode class, two versions of ."removeChild()", which 'accepts both a specific TreeNode or a data value'. The first version removes at most one TreeNode, but the second version removes all descendants (and consequently their descendants) with matching data.
        : A Tree class ''that keeps a root TreeNode and can print and traverse the tree in different ways.
        : In the Tree class, a ".depthFirstTraversal()" recursive method to traverse the tree by 'following a node down to its furthest down child'
        : In the Tree class, a ".breadthFirstTraversal()" iterative method to "traverse the tree a level at a time"
    
    Congratulations! Trees have many applications, and this basic, flexible implementation opens the door for more custom versions you’ll likely code in the future. Some suggestions for your own practice:
        : "Add a parent instance variable" to TreeNode. This would make it easy for removeChild() with a data argument to move the children of a deleted TreeNode up the tree, so that the children’s grandparent could become their parent.
        : "Instead of a data instance variable of type Object", you could "make limit the type to something like String or Integer".
        : "Create another print() method" in the Tree class that accepts an int level argument, and prints out just the TreeNode data from that level of the tree.
        : "Enforce a number limit of children that can exist in a TreeNode‘s children list".
        
Instructions
    1.
    In this exercise, we will be modifying our code to match the tree that’s pictured below. The tree is a basic categorization of animals, with child nodes indicating subgroups. For example, “Horse” is a part of the “Equine” category, which is part of the “Mammals” category.

    This tree has a top-most node called 'Animals', which has child nodes 'Reptiles', 'Mammals'. 'Reptile' has child nodes 'Lizard' and 'Snake', and 'Mammal' has child nodes 'Equine', 'Bovine', and 'Marsupial'. 'Equine has child nodes 'Horse' and 'Zebra', 'Bovine' has child node 'Cow', and 'Marsupial' has child nodes 'Koala' and 'Kangaroo'.
    Take a look at the main method in Tree.java. In it, we’ve created tree nodes to form animalTree. You can run the code as is to view the tree structure and how it compares with the diagram above.

    In the main method, just before the tree is printed, add and remove the appropriate tree nodes so that the resulting animalTree tree matches this picture.

    2.
    Print the depth-first traversal of the tree!

    3.
    Print the breadth-first traversal of the tree!

    4.
    Which printed traversal is more readable in terms of knowing which animals are in the same category?