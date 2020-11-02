Bubble Sort Review
    Excellent work! We’ve successfully implemented the Bubble Sort algorithm that takes an array of integers and sorts them from smallest to largest. Let’s walk through what we actually coded.

    In the bubbleSort() method, we have a while loop that runs the swapping logic until the array is fully sorted. Inside the while loop, we have a for loop that iterates through the array and checks whether adjacent elements are out of order. If so, we swap the first instance of two adjacent elements that are out of order. The swapping is done using a helper function. If we swapped, we signal to the while loop that we may need another look through the array, so the loop runs once again. The loop stops running after there are no two adjacent elements that are out of order.

    Great job! Let’s try out our Bubble Sort algorithm with some examples.

Instructions
    1.
    Test your work in the main method by calling bubbleSort() on the arrays count_backwards and count_forwards right under the respective comments. Run the code.

    2.
    Notice how your implementation of bubble sort handles swapping elements in these two arrays. Do the number of swaps differ between the two arrays? Why would that be?

    3.
    What real-life examples of bubble sort can you come up with?

    4.
    Can you think of an input array that would result in a O(n^2) runtime? What input array would result in a O(n) runtime?