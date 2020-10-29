Add Child
    Now that we have one TreeNode to start, the next task is to be able to add a child to our current node. Each child in our children list has to be an instance of TreeNode.

    We want .addChild() to accommodate both a TreeNode or a data argument.
        root.addChild(new TreeNode(3));
        root.addChild(3);

    In the code above, both versions of the .addChild() method should add a TreeNode child with data 3 to the current root. Let’s add .addChild() methods to TreeNode.java.

Instructions
    1.
    Below the constructor, define a public void method, .addChild() which takes one TreeNode parameter named child. In the method, use ArrayList‘s .add() method to add child to this TreeNode’s children list.


    2.
    Define another public void .addChild() method which takes one Object parameter named childData. Inside, add a new instance of a TreeNode containing childData to this TreeNode’s children list.


    3.
    In the main method, do the following:
        : Add a child of value 15 to the root node by simply calling the addChild() method.
        : Print out the size of the children list of root.

    4.
    Still in the main method:
        : Add another child by creating a TreeNode called biggerChild with value 30.
        : Add biggerChild to the root‘s children using the addChild() method.
        : Print out the size of the children list of root.