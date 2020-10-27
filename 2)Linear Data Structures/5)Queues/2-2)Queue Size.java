Queue Size
    Before diving into adding to our queue, we need to talk about queue sizes. Some queues can only contain a certain number of nodes, and others have no limit. Those with a limit are called "bounded queues". For example, the number of cars that can be transported via ferry is limited; this queue of cars is bounded.

    Knowing how to implement this kind of queue is bound to pay off, so let’s do it! To start, we will need to make additions to our Queue class to keep track of and limit size where needed.

    We will add a new property to quantify the limit:
        ".maxSize": a numerical property that we can use to limit total queue node count

    To incorporate .maxSize, we will use a tactic called constructor overloading. This will give us the option to create bounded queues as well as unbounded ones. There are slight changes in the code from the last exercise–keep reading to find out why!

Instructions
    1.
    We’ve changed some of your code from the last step. For this exercise, we just want you to understand what has changed. Let’s discuss the differences!

    For constructor overloading, we create a second Queue constructor with one argument, maxSize.

        - If no max size is provided, the first constructor calls the second, using this(), with its parameter set to DEFAULT_MAX_SIZE. This value is the maximum possible integer in Java. We’ll consider a queue of this size to be unbounded.
        - If a max size is provided, the second constructor is used automatically with the specified max size.
    Don’t worry about completely understanding this() or constructor overloading right now.

    Review the new code to make sure you generally understand what DEFAULT_MAX_SIZE is and why we created a second constructor.

    2.
    Because of constructor overloading, the instance variables you created in the last exercise need to be moved to the second constructor. Instantiate the same .queue and variable .size in the second constructor.

    3.
    In the second constructor, store the argument maxSize in the instance variable also called .maxSize, which is defined in the Queue class.

    4.
    Uncomment the code at the bottom and run it to see both types of constructors used.

    QueueOne: has a specified .maxSize, bounded.

    QueueTwo: uses DEFAULT_MAX_SIZE, unbounded.

    Look at the huge difference in their possible sizes! Remember that we are considering a queue of size DEFAULT_MAX_SIZE to be unbounded. 