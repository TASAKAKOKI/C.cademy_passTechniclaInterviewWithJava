Removing the Head
    Due to the added tail property, removing the head of the list in a doubly linked list is a little more complicated than doing so in a singly linked list:
        - Start by checking if there’s a current head to the list.
        - If there isn’t, the list is empty, so there’s nothing to return, and the method ends
        - Otherwise, update the list’s head to be the current head’s next node
        - If the updated head is not null (meaning the list had more than one element when we started):
            Set the head’s previous node to null since there should be no node before the head of the list
        - If the removed head was also the tail of the list (meaning there was only one element in the list):
            Call .removeTail() to make the necessary changes to the tail of the list. (We will create this method in the next exercise!)
        - Finally, return the removed head’s data

Instructions
    1.
    Define a public .removeHead() method that takes no parameters and returns a String. For now, return null. We will edit this later.

    2.
    Above the return statement, create a removedHead node and set it equal to the list’s head.
    Check if removedHead has no value. If so, that means there’s nothing to remove, so return null to end the method.

    3.
    Outside of your if, but above the final return statement, set the list’s head to removedHead‘s next node.
    If the updated head isn’t null (meaning that we hadn’t removed the only element in the list), set the head’s previous node to null, since the head of the list shouldn’t have a previous node.

    4.
    Still above the final return statement, check if removedHead is equal to the list’s tail. If so, call the .removeTail() method. We will create this in the next exercise, so comment the method call out for now.

    5.
    Finally, change the return statement to return removedHead‘s data.