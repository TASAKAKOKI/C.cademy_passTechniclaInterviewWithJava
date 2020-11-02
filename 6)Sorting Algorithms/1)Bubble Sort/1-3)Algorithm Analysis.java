Algorithm Analysis
    Given a moderately unsorted data-set, bubble sort requires multiple passes through the input before producing a sorted list. "Each pass through the list will place the next largest value in its proper place."

    We are "performing n-1 comparisons for our inner loop". Then, we "must go through the list n times in order to ensure that each item in our list has been placed in its proper order".

    The n signifies the number of elements in the list. In a worst case scenario, the inner loop does n-1 comparisons for each n element in the list.

    Therefore we calculate the algorithm’s efficiency as:
        O(n(n-1)) = O(n(n)) = O(n^2)
        
    The diagram analyzes the pseudocode implementation of bubble sort to show how we draw this conclusion.

    When calculating the run-time efficiency of an algorithm, we drop the constant (-1), which simplifies our inner loop comparisons to n.

    This is how we arrive at the algorithm’s runtime: O(n^2).

Instructions
    What input to bubble sort would produce the worst possible runtime?