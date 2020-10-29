What is Asymptotic Notation?
    Cheetahs. Ferraris. Life. All are fast, but how do you know which one is the fastest? You can measure a cheetah’s and a Ferrari’s speed with a speedometer. You can measure life with years and months.

    But what about computer programs? In fact, you can time a computer program, but different computers run at different speeds. For example, a program that takes 12 nanoseconds on one computer could take 45 milliseconds on another. Therefore, we need a more general way to gauge a program’s runtime. We do this with Asymptotic Notation.

    Instead of timing a program, through asymptotic notation, "we can calculate a program’s runtime by looking at how many instructions the computer has to perform based on the size of the program’s input": N.

    For instance, a program that has input of size N may tell the computer to run 5N^2+3N+2 instructions. (We will get into how we get this kind of expression in future exercises.) Nevertheless, this is a still a fairly messy and large expression. For asymptotic notation, we drop all of our constants (the numbers) because as N becomes extremely large, the constants will make minute differences. After changing our constants, we have N^2+N. If we take each of these terms in the expression and graph them, we see that the N^2 term grows faster than the N term.

    For example, when N is 1000:
        the N^2 term is 1,000,000
        the N term is 1,000

    As you can see, the N^2 term is much more significant than the N term. When N is larger than 1000, the difference becomes even more significant. Because the difference is so enormous, we don’t even need to consider the N term when calculating the runtime. Thus, for this program, we would describe the runtime in terms of N^2. There are "three different ways we could describe the runtime of this program": 'big Theta or Θ(N^2)', 'big O or O(N^2)', 'big Omega or Ω(N^2)'. The difference between the three and when to use which one will be detailed in the next exercises.