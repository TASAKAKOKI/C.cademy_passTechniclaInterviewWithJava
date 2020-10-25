Printing
    Nice! Now we have a bunch of helpful LinkedList methods under our belt. Our next step is to create a .printList() method so we can see our list as it changes.

    Our .printList() method is going to create a String that holds the data from every node in the list. We’ll start at the list’s head and iterate through the list, adding to our String as we go.

    For example, if we had a list for the days of the week, starting with Sunday, .printList() would print it as follows:

    <head> Sunday Monday Tuesday Wednesday Thursday Friday Saturday <tail>
    
Instructions
    1.
    Define a .printList() method that takes no arguments. It should be accessible outside of the class and return a String.
    Inside it, create a String variable named output equal to the String "<head> ". Then return output. This will be useful in telling us which end of the list is the head and which is the tail.

    2.
    Above the return statement, create a currentNode node and set it equal to the list’s head.

    3.
    While currentNode doesn’t equal null,

    Add currentNode’s data and a " " (space) to output
    Set currentNode to its next Node
    If you get stuck in an infinite loop, you can refresh the page to stop it.

    4.
    Outside of the while loop, but before your return statement, add "<tail>" to output. Then print output.