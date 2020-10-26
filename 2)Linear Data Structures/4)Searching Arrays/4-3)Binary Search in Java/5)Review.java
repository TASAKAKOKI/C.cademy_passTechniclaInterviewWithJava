Review
    In this lesson, you learned how to implement an iterative binary search solution. The method returns the index of the target value from a sorted list. If the target value is not found, the method returns -1. You used the following steps to create this method:

        Initialize the left and right indices as 0 and the length of the array.
        Create a while loop that continues to execute until the left index equals the right index.
        Get the value at the index that falls in the middle of left and right.
        Return the index if the mid-value is equal to target.
        Set left equal to the current index plus one if the target is greater than the value.
        Set right equal to the current index minus one if the target is less than the value.
    The benefits of binary search are significant compared to linear search on a sorted array, because it does not need to check every element to determine whether a target value is in an array. However, this logic only works on a sorted list!