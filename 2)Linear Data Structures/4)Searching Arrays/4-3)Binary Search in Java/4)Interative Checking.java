Iterative Checking
    At this point, you have a method that checks the middle index of an input array and returns the mid index if the value equals target. What do we do when the middle value is not equal to the target? Because the input array is sorted, we can determine whether the target is greater or less than the middle value. After determining whether it the target is greater or less than the mid-value, we can define whether we limit our search to the left half or the right half of the input array.

    Remember back to our algorithm. Based on the comparison of the target against the mid value, we adjust where the left and right indices are at the next iteration:
        -If the middle value is equal to the value, then we return the middle index.
        -If the middle value is less than the target value, then we should look at the right side of the search space. We do this by updating the left index before the next iteration.
        -If the middle value is greater than the target value, then we should look at the left side of the search space. We do this by updating the right index before the next iteration.
    The method continues to execute until the left and right indices converge or the target is found. we can implement this with a while loop.
        while right is greater than left
            mid = the floor integer of (left + right) / 2 
            midValue = value of arr at mid

            if midValue is the target
                then return mid
            if target is greater than midValue
                then set left to mid + 1
            else
                set right to mid

    In the checkpoints below, you will add the while loop structure and the conditions that change the left or right index based on whether midValue is greater than or less than target. With each iteration, the distance from left to right will halve.

Instructions
    1.
    WARNING: Refresh the page if you create an infinite loop while implementing the solution.

    Add a condition to the while loop so it continues to execute until right is greater than left.

    2.
    Add else if and else blocks that set new values to left or right based on a comparison of target and midValue. Look back at the pseudocode in the narrative to help you complete this checkpoint.

    3.
    Change target, at the bottom of BinarySearch.java to another value in the searchable array to see if your loop returns the correct index.