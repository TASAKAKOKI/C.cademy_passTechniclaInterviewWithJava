Comparing Elements
    Let’s pick back up in the main Bubble Sort code. To review, here’s the skeleton we’re aiming for:
        swapping = true
        while swapping
            swapping = false
            for loop through elements
                if this element is greater than next element:
                    swap two elements
                    swapping = true
                    
    So far, we have the while loop to run our algorithm, and another loop inside that visits each element in the input array. But if we were to run this as is, it would only iterate through the array once, and nothing would happen inside the loop. This is because swapping is never changed back to true, and we need to put some code in that for loop.

    Let’s add some additional logic to our code in the BubbleSort.java file that will compare neighboring elements and swap them if necessary. For this exercise, you’ll be adding code inside the for loop of bubbleSort().

Instructions
    1.
    Inside of the for loop we added, create an if conditional that checks if the element at the current index is greater than the element one index after it.

    2.
    If that condition is true, we want to swap this current element with the one one index after it. Let’s print ourselves a message to see how we’re changing our input array by swapping elements, add the following inside of the if conditional:
        System.out.println(String.format("Swapping pair %d, %d", input[i], input[i+1]));
    
    This code will print a message for every swap made during the algorithm.

    3.
    If the statement is true, swap the two elements. After our print statement, add a call to Swap.swap(), the helper function that handles changing the position of pairs of elements. If you need a reminder, take a look at the parameters of swap() in the Swap.java file to see what arguments you need to call it with.

    4.
    Let’s add another print statement after the swap operation so we can see what the array looks like after the swap. At the top of the file, import java.util.Arrays and add the code below after the swap() line.
        System.out.println(Arrays.toString(input));
    
    5.
    If we make a swap, we want the loop to go again to check if we need to make more swaps to continue “bubbling up” the unsorted elements. Currently, we have swapping set to false.

    We want the while loop to go again after we perform one swap, so let’s add a line under the Swap.swap() call to set swapping to true.

    6.
    And we’re done with the algorithm! Give it a read.

    If you run the file, the main method calls bubbleSort() on an example array. Take note of the print statements in the console! Feel free to change the elements in the example array to see cases that might result in fewer or more swaps.