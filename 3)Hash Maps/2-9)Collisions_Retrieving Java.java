Collisions: Retrieving Java
    When we retrieve hash map values we also need to be aware that different keys could point to the same array index leading us to retrieve the wrong value.

    To avoid this, we’ll search through the linked list at an index until we find a node with a matching key. If we find the node with the correct key, we’ll return the value otherwise we’ll return null.

    The .retrieve() method will follow this logic:
        store the hashed key in the variable arrayIndex
        store the head node of a list in the constant current

        while current isn''t null
            if the current node''s key matches the key
                return the current node''s value
            set current to the next node in the list

        return null

Instructions
    1.
    In the .retrieve() method, declare a Node, current. Assign it the head node of the linked list at arrayIndex to current. Our method expects a String type to be returned. For now, return an empty string:
        return "";
    We will search for the value we want to retrieve by checking each node in the linked list, starting at the head node.

    2.
    Create a while loop that we’ll use to iterate over each node in the linked list until we either find the value we’re looking for or reach the end of the list.

    Set the while condition to check that the current node of the linked list is not null.

    3.
    Inside of the while loop add an if statement that checks if the key we received as an argument and the key of the current node are the same.

    If both keys are the same, this means we’ve found the node with the correct value. Return the value stored in the current node.

    4.
    If the keys don’t match, we need to check the next node in the linked list. While still in the while loop but after the if statement, set current to the next node in the linked list.

    5.
    If we’ve looped through the entire linked list without finding the value we want to retrieve, it means the value is not stored in the hash map. After the while loop, return null instead of the empty string.