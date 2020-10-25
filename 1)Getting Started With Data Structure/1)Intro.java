Pass the Technical Interview with Java Introduction
        Welcome to Pass the Technical Interview with Java! Let's look at what's coming up in this path.
    Welcome!
        Welcome to the Pass The Technical Interview With Java Skill Path. In this path, you will use Java to build data structures, implement algorithms, and solve traditional Software Engineer technical interview questions.
        Before beginning this path, you should make sure to brush up on your fundamental Java skills. This includes:
            Variables
            Classes, Objects, and Object-Oriented Programming
            Conditionals
            Arrays and ArrayLists
            Loops
            Strings
    Path Syllabus
        At the start of this path we’ve included a few articles coving some more niche Java concepts that will be relevant for the data structures and algorithms that you are going to create.
        Next, we’ll start implementing some fundamental data structures. We’ll start with a Node and from there we’ll use Nodes to build Linked Lists, Doubly Linked Lists, Queues, and Stacks.
        After creating these data structures, we’ll start to think about why these data structures are particularly useful. By learning about algorithmic complexity and asymptotic notation, we can begin to get an understanding of the strength and weaknesses of our data structures.
        Once we have an understanding of how to evaluate data structures and algorithms, it’s time to start building the really powerful one. A handful of more complex data structures like Trees, Heaps, and Graphs can be used to help solve searching and sorting problems in a snap!
        We’ll compare sorting algorithms like Bubble Sort, Merge Sort, and Quicksort. We’ll also learn how to traverse Graphs using the intimidating-sounding (but we promise it’s not too bad) Dijkstra’s Algorithm.
        Finally, we’ll wrap up the path by walking you through some interview tips and tricks, common interview questions, and some overall strategies.
        By the end of the path, you should feel confident in your ability to go to a technical interview, use Java to solve the coding problems they throw at you, and explain the algorithmic complexity of your solution!

Why Data Structures?
        Learn what data structures are, why they are useful, and how you can use them effectively.
    What even are data structures?
        At the backbone of every program or piece of software are two entities: data and algorithms.
        
        Algorithms transform data into something a program can effectively use. Therefore, it is important to understand how to structure data so algorithms can maintain, utilize, and iterate through data quickly.
        
        Data structures are the way we are able to store and retrieve data. You may already be familiar with Python lists and dictionaries or Javascript arrays and objects. If so, you know that lists and arrays are sequential with data accessed by index while dictionaries and objects use a named key to store and retrieve information.
        
        The data structures that exist in programming languages are pretty similar to real-world systems that we use outside of the digital sphere. Imagine that you go to the grocery store. At this particular grocery store, the frozen pizza is stored next to the bell peppers and the toothbrushes are next to the milk. The store does not have signs that indicate where different items are located. In this disorganized grocery store, you would have a pretty difficult time trying to find what you were looking for!
        Fortunately, most grocery stores have a clear order to the way the store is stocked and laid out. Similarly, data structures provide us with a way to organize information (including other data structures!) in a digital space.
    How are data structures used?
        Data structures handle four main functions for us:
            Inputting information
            Processing information
            Maintaining information
            Retrieving information
        Inputting is largely concerned with how the data is received. What kind of information can be included? Will the new data be added to the beginning, end, or somewhere in the middle of the existing data? Does an existing point of data need to be updated or destroyed?
        Processing gets at the way that data is manipulated in the data structure. This can occur concurrently or as a result of other processes that data structures handle. How does existing data that has been stored need to change to accommodate new, updated, or removed data?
        Maintaining is focused on how the data is organized within the structure. Which relationships need to be maintained between pieces of data? How much memory must the system reserve (allocate) to accommodate the data?
        Retrieving is devoted to finding and returning the data that is stored in the structure. How can we access that information again? What steps does the data structure need to take to get the information back to us?
        Different types and use cases for data will be better suited to different manners of inputting, processing, storing, and retrieving. This is why we have several data structures to choose from… and the ability to create our own!

    Choosing the best data structure
        Your plumber probably would not be the best professional to diagnose an illness and your doctor probably wouldn’t be the best person to do your taxes — they are each better suited for other tasks! Similarly, different data structures are better suited for different tasks. Choosing the wrong data structure can result in slow or unresponsive code (and mess up your program!), so it’s important to consider a few factors as you make your decision:
            1. What is the intended purpose for the data? Do any data structures have built-in functionality that is ideally suited for this purpose? Do you want to search, sort, or iterate data in a way in which certain data structures would be better suited than others?
            2. Do you want or need control over how memory is set aside to store your data? Data structures that use static memory allocation (e.g., stacks or arrays) will manage memory for you and assume a fixed amount of memory upon instantiation with a cap on how much data may be added. Data structures that utilize dynamic memory allocation (e.g., heaps or linked lists) allow you to allocate and reallocate memory within the life of the program. While memory allocation is not something that you’ll need to consider in languages like Python or Javascript (these languages will manage memory for you, regardless of which data structure you use), it is something to bear in mind when working in other languages like C.
            3. How long will it take different data structures to accomplish various tasks relative to other data structures? Technically, two data structures may both be able to accomplish the same task for you, but one may be quite a bit faster. This consideration, known as runtime will be covered further in depth when you explore all the nifty tricks of asymptotic notation.
        As you’ve seen, data structures are the essential building blocks that we use to organize all of our digital information. Choosing the right data structure allows us to use the algorithms we want and keeps our code running smoothly. Understanding data structures and how to use them well can play a vital role in many situations including:
            technical interviews in which you may be asked to evaluate and determine runtime for data structures given specific algorithms
            day-to-day work for many software engineers who manipulate data stored in structures
            data science work where data is stored and accessed through data structures
            a whole lot more!