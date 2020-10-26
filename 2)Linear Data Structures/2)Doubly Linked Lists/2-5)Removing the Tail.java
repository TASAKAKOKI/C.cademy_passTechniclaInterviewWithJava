Removing the Tail
    In addition to being able to add to the head of the list, a doubly linked list’s tail property allows us to add to the tail just as easily. In fact, like the .addToHead() and .addToTail() methods, the .removeTail() method will closely mirror the .removeHead() method:
        - Start by checking if there’s a current tail to the list.
        - If there isn’t, The list is empty, so there’s nothing to return, and the method ends
        - Otherwise, update the list’s tail to be the current tail’s previous node
        - If the updated tail is not null (meaning the list had more than one element when we started):
            Set the tail’s next node to null since there should be no node after the tail of the list
        - If the removed tail was also the head of the list (meaning there was only one element in the list):
            Call .removeHead() to make the necessary changes to the head of the list
        - Finally, return the old tail’s data

Instructions
    1.
    Define a public .removeTail() method that has no parameters and returns a String. For now, return null. We will edit this later.

    2.
    Above the return statement, create a removedTail node and set it equal to the list’s tail.
    Check if removedTail has no value. If so, that means the list is empty and there’s nothing to remove, so return null to end the method.

    3.
    Outside of your if, but above the final return statement, set the list’s tail to removedTail‘s previous node.
    If the tail isn’t null (meaning that the list isn’t now empty), set the tail’s next node to null, since the tail of the list shouldn’t have a next node.

    4.
    Still above the final return statement, check if removedTail is equal to the list’s head. If so, call the .removeHead() method.

    5.
    Finally, change the return statement to return removedTail‘s data.