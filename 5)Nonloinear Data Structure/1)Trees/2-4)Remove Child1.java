Remove Child I
    Like .addChild(), .removeChild() should take two different types of arguments. We should be able to remove a child from a tree by referring to its data or passing the exact TreeNode object. Check out the code example below:
        TreeNode existing = new TreeNode(3);
        root.addChild(existing);

        // Both versions of removeChild:
        root.removeChild(existing)
        root.removeChild(3);

    In both cases, we should look for the matching TreeNode in not just the current node’s children, but also in the children’s children and so on. We should not delete anything if there’s no matching TreeNode instance or data. We don’t know how many levels of children we’ll have to look through, so the best way to implement .removeChild() is to write a recursive method.

    In this exercise, we will work on the version of .removeChild() that takes a TreeNode argument. We’ll continue the other version in the next exercise.

    This is our basic template:
        If this node has no children
            Return
        Else if the target node is found in the children list
            Remove the child from the children list
            Return
        Else
            Call .removeChild() for each child
Instructions
    1.
    In TreeNode.java, define a new public void method, .removeChild(), that takes one TreeNode parameter, childToRemove.

    2.
    Inside .removeChild(), write an if statement that checks whether the current node has no children. (Use ArrayList‘s .isEmpty() method on this.children.) If that’s true, your method should return.

    3.
    In the same method, after the if statement, add an else if statement that checks whether this.children includes childToRemove, and if true, removes the child from this.children and returns.

    4.
    Add an else block. The code inside should be a for loop through each child of this.children. Each child should call removeChild() with the same argument: childToRemove.

    We will call this completed method in the next exercise!