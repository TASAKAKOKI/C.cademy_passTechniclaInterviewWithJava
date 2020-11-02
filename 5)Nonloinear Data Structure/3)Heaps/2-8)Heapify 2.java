Heapify Pt 2
    With .bubbleUp(), we were comparing our element with its parent at each step. With .heapify(), we potentially have two elements to compare our element to: the left child and the right child.

    You might be wondering: which should we choose? Let’s think through it with an example. Let’s stick with our min-heap from before:
        // [null, (99), [21], [13], 61, 22, 23]
        // Should we swap 99 with its left child [21] or right child [13]?

    In a min-heap, we want our .heapify() method to swap the parent with the smaller of the two children so the smaller value is in the parent position. This leads to the minimum value being at the top of the heap, which maintains the heap condition!

Instructions
    1.
    Our first step before swapping is checking that our current element has children. This must be the case in order to swap! Within the heapify while loop, check that leftChild and rightChild both exist using the helper method, .exists(), which verifies the existence of an element at a specified index. Keep the variable reassignment lines in the while loop after the if statement.

    2.
    If both children exist, we will swap with just the smaller of the two. Inside your if statement, compare the left child’s value with the right:
        : If left child value < right child value: swap current element with the left child AND then update current to be the left child index
        : Otherwise: swap current element with the right child AND then update current to be the right child index
    Create your conditional statements in this order. Also, remember that our variables leftChild and rightChild are the indices not the values!

    TIP: Running your code might cause an infinite while loop if your if and else statements or their content are not correct. Just refresh the page to stop the loop and try again.

    3.
    It is possible for just one child to exist. In this case it will always be the left one based on the possible structures of a binary tree. Write an else branch lining up with the outer if statement that:
        : Swaps the current element with the left child
        : Then updates current to be left child index
    The reassignment of leftChild and rightChild which was done in the last exercise should occur within the while loop, but after all of the conditional branches.

    Delete the initial reassignment line current = leftChild since we’ve now properly reassigned current in other places.

    TIP: Running your code might cause an infinite while loop if your else statement is incorrect.

    4.
    We want to heapify when we encounter a parent that is larger than a child; this happens in .popMin(). Before returning min, make a call to .heapify().

    5.
    In .main(), there is code that removes minimum values from a heap multiple times and thus calls .heapify() multiple times. Study the output to further understand the adjustments made to the heap with .heapify().