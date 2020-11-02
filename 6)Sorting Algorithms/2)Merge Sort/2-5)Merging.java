Merging
    Now, let’s turn our attention to the merge() function. First, let’s think about its arguments and what it returns:
        "Arguments": 'two sorted lists' as inputs (left and right)
        "Returns": 'a sorted list with the elements of left array and right array combined'. We will call this new sorted array merged

    Let’s break the implementation of this function into four parts:

        Step 1.
        - "Initialize an empty array, sortedArray, of integers of the correct length" to hold our sorted values.
        - "Initialize variables" leftPosition, rightPosition and currentIndex of type int set to 0.
            : In a future step, the value of the leftPosition index of left array will be compared to the value of the rightPosition index of the right array. : The currentIndex will keep track of the index we want to add our value to the sortedArray.
        function merge(leftArray, rightArray)
            sortedArray = empty array of integers of the correct length
            leftPosition = 0
            rightPosition = 0
            currentIndex = 0

            return sortedArray

        Step 2.
        - "Create a while loop" that continues while there are still elements in leftArray and rightArray.

        function merge(leftArray, rightArray)
            sortedArray = empty array of integers of the correct length
            leftPosition = 0
            rightPosition = 0
            currentIndex = 0
            while leftArray length is greater than leftPosition and rightArray length is greater than rightPosition
                // Do something

            return sortedArray
        
        Step 3.
        - "Create conditions that add an element to sortedArray with each loop". This code will add the smaller number, between leftArray[leftPosition] and rightArray[rightPosition] to the new array.

        function merge(leftArray, rightArray)
            sortedArray = empty array of integers of the correct length
            leftPosition = 0
            rightPosition = 0
            currentIndex = 0
            while leftArray length is greater than leftPosition and rightArray length is greater than rightPosition
                if leftArray[leftPosition] is less than rightArray[rightPosition]
                    set sortedArray at currentIndex to leftArray[leftPosition]
                    
                    increment leftPosition by 1
                else 
                    set sortedArray at currentIndex to rightArray[rightPosition]
                    
                    increment rightPosition by 1

                increment currentPosition by 1
        Step 4.
        - "Return the sortedArray, with leftArray and rightArray concatenated".

        function merge(leftArray, rightArray)
            sortedArray = int[]
            rightPosition = 0
            leftPosition = 0
            currentIndex = 0
            while leftArray is greater than starting leftPosition and rightArray is greater than the starting right position
                if leftArray[leftPosition] is less than rightArray[rightPosition]
                    set sortedArray at currentIndex to left[leftPosition]
                    increment leftPosition by 1
                else 
                    set sortedArray at currentIndex to right[rightPosition]
                    increment rightPosition by 1

                increment currentPosition by 1

            copy the left and right sorted arrays into sortedArray

            return sortedArray 

        Because the while loop continues until either leftArray or rightArray is empty, you need to concatenate whatever is left in the other array to the sorted array.

Instructions
    1.
    In our merge() function we have already created a merged array for you. You will write your code in this exercise before returning merged.

    Initialize variables leftPos, rightPos and curIndex of type int to a value of 0.

    In our main() method we are testing the merge() method you are creating by passing in two arrays:
        public static void main (String[] args) {
            MergeSort mergeTest = new MergeSort();
            int[] sortedLeft = {2, 3, 5};
            int[] sortedRight = {4, 7, 90};

            System.out.println(Arrays.toString(mergeTest.merge(sortedLeft, sortedRight)));
            }
        
    2.
    We now want to create a while loop that continues while there are still elements in left array and right array. We will also need to create conditions that add an element to merged when comparing our two arrays with each loop. Follow the steps below to do so:
        1. Implement a while loop that continues until the length of left array is greater than leftPos and length of right array is greater than rightPos.
        2. Add an if statement that checks if left[leftPos] is less than right[rightPos]. If it is, set the curIndex of merged to left[leftPos]. Increment leftPos by 1.
        3. Add an else statement that sets the curIndex of merged to right[rightPos]. Increment rightPos by 1.
        4. After the else statement increment curIndex by 1.

    3.
    Lastly, for our merge() method we need to make sure that we copy over the remaining elements in the left or right array that are greater than all the elements put into merged so far. Follow the steps below to do so:
        1. Once the while loop has completed, use the System.arraycopy() method on two separate lines. This method will accept a) the source array, left b) the starting position in the source array, leftPos c) the destination array, merged d) the starting position of the destination data curIndex e) the number of array elements to be copied, left.length - leftPos.
        2. Call the method System.arraycopy() again passing in the arguments right, rightPos, merged, curIndex, and right.length - rightPos.
    
    4.
    Let’s look at the completed Merge Sort in action. In the main() method replace what you have with this:
        public static void main (String[] args) {
            int[] inputArr = {3, 5, 2, 90, 4, 8};
            MergeSort sorter = new MergeSort();
            System.out.println(Arrays.toString(sorter.sort(inputArr)));
        }
    We should now return a sorted array of [2, 3, 4, 5, 8, 90].