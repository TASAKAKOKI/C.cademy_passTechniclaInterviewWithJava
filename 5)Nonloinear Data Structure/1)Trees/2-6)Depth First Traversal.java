Depth First Traversal
    Now that we can add TreeNodes into our tree, the next step is to be able to "traverse a tree and display its content". We can do this in one of two ways: "depth-first" or "breadth-first".

    "Depth-first-search (DFS)" is a technique that 'visits the first child in the children list and that node’s children recursively before visiting all the first child’s siblings and then their children recursively'. The algorithm is as follows:
        Display the current tree node''s data
        For each child in children
            Call DFS traversal recursively on child
    
    Currently, the .print() method given in the Tree class is printing depth-first. So, based on this tree displayed using .print():
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

    The depth-first traversal would simply be:
        15 3 6 9 12 19 8 0 10 19

Instructions
    1.
    In Tree.java, define a public void method, .depthFirstTraversal() below .print() that takes a single TreeNode parameter named current.

    2.
    Inside .depthFirstTraversal(), display the data of the current node, plus one space " ", using System.out.print() (not println, since we don’t want every element on a separate line). For example, displaying a node with data "5" should be displayed as "5 ".

    3.
    In the method, write a for loop so that for each TreeNode child in current‘s children list, we call .depthFirstTraversal() on child.

    4.
    In the main method, call .depthFirstTraversal() from the Tree named tree with the argument treeRoot, which is the root of the sample tree we’ve created.    