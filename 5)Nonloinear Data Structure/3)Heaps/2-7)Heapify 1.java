Heapify Pt 1
    We’ve retrieved the minimum element but left our min-heap in disarray. Don’t be discouraged! We’ll be able to get our heap back in shape shortly.

    To do this, we’ll define a new method, .heapify(), which performs a similar role to .bubbleUp(), except now we’re shifting elements down the tree instead of up.

    We have provided a helper method, .canSwap(), which returns true if swapping should occur between a parent and either of its children. It returns false if this isn’t the case. Remember that with a binary tree, a parent can have either a left child or two children, but not just a right child.
        public boolean canSwap(int current, int leftChild, int rightChild) {
            // if leftChild exists AND is less than its parent → return true
            // OR
            // if rightChild exists AND is less than its parent → return true
        }

    We want to swap a parent with one of its children if the parent value is larger than a child value. This violation occurs after the minimum element is removed using .popMin():
        // before: [null, (10), 21, 13, 61, 22, 23, (99)]
        minHeap.popMin(); 
        // step 1 of popMin(): SWAP min with last
        // [null, (99), 21, 13, 61, 22, 23, (10)]
        // step 2 of popMin(): remove min
        // [null, (99), [21], [13], 61, 22, 23] 99 VIOLATES heap condition. Its children [21] and [13] are less than 99

    Let’s start implementing a fix for this situation!

Instructions
    1.
    Define a private method below .bubbleUp() called .heapify() that does not return anything and does not have any parameters.

    2.
    The heapify action will always start at the root index which SHOULD point to the minimum element, but currently doesn’t (right now it points to 99). Declare a variable current that holds the root index.

    3.
    Soon we are going to use .canSwap() as we traverse elements in our heap. This method takes 3 index arguments: current, leftChild, rightChild. Declare two more int variables in .heapify() called leftChild and rightChild that we’ll pass into .canSwap() soon.

    4.
    Write a while loop in .heapify() that loops while a swap can be made between a parent (current) and one of its children. Use .canSwap() to verify this. Check out the .canSwap() method in the MinHeap class to see its arguments.

    Within the body of the while loop, we need to update current, leftChild and rightChild to avoid an infinite loop. For now, assign current to leftChild, and then assign leftChild and rightChild to their respective indices in relation to current.

    In the next exercise, we will continue to fill in the while loop to restore the heap fully.