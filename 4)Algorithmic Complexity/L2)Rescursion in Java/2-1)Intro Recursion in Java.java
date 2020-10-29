Introduction
    Recursion is a powerful tool for solving problems that require the execution of an action multiple times until a condition is met. For many problems, a recursive solution will result in fewer lines of code and will be easier to comprehend than a solution that uses a for or while loop.

    You may find that recursion is a difficult concept to wrap your head around at first. That’s fine! This lesson is meant as an introduction. As you see more examples and get more practice, you will start to feel comfortable with the concept.

    In this lesson, you will learn to implement a recursive method that returns the factorial of a number. An integer’s factorial is the product of an integer and all positive numbers less than it.

    Let’s consider 4 factorial:
        4! = 4×3×2×1=24
    Four factorial is equal to the product of 4 x 3 x 2 x 1, which is 24. The exclamation mark denotes that the number 4 is being factorialized.

    1! and 0! are both valid base cases of factorial. The factorial product of both numbers is 1.

    Before we dive into recursion, you will consider how factorial is implemented with an iterative approach.

Instructions
    1.
    Factorial.java includes a method called .iterativeFactorial(). The method accepts an integer as an argument, and returns the factorial of it.

    Take a look at how we implemented the method. Run the code when you’re ready to move to the next checkpoint.

    2.
    Set an int named fourFactorial equal to the value returned from iterativeFactorial(), with 4 as the argument.

    3.
    Print the value saved to fourFactorial.