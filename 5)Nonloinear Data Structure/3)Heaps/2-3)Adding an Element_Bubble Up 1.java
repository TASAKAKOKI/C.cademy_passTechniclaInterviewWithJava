Adding an Element: Bubble Up Pt 1
    Now let’s build the functionality to add elements while maintaining the essential heap condition.

    There are "two components of the heap condition that a MinHeap MUST satisfy":
        : "The element at index 1 is the minimum value in the entire ArrayList".
        : "Every child element in the ArrayList must be larger than its parent".
    
    Let’s define a method ".add()" within MinHeap which will allow us to add elements to this.heap. The first element we add will be the minimum by default; there are no other elements yet.

    We will also define a method ".bubbleUp()" which will eventually "do the work of maintaining the heap condition as we add elements".

Instructions
    1.
    Within the MinHeap class, define a method called .add() below the constructor. It should take one int parameter, value, and not return anything.

    2.
    Within .add():
        : Add value to the end of this.heap.
        : Increment this.size since we just added an element.

    3.
    Also within .add():
        : Print the exact message: "Adding " + value.
        : Print the contents of the heap AFTER adding to the heap.

    4.
    Within .main(), call the MinHeap .add() method with the value 42. Run your code to see 42 added to the min-heap.

    5.
    Our min-heap now has elements! Let’s define .bubbleUp() which will eventually be tasked with preserving the heap condition. Define this method as private with no return value or parameters. It is private because it only needs to be accessed within the class.

    6.
    For now, just print the exact message "Restoring heap condition..." within .bubbleUp().

    7.
    We want to call .bubbleUp() each time we add an element. Go back to the .add() method and make a call to .bubbleUp() as the last line of the body of the method. Then check out your output!