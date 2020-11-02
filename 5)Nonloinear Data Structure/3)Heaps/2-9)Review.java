Heaps Review
    Great work! You’ve now implemented a min-heap in Java and understand the core concepts of heaps.

    In summary:
        :: "Min-heaps" created using the MinHeap class'' 'track the minimum element by storing it in index 1 of an ArrayList'.
        When adding elements, we call ".bubbleUp()" to 'compare the new element with its parent, making swaps if it violates the heap condition' (min-heap children MUST be greater than their parents!)
        :: When removing the minimum element, we 'swap it with the last element in the heap'. Then we use ".heapify()" to 'compare the new root value with its children, swapping with its smaller child if necessary down the heap'.
        :: Min-heaps are useful because they are "efficient in maintaining the heap condition and keeping track of the minimum element in a dataset".

    Think about this concept: building a heap using an ArrayList of elements that only decrease in value would lead to continual violations of the heap condition. Seems like this might take a lot of swaps to restore the heap…let’s figure out how many!

Instructions
    1.
    Run the code in MinHeap.java to see how many swaps are made in a dataset of 10,000 elements! We added some print statements and counts to keep track of the number of swaps in .bubbleUp() and .heapify(). We logged a message in .bubbleUp() when heap size reached 10,000 and logged another message in .heapify() when size reached 9999. It takes 10,000 calls to .add() and therefore .bubbleUp() as well to reach a heap size of 10,000. It takes only one call to .popMin() and therefore .heapify() as well to decrement the heap size by one.

    Breaking it down, the number of swaps in a heap can be at MOST the height of the binary tree representing its structure. If a new minimum value is added to the heap, it travels up (bubbles up) the height of the heap to reach the root index. Here’s some quick math for you:
        The relationship between the maximum number of nodes, N, of a binary tree and its height, h, is:
            N = 2^{h+1} - 1 
            // here -1 refer to the 0th index, which is null.
    
        For a height of 13, the maximum number of nodes is:
            2^{14} - 1 = 16383 
    
        For a height of 12, the maximum number of nodes is:
            2^{13} - 1 = 8191 

        Since the value 10,000 falls between these two node counts, the number of swaps for our heap can be at most 13!