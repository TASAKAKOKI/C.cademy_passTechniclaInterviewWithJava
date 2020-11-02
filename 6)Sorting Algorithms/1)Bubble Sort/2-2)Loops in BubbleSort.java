Loops In BubbleSort
    In this implementation of bubble sort, we will write a while loop that runs while swapping is necessary. We will "use a swapping boolean variable" to "help us determine whether the loop keeps going or stops". This is the skeleton of our code:
        swapping = true
        while swapping
            swapping = false
            for loop through elements
                if this element is greater than next element:
                    swap two elements
                    swapping = true
    
    The swapping variable stores the condition of the input array as a boolean value. If it’s:
        : true, our input array might still be unsorted and need additional swaps of elements. This triggers the loop to go another iteration.
        : false, we assume the input array does not need any more swapping to sort it.
    
    "swapping should be set to true first". This way, we’ll run the while loop at least once, since we need to loop through the input array at least one time to determine if it’s already sorted or not. In every iteration of this while loop, we’ll change swapping to false and the for loop code determines whether it needs to be changed back to true.

    For this exercise, we will focus on the loop structure.

Instructions
    1.
    To start sorting, we need to establish the swapping variable to store the condition of the input array as a boolean value. If it’s: true, our input array might still be unsorted and need additional swaps of elements false, the input array does not need anymore swapping to sort it.

    Since we assume the array is unsorted at the beginning, swapping should start as true.

    Add a boolean variable inside bubbleSort() called swapping and assign it the value true.

    2.
    Below the line where you declared swapping, create a while loop. This is the outer loop of our program that only runs if swapping is true.

    Set the loop’s condition as swapping.

    3.
    We don’t want the while loop to run forever – we never want that! We only want the loop to run if the array’s elements are unsorted. To ensure the loop only runs when necessary, we should automatically set swapping to false at the beginning of a loop’s iteration.

    swapping will change back to true if we find unsorted elements later, but if it remains false, that means we stop running our code and return the array.

    Inside of the while loop we created, set swapping to false. (In the next steps, we’ll add code that could change it to true.)

    4.
    Create a for loop nested inside the while loop under the line where you set swapping to false.

    The for loop should visit every element in the input array starting from the first element and stopping at the second-to-last element. Your loop variable i should increment through all the indices in arr except the last one. Setting the condition for the loop this way allows us to stay within the bounds of our input array and only check elements that exist.

    Leave the for loop body empty for now.

    5.
    Lastly, bubbleSort() should return the sorted input array, (we’ll do the actual sorting in a later exercise).

    Add code to return the sorted input array once we’ve exited our while loop.