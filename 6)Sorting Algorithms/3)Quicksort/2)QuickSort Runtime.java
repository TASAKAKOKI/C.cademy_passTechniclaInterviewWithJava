Quicksort Runtime
    The "key to Quicksort’s runtime efficiency" is the "division of the array". The array is "partitioned according to comparisons with the pivot element", so "which pivot is the optimal choice to produce sub-arrays of roughly equal length"?

    The graphic displays two data sets which always use the first element as the pivot. Notice how many more steps are required when the quicksort algorithm is run on an already sorted input. The partition step of the algorithm hardly divides the array at all!

    The "worst case" occurs "when we have an imbalanced partition like when the first element is continually chosen in a sorted data-set".

    One popular "strategy is to select a random element as the pivot for each step". The benefit is that no particular data set can be chosen ahead of time to make the algorithm perform poorly.

    Another popular "strategy is to take the first, middle, and last elements of the array and choose the median element as the pivot". The benefit is that the division of the 'array tends to be more uniform'.

    Quicksort is an unusual algorithm in that the "worst case runtime is O(N^2)", but the "average case is O(N * logN)".

    We typically only discuss the worst case when talking about an algorithm’s runtime, but "for Quicksort" it’s so uncommon that "we generally refer to it as O(N * logN)".

Instructions
    With an already sorted dataset, would the division improve if we always chose the last element as the pivot? Why or why not?