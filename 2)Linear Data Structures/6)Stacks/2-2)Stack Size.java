Stack Size
    Some stacks can have an unlimited number of nodes while others cannot. We will need to make additions to our Stack class to keep track of and limit size where needed.

    Let''s add a new instance variable to quantify the limit on stack size:
        - .maxSize: a numerical property that we can use to limit total stack node count

    To incorporate .maxSize , we will use a tactic called "constructor overloading". This will give us the option to create stacks with a limited size and stacks without one. There are slight changes in the code from the last exercise–keep reading to find out why!

Instructions
    1.
    We’ve changed some of your code from the last step. For this exercise, we just want you to understand what has changed. Let’s discuss!

    For constructor overloading, we create a second Stack constructor with one argument, maxSize.
        - If no max size is provided, the first constructor calls the second, using this(), with its parameter set to DEFAULT_MAX_SIZE. This value is the max possible integer in Java. We’ll consider a stack of this size to be without limit.
        - If a max size is provided, the second constructor is used automatically with the specified max size.

    Don’t worry about completely understanding this() or constructor overloading right now.

    Review the new code to make sure you generally understand what DEFAULT_MAX_SIZE is and why we created a second constructor.

    2.
    Because of constructor overloading, the instance variables you created in the last exercise need to be moved to the second constructor. Instantiate the same this.stack and this.size in the second constructor.

    3.
    In the second constructor, store the argument maxSize in the instance variable also called .maxSize, which is defined in the Stack class.

    4.
    Uncomment the code at the bottom and run it to see both types of constructors used.
        stackOne: has a specified this.maxSize.
        stackTwo: uses DEFAULT_MAX_SIZE.

    Look at the huge difference in their possible sizes! Remember that we are considering a stack of size DEFAULT_MAX_SIZE to be unlimited.