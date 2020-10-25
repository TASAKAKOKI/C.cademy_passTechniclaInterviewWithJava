Constructor and Instance Variables
    Now that you have an understanding of what nodes are, let’s see a Java implementation!

    We will create a basic node class that contains data and a link to the next node. Our node’s data will be specified as a String, but the same class could easily be changed to hold any other data type. Remember that a node’s link to the next node is null when there are no more nodes to traverse.

    Take a look at the starter code in the editor. You will find the Node class is defined for you, as is the main method.

Instructions
    1.
    Let’s begin by creating the instance variables for our Node class.
    The class has two properties, a String data, and a Node next. At the top of the class, declare both variables as public.
    
    2.
    Since nodes contain data, we want the constructor to expect a data String to be passed in.
    Declare a constructor for the Node class that takes the data as a parameter.
    
    3.
    Now that we have a constructor and instance variables, the next step is to give the variables value. Inside the constructor:
        set the class’s data variable to the passed in data
        set the next property to null
    Each new Node should have its next property defaulted to null since it hasn’t been assigned a next Node yet.

    4.
    Let’s check what we’ve done so far! In the main method, create a new Node named firstNode with the argument "I am a Node!".
    Print out firstNode‘s data to check if it was set correctly. Then print out its next node to check that it was set to null. You can use System.out.println() to print.