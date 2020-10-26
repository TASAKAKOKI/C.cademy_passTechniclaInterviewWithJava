Checking the Middle Index
    In this exercise you will implement what happens in a single iteration of our binary search. In the next exercise, you will use a while loop to iteratively apply the same logic to an increasingly narrower search space.

    Let’s now add code to check whether the value at mid is equal to the target value. The pseudocode below shows the two additional steps that will check if the target value is found at the midValue.
        function search (arr, target)
        left = 0
        right = length of arr

        mid = the floor integer of (left + right) / 2

        midValue = value of arr at mid

        if midValue is the target
            return mid
    If the target value is found at midValue, we’re done with our search! So we’d want to return the mid index.

    Let’s add those two steps to the existing code.

Instructions
    1.
    Create an integer called midValue and set it equal to the array’s value at mid.

    2.
    Create an if statement that returns mid if midValue is equal to target.

    3.
    Change the target value in your main method to 28. If your solution to this part is implemented correctly, we should see 5 printed to the console.  