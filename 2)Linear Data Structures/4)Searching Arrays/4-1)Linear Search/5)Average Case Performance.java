Average Case Performance
    If this search was used 1000 times on 1000 different lists, some of them would be the best case, some the worst. For most searches, it would be somewhere in between.

    On average it would be in the middle of the list, that search would take O(N/2) time. Let’s prove this.

    Each element of the list on the right requires a different number of comparisons to be located in a list. Using linear search, the first element is located with one comparison, the second element is located with two comparisons, and so on until the last element is located in N, the size of the list, comparisons.

    The average case performance is the average number of comparisons. To calculate this, you use this formula:
        sum of # of comparisons for each element /
            # of each elements in the list
    We won’t show the math, but we can simplify things by reducing the equation to:
        n /
        2
    We would expect on average for the linear search algorithm to search halfway through the list. Therefore the time complexity for linear search in its average case is O(N/2).

    Based on Big O simplification rules, which you can learn about in the Big O lesson, we simplify the time complexity in this case to O(N).