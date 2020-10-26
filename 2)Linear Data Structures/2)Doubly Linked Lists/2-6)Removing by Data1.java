Removing by Data I
    In addition to removing the head and the tail of the list, it would be useful to be able to remove a specific element that could be anywhere in the list. Imagine that you have a list of errands to run. You don’t always do your errands in order, so when you finish doing your laundry and want to cross it off, that could be somewhere in the middle of the list. We are going to build a .removeByData() method that will allow you to cross off (remove) that errand no matter where it is in the list.

    In order to do this:
        - Iterate through the list to find the matching node
        - If there is no matching element in the list:
            Return null
        - If there is a matching node, we will then check to see if it is the head or tail of the list:
            If so, call the corresponding .removeHead() or .removeTail() method
        - If not, that means the node was somewhere in the middle of the list. In that case:
            Remove it by resetting the pointers of its previous and next nodes
        Finally, return the node’s data

Instructions
    1.
    Define a public .removeByData() method that takes a String data as a parameter and returns a Node. Inside it, create a nodeToRemove node. We don’t know what it is yet, so set it to null. Then return it.

    2.
    Before your return statement, create a currentNode node and set it equal to the list’s head. Then create a while loop that runs while currentNode isn’t null.

    Inside the loop, update currentNode to be its next node. This is how we will iterate through the list as we look for the matching node.
    (If you accidentally create an infinite loop and your code won’t stop running, you can reload the page to stop it.)

    3.
    Inside the while loop, but before you updated currentNode to be its next node, create an if statement that checks if currentNode‘s data matches the passed in data. If it does, that means we have found the matching node. Inside the if:
        Set nodeToRemove to currentNode
        break to leave the while loop, since we don’t need to keep looking through the list

    4.
    Outside your while loop, but before your return statement, check if nodeToRemove has no value. If so, that means there was no matching node in the list, so return null.