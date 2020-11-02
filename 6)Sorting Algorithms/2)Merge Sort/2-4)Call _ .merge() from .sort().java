Call .merge() from .sort()
    At this point, we have a function that recursively splits the input array until each element is in a single-element array. The "final step is to call the function that is responsible for merging the leftArray and rightArray".
        function sort(arr)
            if the length of arr equals 1
                return arr

            midIndex = the floor integer of (left + right) / 2
            leftArray = arr from 0 to midIndex
            rightArray = arr from midIndex to end
            return merge(sort(leftArray), sort(rightArray))
            
    In last line of the pseudocode, we added a line that calls a function called merge(). We have replaced the recursive calls from the last exercise and will implant them inside our call to merge(). In the next few exercises, you will implement a merge() function that combines the sorted leftArray and rightArray halves into a larger sorted array.

Instructions
    1.
    We added a merge() function that prints leftArray and rightArray to the terminal.

    In sort(), we will no longer return a null value. Instead, return a call to merge(). Pass sort(leftArray) and sort(rightArray) as the first and second arguments.