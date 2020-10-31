Tree and Print
    In this exercise, we will create the Tree class. This is a pretty barebones data structure because TreeNode already has pointers to children. For the Tree class, we just need to keep track of the TreeNode root. We should have methods that allow us to traverse the whole tree from the root and print.

    For the print, wouldn’t it be nice to be able to display the structure of our tree in a visually captivating way? We have provided a helpful method, .print() that will give you a formatted text display of our tree. For example, a tree with 3 levels starting with root node 15; children 3, 12, 0; and grandchildren 6, 9, 19, 8, 10, 19 is displayed below:
        15
        -- 3
        -- -- 6
        -- -- 9
        -- 12
        -- -- 19
        -- -- 8
        -- 0
        -- -- 10
        -- -- 19
    This method is provided and takes two parameters: "a current TreeNode" and "an integer level", to enable recursive printing.

Instructions
    1.
    In your Tree class, create a public TreeNode instance variable called root

    2.
    Define a constructor that takes one TreeNode parameter, root. Inside the constructor, set the tree’s root instance variable equal to the root parameter.

    3.
    Let’s create a 3-level tree with a series of TreeNode .addChild() operations!

    In the main method of the Tree class, we created a few TreeNodes. (treeRoot with data "S", child1 with data "N", child2 with data "O", grandchild1 with data "w", and grandchild2 with data "Y".)

    Add child1 and child2 to treeRoot‘s children.
    Add grandchild1 to child1‘s children.
    Add grandchild2 to child2‘s children.
    After all the addChild() statements, create a Tree called letters with the argument treeRoot.

    4.
    We’ve provided a .print() method in the Tree class. For ease of use, it has no parameters.

    In the main method, call the .print() method on letters. Notice the output!