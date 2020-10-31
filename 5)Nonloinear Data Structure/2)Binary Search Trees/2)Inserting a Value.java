Inserting A Value
    When inserting a new value into a Binary Search Tree, we "compare it with the root node’s value". We will implement an .insert() method in the BinarySearchTree class, assuming that we "call the method from a root node" like so:
        rootNode.insert(aValue);
    
    Here how we want the insertion to go:
        : If a new value is less than the current (root) node’s value, we want to insert it as a descendant on the left side.
        : If a left child to the current node doesn’t already exist, we create a new BinarySearchTree node with that value as this node’s left child.
        : If a left child already exists, we would call insert() recursively on the current node’s left child to insert further down.
        : If the new value is NOT less than the current (root) node’s value, we’ll want to insert it as a descendant on the right side! A similar logic applies:
            : If a right child to the current node doesn’t already exist, we create a new BinarySearchTree node with that value as this node’s right child.
            : If a right child already exists, we would call insert() recursively on the current node’s right child.
    
    Let’s illustrate the insertion procedure with a tree whose root node has the data 100:
        Insert 50
            50 < 100, left child node doesn''t exist, create a left child node with value 50 and depth 2
                100
                /
              50

        Insert 125
            125 > 100, right child node doesn''t exist, create a right child node with value 100 and depth 2
               100
              /   \
            50    125
        
        Insert 75
            75 < 100, left child node of 50 exists, recursive insert at left child

            75 > 50, right child node doesn''t exist, create a right child node with value 75 and depth 3
                   100
                  /   \
                50    125
                  \
                   75
        Insert 25
            25 < 100, left child node of 50 exists, recursive insert at left child
            25 < 50, left child node doesn''t exist, create a left child node with value 75 and depth 3
                 100
                /   \
               50    125
              /  \
             25  75
    
    Note that we need to update the depth of each inserted node. To do so, we’ll add 1 to the current node’s depth when we insert a node as a left or right child.

Instructions
    1.
    Define a public method, .insert(), with an int parameter called value and a return type void, below the constructor.

    2.
    To insert the value, let’s first check whether the value to insert is less than the current node’s value.
        Inside .insert(), write an if statement that checks if the value parameter is less than the current node’s value (this.value).
    If so, we should place it in the left subtree. We first need to check if there isn’t already a left child node. If there isn’t, we will create the left child Binary Search Tree with the target value and a depth one more than the current node.
        Nest an if statement that checks if a left child node doesn’t exist yet (equal to null). If so, set this.left equal to a new BinarySearchTree with the target value and a depth one greater than this.depth.
    If left already exists, call .insert() from the left child node.
        Right after this if block, add an else block, also nested in the outer if. This else code executes if the left child exists already. Inside the else, call the .insert() method from the left child, with the same value as the argument.

    3.
    Alternatively, if the target value is not less than the root node’s value, we will place it in the right subtree. We’ll be writing very similar code as the last checkpoint:
        : Create an else statement block parallel to the outer if statement from the previous step.
        : Nest an if statement that checks if a right child node doesn’t exist yet. If so, set this.right equal to a new BinarySearchTree with the target value and a depth one greater than this.depth.
        : Right after this nested if, add an else statement such that if right already exists, call its .insert() method passing on value

    4.
    Let’s add some print statements in .insert() wherever we actually insert a value as a left or right child so we can verify the value is added correctly!

    Inside .insert(), just after you insert a new BinarySearchTree as the left child, paste this print statement on the next line:
        System.out.printf("Tree node %d added to the left of %d at depth %d \n", value, this.value, this.depth + 1);
    
    Just after you create a new BinarySearchTree on the right, paste this print statement:
        System.out.printf("Tree node %d added to the right of %d at depth %d \n", value, this.value, this.depth + 1);

    5.
    Go to the main method. A default BinarySearchTree has been created for you with an initial value of 100. Let’s see if insert() matches the expected behavior from our example earlier. Insert the following values to the tree in this order:
        50
        125
        75
        25

    At each step, verify the output and make sure the insertion messages match their expected position:
            100
           /   \
         50    125
        /  \
       25   75