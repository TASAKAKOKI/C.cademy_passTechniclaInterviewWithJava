Parent and Child Elements
    Great work so far! Our MinHeap adds elements to its heap, keeps a running count of elements, and currently has a very simple .bubbleUp() method. Before we dive into maintaining the heap condition using .bubbleUp(), let’s review how heaps track elements.

    We use an ArrayList for storing elements, but we’re modeling heap behavior on a binary tree.

    "Child and parent elements are determined by their relative indices within the heap". By doing some arithmetic on an element’s index, we can determine the indices of its parent and child elements:
        Parent: index / 2 (rounded down)
        Left child: index * 2
        Right child: (index * 2) + 1

    We have provided three completed helper methods in MinHeap.java to access a value’s parent, left and right child indices respectively: getParent(), getLeft(), and getRight().

    Each method takes an index as its argument and returns the corresponding parent or child index, even if a child value does not exist at that index yet. getLeft() and getRight() use multiplication. getParent() uses Math.floor(), a division method in the Java Math library. Remember that the heap element at index 0 is null.

    If we look at the value 13 in the following array, we can find its parent by calling getParent(2). We can also find its left and right children with calls to getLeft(2) and getRight(2).
        System.out.println(myHeap.heap);
        // [null, 10, 13, 21, 61, 22, 23, 99]
        myHeap.getParent(2); // returns (2 / 2) = 1
        myHeap.getLeft(2); // returns (2 * 2) = 4
        myHeap.getRight(2); // returns (2 * 2) + 1 = 5
    Drawing out the tree structure of a heap can be very helpful for envisioning parent-child relationships!

Instructions
    1.
    In .main(), test out the three helper methods. A sample MinHeap is created for you and populated with integer values. Replace each null in the print statements with the correct way to access the index of the parent, left and right child of currentIndex.

    2.
    Uncomment the rest of the lines of code in .main(). Now we want to access the values of the parent, left and right child of currentValue. Replace each null in these new print statements with the correct way to do so for each.