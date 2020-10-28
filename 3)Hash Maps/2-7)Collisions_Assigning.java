Collisions: Assigning
    Our "first step in implementing a collision strategy" is "updating our constructor and .assign() method to use custom linked lists and nodes inside the hashmap array". This will allow us to store multiple values at the same index by adding new nodes to a linked list instead of overwriting a single value. This strategy of handling collisions is called "separate chaining".

    A collision-proof .assign() should look like this to start:
        : Store the hashed key in a variable arrayIndex
        : Store the linked list at arrayIndex in a variable linkedList
        : If the linked list at the correct index is empty, add the key-value pair to the linked list as a node.

    We’ll be using the LinkedList and Node classes found in the LinkedList.java and Node.java files to implement our collision-proof HashMap class. The only file you will be working in for this exercise is HashMap.java.

Instructions
    1.
    Instead of an empty array, our hash map will now be replaced with a custom linked list. Our linked list hash map will be filled with empty linked lists.

    In the HashMap.java file, change our hashmap from an array of Strings to an array of LinkedLists. Also, replace the code in the constructor method with the following:
        public HashMap(int size) {
            this.hashmap = new LinkedList[size];
            for (int i = 0; i < size; i++) {
                this.hashmap[i] = new LinkedList();
            }
        }
    Our new constructor is creating a new empty linked list at every index in our hashmap array.

    2.
    In the assign function, we now need to find the LinkedList stored at the value arrayIndex.

    Declare a LinkedList in .assign() method called list with the value at arrayIndex in the hash map array.

    This new LinkedList list will reference the linked list we want to add a value to.

    3.
    If the linked list at arrayIndex is empty, we should add the key-value pair to the list. The key-value pair should be stored in a node and become the head of the linked list before exiting the code.

    Add an if statement that checks if the linked list head exists. If it doesn’t exist, add the key-value pair as the head of the linked list.

    4.
    Finally, if the key-value pair has been added as the head node of the linked list we can exit the code. Inside the if statement use the return keyword to exit out of the code.

    (This return statement will be important in the next exercise when we finish the assign method.)