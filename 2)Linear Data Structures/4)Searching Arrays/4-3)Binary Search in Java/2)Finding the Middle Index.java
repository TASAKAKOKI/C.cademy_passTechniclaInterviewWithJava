Finding the Middle Index
    The binary search algorithm cuts the space of searching by half during each iteration. The key step in each binary search iteration is to find the middle value of the current search space and compare it against the value we’re searching for. The mid index is the average of the first and last indices of the current search space.

    Let’s use left and right variables to help us keep track of the first and last indices of where we are searching. Because of this, we start by setting the following first (left) and last (right) indices. Below, we show a pseudocode example of how to set these variables.
        function search (arr, target)
        left = 0
        right = length of arr
        . . .
    We could call a Java implementation of this method with the following code:
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        System.out.println(search(searchable, target));
    Because we pass in an array of length 11, the right variable is set to 11.

    Next, we calculate the middle index of the array. Note: The first mid value will always be the middle value of the original array.
        function search (arr, target)
        left = 0
        right = length of arr

        mid = the floor integer of (left + right) / 2
        . . .
    The above method will calculate the middle index of the array by calculating the average of left and right and rounding it to the floor integer. Given that left is zero and right is 11:
        floor((11 + 0)/2) = 5
    So, the first middle index the method checks is 5.

    Now you know how to calculate the first midpoint. In the next exercise, you will implement what happens when you compare the mid value to the target value.

Instructions
    1.
    At the bottom of search(), we added a line that returns -1. You will see in Exercise 4 that this line will only execute if the target value is not in the array.

    Create an int named left and set it equal to 0.

    Create an int named right and set it equal to the length of arr.

    2.
    Create an int variable called mid and set it equal to the floor integer of the average of left and right.

    Return mid. You should see 5 printed to the console.