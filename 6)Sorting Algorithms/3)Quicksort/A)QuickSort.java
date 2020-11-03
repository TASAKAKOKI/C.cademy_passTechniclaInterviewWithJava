Quicksort: Java
        This interactive article will cover a Java implementation of the Quicksort algorithm.

Overview
    Quicksort is a "sorting algorithm that is based on the divide-and-conquer strategy". That means like MergeSort, "the input array is partitioned into smaller parts to be rearranged". Unlike the approach in MergeSort, where we created new arrays at each division, "we will do all the sorting in-place" – meaning we are "going to refer to sub-arrays by starting and ending indices of the original array". This saves space!

    This article walks through the implementation of the Quicksort algorithm in Java. The parts we will cover are:
        1) "Writing the partition process", which takes the given part of the array "bounded by a left and right pointer", and "swaps elements" to the correct side of a pivot element. The process also "returns the partition point for the next recursive calls" of Quicksort.
        
        2) "Setting up the condition for the base case and recursive step" of Quicksort.
        
        3) "Writing the recursive Quicksort calls on both" the left side and right side of the partition.
    
        4) "Running our implementation" with helpful print statements

Partitioning
    Partitioning is the "meat of the Quicksort algorithm". It’s here that we "compare the elements and swap them". We will write this as its own ".partition() method" that "takes the original array, a left pointer (index), and a right pointer (index)". In the first call to .partition(), leftPointer will be 0 and rightPointer will be arr.length - 1.
        public int partition (int[] arr, int leftPointer, int rightPointer) }

        }

    At the beginning of the function, we should "choose an element of the array as our pivot element". Common choices in Quicksort implementations are:
        : the first element (element at leftPointer): last element (at rightPointer)
        : middle element (at the average of leftPointer and rightPointer).
    
    We’ll go with the middle element in our partition() implementation.

    The "goal" is to have all "elements less than the pivot element on the left side" of it (not necessarily sorted), and "elements greater than it be on the right side". "leftPointer and rightPointer step in opposite directions to compare each element to the pivot element". If there are elements on the wrong side of the pivot, we should swap those elements.

    Let’s walk through how the .partition() function should run on a given array.

  -Walk-through of Partition
    Let’s use this array to demonstrate:
        [ 39, 15, 24, 35, 76, 19 ]
    
    Note: We will use L to indicate where the leftPointer is, R to indicate rightPointer, and P to indicate the pivot element, which is the value of the middle element at the beginning of partition().

    At the start, arr[leftPointer] as indicated by L is 39, arr[rightPointer] as indicated by R is 19, and the pivot middle element P is 24.
        [ 39, 15, 24, 35, 76, 19 ]
          L        P           R
    
    Let’s compare L with the pivot element. As long as L is less than the pivot, meaning that it is on the correct side of the pivot, we want to move the L forward one step to the right. Here, L does not increment because it is greater than the pivot. This will be the element involved in the first swap.
        39 > 24. That means we want it on the other side of the pivot. L stays
        [ 39, 15, 24, 35, 76, 19 ]
          L       P           R

    Now let’s do the same with R and the pivot. We are moving R to the left as long as the current element is greater than the pivot element.
        R also stays the same since 19 < 24. Both L and R pointers are paused, ready for the elements to be swapped.
        [ 39, 15, 24, 35, 76, 19 ]
          L        P           R

    We should "swap the elements at L and R". Note: in some instances, either the left or right pointer might pause at the pivot element. The pivot element’s position can be swapped with another element, but the pivot value will stay the same.
        [ 19, 15, 24, 35, 76, 39 ]
          L        P          R

    The "while loop should start again". L increments while the element is less than the pivot. R decrements while the element is greater than the pivot. The pointers are paused here.
        [ 19, 15, 24, 35, 76, 39 ]
                   L
                   P
                   R

    "If the left index is now equal to the right index", the "while loop ends". We "return the left index L as the partition point". Note that the partition point returned will only sometimes equal the index of the pivot element.

    We illustrated step-by-step what should happen during the partition process, so we can interpret the steps into pseudocode below. Make sure to read through it carefully and go through the example above again.
        int partition (int[] arr, int leftPointer, int rightPointer) {
            Pivot = value of arr at (average of leftPointer and rightPointer, rounded down)
            While leftPointer and rightPointer don''t meet (i.e. the pointers haven''t hit all the elements yet)
                Increment leftPointer until element pointed to is > pivot
                Decrement rightPointer until element pointed to is < pivot
                If leftPointer less than rightPointer:
                   Swap elements at leftPointer and rightPointer
            return leftPointer as the partition point
        }
    Note that we already have a swap() function from previous sorting lessons.

    Fill in the blanks of the partition() function to complete it below!
        public int partition(int[] arr, int leftPointer, int rightPointer) {
            int pivot = arr[Math.floorDiv((leftPointer + rightPointer), 2)];
        
            while (leftPointer < rightPointer) {
                while (arr[leftPointer] < pivot) {
                    leftPointer++;
                }
                while (arr[rightPointer] > pivot) {
                    rightPointer--;
                }
                if (leftPointer < rightPointer) {
                    swap(arr, leftPointer, rightPointer);
                }
            }
            return leftPointer;
        }

