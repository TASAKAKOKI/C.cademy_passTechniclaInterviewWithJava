Stack Helper Methods
    Because size matters in stacks, we need to be careful of the number of nodes in a stack. We don’t want our stack to overflow (adding nodes to a full stack via .push()) or underflow (removing nodes from an empty stack via .pop()).

    To prevent this, we will make some modifications to our Stack class methods.

    Before doing this, we will create two helper methods that will make our future class modifications simpler:
        .isEmpty(): return true if the size of the stack is 0, helps prevent underflow.
        .hasSpace(): returns true if the stack has space for another node, helps prevent overflow.

Instructions
    1.
    Within the Stack class, define a new method called .hasSpace(). For now, have this function return true. We’ll change this soon.

    2.
    Now alter the .hasSpace() method such that it only returns true if the current size of the stack is less than its maximum size. Otherwise, it returns false.

    3.
    Define another new method in Stack called .isEmpty(). For now, have .isEmpty() return false. We’ll change this soon.

    4.
    Now alter .isEmpty() such that it returns true if the stack does not have any nodes (this.size is 0), and returns false if the stack has one or more nodes.