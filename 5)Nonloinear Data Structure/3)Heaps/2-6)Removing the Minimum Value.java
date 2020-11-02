Removing the Minimum Value
    With .bubbleUp() implemented, we can now add any number to our min-heap and make proper adjustments to maintain the heap condition.

    We’ve gone through a lot of work to maintain the minimum value at index 1 so let’s figure out how to access it! Our goal here will be to remove this element in the most efficient way, using a method we’ll write called ".popMin()".

    Due to the delicate balance of parent-child relationships in a min-heap, we would ruin our heap by directly removing the minimum element. This action would leave children with no parent, which is not an acceptable heap layout.
        System.out.println(minHeap.heap);
        // [null, 10, 21, 13, 61, 22, 23, 99]
        minHeap.popMin(); // returns 10
        // [null, ???, 21, 13, 61, 22, 23, 99]

    Therefore, we must remove an element with no children. The last element is guaranteed not to have children due to its location. "If we swap the root element with the last one, we can easily remove the minimum from the end of the ArrayList since it won’t have any children post-swap"!
        // before: [null, (10), 21, 13, 61, 22, 23, (99)]
        minHeap.popMin();
        // step 1 of popMin(): SWAP min with last
        // [null, (99), 21, 13, 61, 22, 23, (10)]
        // step 2 of popMin(): remove min/last
        // [null, 99, 21, 13, 61, 22, 23]
        // 10

    Great! With this method, we’ve removed the minimum element with little disruption. However, if you look closely, this new heap has a problem – can you see what it is?

    SPOILER: 99 is located at the root, where the minimum element should be. We’ll fix this in future exercises!

Instructions
    1.
    We’ve provided the .popMin() method and a default return value of 0. Check if our heap is empty within this method. If it is, throw an error with the message "Heap is empty!". Keep the return statement outside the if statement.

    2.
    Next, if the heap is not empty, swap the minimum element with the last one using .swap().

    3.
    Next, remove the last element from the heap and store it in a variable called min. AFTER this, decrement the heap size to reflect this adjustment. Finally, replace return 0 with a statement returning min inside .popMin().

    4.
    Print these messages in .popMin():
        1. Before the swap: "Swap min element " + this.heap.get(1) + " and last element " + this.heap.get(this.size)
        2. After the swap: "Removed from the heap: " + min
        3. Lastly: the heap contents
        
    Now you should see when each swap takes place, what values were removed, and the adjusted heap over time.