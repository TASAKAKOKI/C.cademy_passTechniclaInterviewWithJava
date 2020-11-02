Splitting: Recursive Case
    The recursive case of our sort() function requires that we "split the input array into a leftArray and rightArray":
        function mergSort(arr)
            if the length of arr equals 1
                return arr
            midIndex = the floor integer of (left + right) / 2
            leftArray = arr from 0 to midIndex
            rightArray = arr from midIndex to end
    
    In the example above, the leftArray is equal to the input arr from 0 to the middle index. The rightArray is from the middle index to the end.

    Next, we pass the left and right arrays into the Sort() function:
        function mergeSort(arr)
            if the length of arr equals 1
                return arr
            midIndex = the floor integer of (left + right) / 2
            leftArray = arr from 0 to midIndex
            rightArray = arr from midIndex to end
            sort(leftArray)
            sort(rightArray)

    This is our recursive call.

Instructions
    1.
    After the if statement but before the return statement create a variable called mid of type int and set it equal to the floor of dividing length by 2 using Math.floorDiv() method.

    2.
    Create an array leftArray of type int[] and set it equal to a new array using the Arrays.copyOfRange() method. Pass in arr, 0, and mid. This will create a new array of elements from arr, from 0 to mid.

    Create an array rightArray of type int[] and use the Arrays.copyOfRange() method to set it equal to the elements of arr from mid to length.

    Our leftArray will be not inclusive of our mid value while our rightArray will be inclusive of the mid value.

    3.
    On two separate lines, pass leftArray into sort() and rightArray into sort(). We added a System.out.println(Arrays.toString(arr)); to the if block, so when you run your code, you should see each element of the input array ([3, 5, 2, 90, 4, 7]) printed to the terminal in its own list.