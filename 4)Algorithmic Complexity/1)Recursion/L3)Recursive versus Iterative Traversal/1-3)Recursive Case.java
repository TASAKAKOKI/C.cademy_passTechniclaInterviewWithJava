Recursive Case
    Now it’s time to add a recursive case. The recursive case should execute when the node has not been found and the end of the list has not been reached.

    Because you’ve covered both of the base cases, you can use an else statement to call your recursive case.

Instructions
    1.
    Delete return new Node("Empty"); from the bottom of findNodeRecursively().

    Add an else block to .findNodeRecursively() that returns a call to .findNodeRecursively().

    Pass data and the next node as arguments.

    When you run your code, you should see Node 2 printed to the console.

    2.
    In the main() method, change the value passed to myList.findNodeRecursively() to "Node 5".

    This should return a java.lang.NullPointerException because "Node 5" doesn’t exist in the list. This exception is intended behavior since you can’t return a Node object when the data doesn’t exist in the list.