Implementation
    Let’s see all of our Node class methods together in action!
    Imagine we are working at an ice cream shop that sells three flavors: strawberry, banana, and coconut. The signature fruity sundae is made of these three flavors, but our new hires have a hard time remembering the order.
    To help them remember, our Java nodes may do just the trick. Let’s get started…

Instructions
    1.
    In the main method, instantiate three nodes:
        The first will represent our strawberry ice cream with the name, "Berry Tasty". Assign the node to the variable, strawberry.
        The second will represent our banana ice cream with the value, "Banana-rama". Assign the node to the variable, banana.
        The third will represent our coconut ice cream with the value, "Nuts for Coconut". Assign the node to the variable, coconut.

    2.
    Now let’s put these ice cream nodes in order. strawberry goes first, and then banana goes after strawberry. Finally, coconut goes after banana.
    Below the newly created nodes, use your .setNextNode() method so that:
        banana is the next node of strawberry
        coconut is the next node of banana
    3.
    Let’s go through our ice cream nodes to make sure that they are linked in the correct order.
    Create a new currentNode variable and set it to strawberry.
    Create a while loop that only iterates when the currentNode is not null. Inside the while loop, print currentNode’s data, and then update currentNode to its next node.
    We should see the ice cream flavors in order of strawberry, banana, and coconut in the terminal.