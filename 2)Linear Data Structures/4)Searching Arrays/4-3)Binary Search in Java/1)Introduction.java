Introduction
    In this lesson, you will implement an iterative binary search method in Java that finds the index of a value in an array.

    The method will:
        -Accept an array of integers and an integer value as arguments
        -Return the index of the value if it is present in the array
        -Return -1 if the integer argument is not in the array

    You will test your method by inputting the array shown in the gif to the right as the first argument. By the end of this lesson, the following Java code will print 6 to the console.
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 41;

        System.out.println(search(searchable, target)); // 6
    In the code above, also shown visually to the right, the search() method finds the index in searchable that is equal to 41 and returns its index, 6. In this lesson, you will implement this iterative approach using a while loop.

Instructions
    In the gif to the right, the binary search algorithm checks indices 5, 8, and 7 before finding the target value at index 6.