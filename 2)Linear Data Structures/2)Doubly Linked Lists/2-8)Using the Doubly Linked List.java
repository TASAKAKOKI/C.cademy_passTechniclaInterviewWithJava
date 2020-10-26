Using the Doubly Linked List
    You finished your DoublyLinkedList class! Now we’re going to use that class to model a subway line. A doubly linked list is a great data structure to use to model a subway, as both have a first and last element, and are comprised of nodes (or stops) with links to the elements before and after them.

    We will add to and remove stops from our subway line, and print it out to see what we’ve done. The .printList() method is the same as the one from the LinkedList class and has been provided for you.

Instructions
    1.
    We’re going to model a (fictional) subway line that will travel from Central Park to the Brooklyn Bridge. In the .main() method create a new DoublyLinkedList instance named subway.

    2.
    The subway starts at Central Park and winds its way downtown. In the following order:
        add "Times Square" to the head of the list
        add "Grand Central" to the head of the list
        add "Central Park" to the head of the list
        Then print the list.

    3.
    The subway continues from Times Square down to the Brooklyn Bridge. In the following order:
        Add "Penn Station" to the tail of the list
        Add "Wall Street" to the tail of the list
        Add "Brooklyn Bridge" to the tail of the list
        Then print the list again.

    4.
    Oh no! There’s construction happening on the subway line and the Central Park and Brooklyn Bridge stops will temporarily be closed. Note where these stops are in the list and remove them without iterating through the entire list.
    Then print the list again.

    5.
    It turns out that the Times Square station is under construction as well. Remove it from the list, and then print the list for the last time.