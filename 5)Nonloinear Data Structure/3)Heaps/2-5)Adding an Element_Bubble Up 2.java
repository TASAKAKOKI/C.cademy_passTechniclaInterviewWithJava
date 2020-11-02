Bubble Up Pt 2
    Now that we understand how to determine the relationships between heap elements, we’re ready to finish .bubbleUp().

    In a min-heap, we need to ensure that every child is greater in value than its parent. Let’s discuss some situations that require adjustments to the order of elements in the heap in order to maintain this heap condition.

    We’ll step through some heap adjustments that should occur after an element is added. The () indicates the added element and the {} indicates that element’s parent. It can be especially helpful here to draw out the heap to see how the new element is added and then moved up.
        System.out.println(minHeap.heap);
        // [null, 10, 13, 21, 61, 22, 23, 99]
        minHeap.add(12);
        // [null, 10, 13, 21, {61}, 22, 23, 99, (12)]

    Oh no! This addition caused a violation to the heap condition: the new child 12 is less than its parent 61. To restore the heap, we will swap this parent-child pair.
        // before: [null, 10, 13, 21, {61}, 22, 23, 99, (12)]
        // SWAP 12 AND 61
        // after: [null, 10, {13}, 21, (12), 22, 23, 99, 61]

    The parent of 12 is now 13, but this still violates the heap condition. To fix this, we continue swapping parent-child pairs upwards through the tree.
        // before: [null, 10, {13}, 21, (12), 22, 23, 99, 61]
        // SWAP 12 AND 13
        // after: [null, {10}, (12), 21, 13, 22, 23, 99, 61]

    The parent of 12 is now 10 so the heap no longer violates the heap condition. Now each parent in the heap is less than its child.

    This strategy will be implemented in .bubbleUp() using the following steps:
        Start at the last element of the heap

        While the current index is valid (i.e. a parent element exists) AND that parent element is greater than the current element:
            1) SWAP the elements (“bubble up” the last element)
            2) Set the current element index to be the parent’s index

Instructions
    1.
    .bubbleUp() is called by .add(), so we’ll need to keep track of the added element. Inside .bubbleUp(), declare an int variable called current that stores the last index of this.heap, which is always the location of the added element. Do this in one line.

    2.
    In .bubbleUp(), set up a while loop that will run while BOTH of these conditions are met:
        : There is a valid current index, which is any index greater than 1. If current = 1, there is no valid parent.
        : The value at current is less than its parent’s value. This will violate the heap condition. Use a helper method to access the parent index. Use the operator <.
    
    Before clicking Run, set current = 0 within the loop. This will prevent an infinite loop. In the next step we’ll work on the full body of the while loop.

    3.
    Now let’s swap elements to restore the heap. Luckily, we’ve provided a .swap() method that does the grunt work. It accepts two indices and swaps the elements found at them. Inside the while loop:
        : Print the exact message: "Swap index " + current + " with index " + this.getParent(current).
        : Optionally, print the current contents of the heap.
        : Finally, make a call to .swap() passing in both the current and parent indices.
        : Delete the line current = 0.

    4.
    As you can see, the current heap still might not fulfill the heap condition. Because swapping elements can lead to a need for more swapping, we’ll need to update the current index to be its parent’s index as the last while loop step. This will allow us to progress up the min-heap via swaps.

    5.
    Take a look at the results of your hard work! You should find the minimum value at the root of the heap (index 1), even after adding increasingly smaller values. Here, the values are new and random each time you run your code; do so multiple times to see where swapping is necessary in different heaps.