Remove Child II
    In this exercise, we’ll implement the .removeChild() method in TreeNode that 'takes a data value as an argument'. In this version of .removeChild(), because there could be multiple TreeNodes with the same data, we 'will be removing all the TreeNodes we find whose data matches the target data'.

    The first step is to "check whether this TreeNode has any children". If it doesn’t, the method should return immediately.

    If not, it should "loop through each child and check for matching data". If there is a data match, that node should be removed and the method should return. If not, removeChild() would be called on the current node’s children. Note that this means any child or grandchild (or great-grandchild, or so on) of the original node that has matching data is removed, and any descendants of the removed node(s) are also removed. We will not be moving the children of the removed node up the tree.

    This is the basic template:
        If this node has no children
            Return
        For each child
            If child data matches
                Remove that child and return
        For each child
            Call removeChild with same data argument for each child

Instructions
    1.
    Create another .removeChild() method with parameter Object targetData.

    2.
    In this .removeChild() method, write an if statement that checks whether the current node has no children. Use ArrayList’s .isEmpty() function on this.children. If true, your method should return.

    3.
    In the same method, right after, create a parallel (not nested) for loop that checks each child in this.children. For each child, if its data matches the target data, use .remove(child) on this.children, and return.

    4.
    Inside the method, create another parallel for loop that iterates through each TreeNode child in this.children. This for loop code will only be reached if the for loop above it did not find any matching child data in this.children.

    Inside this for loop, have each child instance call .removeChild() with the argument targetData.

    5.
    Now that we have completed implementing both .removeChild() methods, let’s test them. Go to the Tree.java tab, and for the tree created in the main method, do the following:

    Display the output of the tree using .print()
    Remove the TreeNode grandchild2 from child2
    Display the output of the tree using .print(). You should see that grandchild2, which contained "Y", is no longer in the tree.
    Remove the element "O" in the tree using its data
    Display the output of the tree using .print(). Notice that "O" is no longer in the tree.