Recursive Quicksort
    Now that we’ve taken care of the part of the algorithm that rearranges elements and calculates a partition point, we need to structure the divide-and-conquer recursive part around that.

    First, we’ll "set up the quickSort() method to take in the whole array, the start index of the current subarray, and the end index of the current subarray". Again, we do this instead of creating placeholder arrays for all the partitioned subarrays.
        public int[] quickSort(int[] arr, int start, int end) {

        }

    Like all recursive methods, we "need to establish a base case and a recursive step". The base case is straightforward for sorting algorithms,
        : if the length of the input array is less than or equal to 1, we should just return the array.
        : The recursive step should execute if the input array length is greater than or equal to 1, or if end > start.

    We can format the overarching conditional in quickSort() like this:
        public int[] quickSort(int[] arr, int start, int end) {
            if (end > start) {
                // Call partition
                // Recursive code on two sides of partition
            }
            return arr; // Base case code
        }

    Now let’s work on the recursive step. Recall the partition() array example we walked through from above. The partition point that was returned
        [ 19, 15, 24, 35, 76, 39 ]
                   ^
    was index 2, which is 24.

    That means the array can then be divided into a left partition of the array from index 0 to 2 (up to, and including the partition point), and right partition of the array from index 3 up to the end.
        [ 19, 15, 24 ] [ 35, 76, 39 ]
         start   end    start    end
    
    Those two parts of the original array should be quick sorted recursively, and only if the lengths of each are greater than 1. We should enter in the correct indices of the original array as arguments for the recursive calls on quickSort(). Let’s pseudocode this:
        public int[] quickSort(int[] arr, int start, int end) {
            if (end > start) {
                int partition = partition(arr, start, end);
                // If there is more than one element on left side, quicksort on all the elements from start up to the partition point
                // If there is more than one element on right side, quicksort on all the elements between partition point + 1 and end
            }
            return arr; // Base case code
        }

    Fill in the code below to complete quickSort()!
        public int[] quickSort(int[] arr, int start, int end) {
            if (end > start) {
                int partition = partition(arr, start, end);
                // recurse on left partition
                if (start < partition) {
                quickSort(arr, start, partition);
                }
                // recurse on right partition
                if (partition + 1 < end) {
                quickSort(arr, partition + 1, end);
                }
            }
            return arr;
        }

Adding Print Statements To Test Our Implementation
    Now that we have all the parts implemented, we want to review what exactly our code is doing. Print statements at the following places in the code can help us:
        : Print the current array (or subarray) that is being partitioned, at the beginning of partition().
        : Print the pivot element at the beginning of partition()
        : Print which elements are swapped, immediately after swapping
        : Even print whenever left and right pointers are being updated!
    
    The workspace in "A0)QuickSort.java" file includes the quickSort() and partition() functions we worked on above, plus an additional quickSort() method that takes in just an array as a parameter, and a main method. Follow the suggestions to activate the print statements!

Review
    Congratulations on making it to the end of this article on the Java implementation of QuickSort! It’s a tricky sorting algorithm to implement, and there are many variations. Let’s review what we did:
        : We wrote a "partition() function" that 'uses the middle element as the pivot'. 'Left and right pointers' 'walk in opposite directions down the array to swap elements around the pivot element'. Everything to the left of the pivot is less than or equal to, and everything to the right of the pivot is greater or equal to. We 'return the partition point'.

        : We wrote the "quickSort() method" that used the partition point from partition() to break the current part of the array into two. We called quickSort() recursively on each half if they are greater than length 1.
    
        : When the lengths of both partitioned halves are less than or equal to 1, we return the sorted result!
        
    At its core, QuickSort is another divide-and-conquer algorithm. What sets it apart is the special partitioning logic. In the last workspace, try out some other example integer arrays to sort. Notice the differences in the number of loops partitioning requires and the depths of recursion between different examples. If you need to, review the conceptual lesson on QuickSort, particularly the bits that describe how the performance of the algorithm averages out with respect to different inputs.

    The more time you spend with sorting algorithms, the more you understand how small tweaks affect performance!