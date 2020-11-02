Introduction
    The bubble sort algorithm "takes an array of elements" and "reorders the elements of the input from smallest to largest". To achieve this, bubble sort works "by comparing a pair of neighboring elements" and "swapping their positions in the array" so that the larger of the two elements is always on the right. Doing this continuously results in the largest element “bubbling” up to the end of the array, giving this sort its name. The algorithm only stops when there are no more values that need to be swapped.

    Below is a quick pseudocode example of what we will create in this lesson:
        while array is not sorted
            for each value in array
                if current value > next value
                    swap current value and next value
        return array
        
    Bubble sort is "not the most efficient sorting algorithm". Bubble sort’s "worst-case runtime is O(n^2)". This is because we have to compare the current element we are looking at to each element in the array after it and repeat this check for every single element in the array. Its "best-case runtime is O(n)" for an already-sorted array.

    Let’s get started on our Java implementation of this algorithm!