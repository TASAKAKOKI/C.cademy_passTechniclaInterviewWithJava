Introduction
    "Trees" are wonderful "data structures that can model real life hierarchical information", including 'organizational charts', 'genealogical trees', 'computer file systems', HTML elements on a web page also known as the 'Document Object Model (DOM)', 'state diagrams', and more.

    A tree is "composed of tree nodes". There is a 'root tree node', and 'children tree nodes' which may or may not be parent nodes themselves. In this lesson, we will first focus on building the TreeNode data structure. Then we’ll create the Tree.

    A tree node is a very simple data structure that contains:
        - Data
        - A list of children, where each child is itself a tree node
        - (Optional) Pointer to a parent tree node, if there is a parent. Some implementations do this, but we won’t for this lesson.
        
    We can add data to and remove data from a tree and traverse it in two different ways:
        : depth-first
        or
        : breadth-first.

    Let’s first implement our tree node data structure as a TreeNode.

Instructions
    1.
    In TreeNode.java, you will find an empty TreeNode class. We will maintain the children of TreeNode as an ArrayList. Using an ArrayList for the children will make adding and removing children quicker and easier

    In your TreeNode class, create:
        : a public Object instance variable called data
        : a public ArrayList<TreeNode> instance variable called children

    2.
    Define a constructor that takes one Object parameter, data. Inside the constructor:
        : set the data class variable equal to the parameter data.
        : set the children class variable equal to a new ArrayList of TreeNodes.

    3.
    In the main method, instantiate a TreeNode root with argument of "test". Print out the value of root‘s data.