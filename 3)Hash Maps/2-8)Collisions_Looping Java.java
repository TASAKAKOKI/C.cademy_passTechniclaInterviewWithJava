Collisions: Looping Java
    We’ve added code to .assign() that takes care of an empty list, but what happens when there is a collision and there are already values stored at a particular index?

    If there are already values stored in nodes at an index, we need to loop over each node in the linked list in order to determine how to proceed.

    The two possibilities we’ll encounter while looping are:
        : The key we are looking for and the key of the current node is the same, so we should overwrite the value
        : No node in the linked list matches the key, so we should add the key-value pair to the linked list as the tail node

    With this in mind, the .assign() code for looping should look like this:
        store the head node of the linked list in a variable current

        while there is a current node
        if the current node''s key is the same as the key
            store the key and value in current
        if the current node is the tail node
            store the key-value pair in the node after current
            exit the loop      
        set current to the next node
Instructions
    1.
    After the if statement in .assign() that checks for a head node, declare a Node, current. Store the head node of the linked list in current.

    We’ll use current to begin iterating over the linked list until we find the tail node.

    2.
    After the if statement in .assign(), iterate over the linked list to find the tail by using a while loop.

    While we haven’t visited all the nodes in a linked list, we should keep looping. Set the while loop to the variable in which we stored the current node and check the condition that our current node is not equal to null.

    3.
    Key-value pairs are stored in a node with a method in our custom Node class. (To review how nodes are implemented, see the code for the Node class in Node.java.)

    There are two possibilities when iterating over nodes:
        : The current key and the key we are trying to add are the same, and we should overwrite the node’s value with the current value
        : The current key and the key we are trying to add aren’t the same and we should check if there are more nodes in the linked list
    Add an if statement in the while loop that does a strict equality check of the current node’s .key and key. If the two keys are the same, overwrite the current node’s .key and .value properties with the key-value pair we want to store.

    4.
    Each node knows the node after it. We can use this to determine the tail of the linked list.

    Still inside of the while loop, write a condition that checks if the current node is the tail node. Check what Node methods are available to you in the Node.java file.

    5.
    If the current node is the end of the linked list, there are no more nodes to loop over and check for a matching key.

    Inside the if condition that checks for a tail node, set the next node after current to a new node with the key-value pair stored in it. (Check the Node.java file to see what methods are available to you to do this.) Then break out of the while loop.

    6.
    If we don’t reach the end of the linked list on this iteration, we need to check the next node.

    Outside of the last if statement in the while loop set current to the next node in the linked list to continue the loop. Use the LinkedList method that gets the next node in a linked list.