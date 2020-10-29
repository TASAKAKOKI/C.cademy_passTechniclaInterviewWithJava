Base Case
    Now that we’ve walked through an iterative version of a linked list search, we can begin work on the findNodeRecursively() method. Before we consider the base and recursive cases, let’s think about the two parameters required to traverse a linked list recursively:
        : data – the first parameter. This is the value of the Node that is being searched for in the linked list.
        : currentNode – the second parameter. This is the current node in the linked list. During each recursive call, the method will pass the next node as this argument. The first call to findNodeRecursively() should pass the head node as this argument.

        public class LinkedList {
        ...
            public Node findNodeRecursively(String data, Node currentNode) {
            // Some code  
            }
        }

    Now let’s consider the base case for our linked list. It should return a different value for each of the following two cases:
        If the currentNode has the matching data, it should return the current node.
        If the currentNode is the end of the list, the method should return null.

Instructions
    1.
    Scroll to the bottom of LinkedList.java to find the .findNodeRecursively() and main() methods.

    You will notice that we return a Node with a data value equal to "Empty" at the bottom of .findNodeRecursively(). This is to make sure the method compiles. In the next exercise, you will delete this line.

    Above this line, add an if block that returns null if there are no nodes to look through.

    2.
    In .findNodeRecursively(), add an else if statement that returns the currentNode if the node’s data attribute is equal to the input data argument.

    3.
    Add the following code to the main() method:
        Node foundNode = myList.findNodeRecursively("Node 2", myList.head);        
        System.out.println(foundNode.data);    
    This code will print "Empty" to the console because we have not added a recursive case to .findNodeRecursively(). In the next exercise, we will fix this.   