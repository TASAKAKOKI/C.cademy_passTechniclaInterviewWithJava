Introduction to Heaps
    A heap data structure is described as a "specialized tree data structure that satisfies the heap condition":
        : In a max-heap, for any given element, its parent’s value is greater than or equal to its own value.
        : In a min-heap, for any given element, its parent’s value is less than or equal to its value.

    Heaps are "described as binary trees" because 'each parent node in a heap has at most two child nodes'. Although this is the case, heaps are most commonly "represented with an ArrayList" in Java since this data structure is much easier to implement than a full Tree class. Min-heaps efficiently keep track of the minimum value in a dataset, even as we add and remove elements. We will keep track of integer values in our heap and will store the minimum value at the root, or top, of the heap.

    "Heaps in general enable solutions for complex problems such as <finding the shortest path (Dijkstra’s algorithm)> or <efficiently sorting a dataset (heapsort)>".

    They’re an essential tool for confidently navigating some of the difficult questions posed in a technical interview. By understanding the operations of a heap, you will have made a valuable addition to your problem-solving toolkit!

Instructions
    1.
    The code in Script.java creates a min-heap one element at a time from a random collection of numbers. You’ll see that each version of the ArrayList that is printed out isn’t necessarily sorted. This is because the ArrayList is actually representing a binary tree. We will dive into how this representation works soon.

    Notice that when we take items out of the min-heap, the smallest item is removed from the top, or root, of the min-heap each time. For simplicity’s sake, our implementation will store null as the first element of the ArrayList. This all happens using the completed MinHeap class found in MinHeap.java.

    Run Script.java to see the effects of adding and removing items in the min-heap.

    Move on to the next exercise when you’re ready to begin implementing the MinHeap class yourself!