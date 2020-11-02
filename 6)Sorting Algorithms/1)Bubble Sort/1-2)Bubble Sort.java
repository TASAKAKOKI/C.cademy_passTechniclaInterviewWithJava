Bubble Sort
    As mentioned, the bubble sort algorithm swaps elements if the element on the left is larger than the one on the right.

    How does this algorithm swap these elements in practice?

    Let’s say we have the two values stored at the following indices index_1 and index_2. How would we swap these two elements within the list?

    It is tempting to write code like:
        list[index_1] = list[index_2]
        list[index_2] = list[index_1]

    However, if we do this, we lose the original value at index_1. The element gets replaced by the value at index_2. Both indices end up with the value at index_2.

    Programming languages have different ways of avoiding this issue. In some languages, "we create a temporary variable which holds one element during the swap":
        temp = list[index_1]
        list[index_1] = list[index_2]
        list[index_2] = temp 

    Other languages provide multiple assignment which removes the need for a temporary variable.
        list[index_1], list[index_2] = list[index_2], list[index_1]

Instructions
    In the examples we’ve shown, does bubble sort modify the original list or produce a new array?