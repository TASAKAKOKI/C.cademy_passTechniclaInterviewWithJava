MinHeap Class
    Our Java MinHeap class'' will store two pieces of information:
        : An ArrayList of the elements within the heap.
        : A count of the elements within the heap.
    
    To make our lives easier, we’ll always keep one element at the beginning of the ArrayList with the value null. By doing this, we can simplify our code by always accessing our minimum element at index 1 instead of 0, and our last element at index this.size instead of this.size - 1.

    Here, we’ll check out the .heap and .size instance variables of a MinHeap instance:
        MinHeap minHeap = new MinHeap();
        System.out.println(minHeap.heap);
        // [null]
        System.out.println(minHeap.size);
        // 0

    Let’s begin writing our MinHeap class from scratch.

Instructions
    1.
    Within MinHeap.java, define the MinHeap constructor with no parameters below the class instance variables.

    2.
    Do the following inside the MinHeap constructor:
        : Initialize the .heap instance variable as an ArrayList containing only null.
        : Initialize the .size instance variable and set it to 0. The null value will not count towards heap size in our implementation.

    3.
    Within .main(), make an instance of the MinHeap class and assign it to a variable minHeap.

    4.
    Use an instance variable of minHeap to print the heap contents in .main(). Run MinHeap.java to see the contents.