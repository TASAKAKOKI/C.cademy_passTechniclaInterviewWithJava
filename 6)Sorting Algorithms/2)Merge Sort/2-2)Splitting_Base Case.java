Splitting: Base Case
    In this implementation of merge sort, you will implement a recursive function, sort(), that splits the input array until each element is in its own array.

    So, if the input array is:
        [3, 5, 2]
    
    splitting these elements into their own array will look like:
        [3]
        [5]
        [2]
    
    In the recursive implementation, the "base case is when the input array has only one element in it". Below is a pseudocode implementation of the base case (Please expand the text window to make the pseudocode more readable):
        function mergeSort(arr)
            if the length of arr equals 1
                return arr

Instructions
    1.
    In sort(), add a line that saves the length of arr to a variable length of type int. Add another line to return null for now as our method expects a return value to avoid throwing an error.

    2.
    Add an if statement that checks if length is less than or equal to 1. If it is, return arr.