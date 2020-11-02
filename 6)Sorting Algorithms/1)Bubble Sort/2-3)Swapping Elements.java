Swapping Elements
    An "essential part of bubble sort" is the "“swapping” of pairs of unsorted elements".

    We want to write a handy function called swap() that we can use in our sorting loop. It should swap two elements in an array directly. This swapping can be used in other sorting algorithms, so we’ll write this function in a separate file for all algorithms to access by importing.

    Let’s discuss "how to swap elements in an array without making a copy of the array". To swap pairs of elements, we’ll need to store one of the values at either index in a temporary variable so we can use it later. For example, doing something like this:
        currentValue = nextValue;
        nextValue = currentValue;

    would not work because we’d “lose” one of the values. The original value of currentValue would be overwritten and there would be no reference to it. "Using the temporary variable" strategy seen in the GIF above avoids the loss of any of the values whose position we need to exchange.

    We’ll use this strategy to build out swap().

Instructions
    1.
    Look at the swap() function. Notice that swap() takes 3 arguments: arr the input array, indexOne, the index of the current element, and 'finally', indexTwo, the index of the next element in the input array.

    In the function, create an int variable called temp and store the value of the element at the indexTwo position in the input array so it can be referenced later.

    2.
    Change the value at indexTwo of the input array to the value of the element at indexOne.

    3.
    Set the element at indexOne of the array to the original value of the element at indexTwo by referring to the temp variable we created earlier (the element at indexTwo is no longer the same after the previous step).

    4.
    In the main() method, let’s test out the swap function. Check out the array called example. Call swap() so that the elements 20 and 14 are in order.

    5.
    Add a print statement in the main method right after the swap() call.

    To print the whole array as a string, we can import java.util.Arrays; up top.

    The print statement can then use Arrays.toString(arrayName).