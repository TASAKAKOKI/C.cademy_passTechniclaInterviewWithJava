Two-Pointer Linked List Techniques
                Learn how to approach Linked List problems with multiple iterator       pointers.
        
        Many common singly linked list problems can be solved by iterating with two pointers. This is sometimes known as the runner technique.

Two Pointers Moving in Parallel
                Consider the following problem:
                        Create a method that returns the nth last element of a singly linked list.
                In order to do this, you’ll need some way of knowing how far you are from the end of the list itself. However, in a singly linked list, there’s no easy way to iterate back through the list when you find the end.
                If you want, you can try your hand at the problem directly, or we can walk through some approaches below.
  -Approaches
        One thing that might first come to mind is to use an ArrayList to store a representation of the linked list. While this approach results in an easy-to-read implementation, it could also use up lots of memory maintaining a dual representation of the same data. If the linked list has one million nodes, we’ll need one million pointers in an ArrayList to keep track of it! An approach like this results in an extra O(n) space being allocated.
                public static Node arrayNthLast(LinkedList list, int n) {
                        ArrayList<Node> linkedListArray = new ArrayList<Node>();
                        Node currentNode = list.head;
                        while (currentNode != null) {
                                linkedListArray.add(currentNode);
                                currentNode = currentNode.getNextNode();
                        }
                        return linkedListArray.get(linkedListArray.size() - n);
                }
        Instead of creating an entire parallel list, we can solve this problem by using two pointers at different positions in the list but moving at the same rate. As in the previous example, we will use one pointer to iterate through the entire list, but we’ll also move a second pointer delayed n steps behind the first one.
                current = null
                tailSeeker = linked list head
                count = 0

                while tail pointer exists
                        move tail pointer forward
                        if count >= n
                                set nthLastNodePointer to head if it''s still null or move it forward
                        increment count
                return nthLastNodePointer
  -Implementation
        import java.util.ArrayList;
        public class nLastNode {
                public static void main(String []args) {
                        // Use this to test your code:  
                        LinkedList ll = createList();
                        ll.printList();
                        Node n = nthLastNode(ll, 9);
                        System.out.print(n.data);
                }
                public static Node nthLastNode(LinkedList list, int n) {
                        Node current = null;
                        Node tailSeeker = list.head;
                        System.out.println(tailSeeker.data);
                        int count = 0;
                        while (tailSeeker != null) {
                                tailSeeker = tailSeeker.getNextNode();
                                if (count >= n) {
                                        if (current == null) {
                                                current = list.head;
                                        } else {
                                                current = current.getNextNode();
                                        }
                                }
                                count += 1;
                                System.out.println(count);
                                System.out.println(current.data);
                        }
                        return current;
                }
                public static LinkedList createList() {
                        LinkedList list = new LinkedList();
                        for (int i = 50; i >= 1; i--) {
                                list.addToTail(i);
                        }
                        return list;
                }
        }
        In Java, we could implement the nth-last-node-finder function as such:
        
        The exact variable names aren’t important, and the internal implementation could be written in a number of ways, but the important part is that we are able to complete this problem efficiently, in O(n) time (we must iterate through the entire list once), and O(1) space complexity (we always use only three variables no matter what size the list is: two pointers and a counter).
Pointers at Different Speeds
        Using two pointers moving in parallel was a good solution to the previous problem. However, there are other problems where having two pointers moving in parallel wouldn’t be as useful. Let’s take a look at one of those problems and consider a new strategy that uses two pointers moving at different speeds.

        Consider finding the middle node of a linked list.

  -Approaches
        As before, it’s possible to find a solution by iterating through the entire list, creating an array representation, and then returning the middle index. But also as before, this can potentially take up lots of extra space:
                create array
                while the linked list has not been fully iterated through
                        push the current element onto array
                        move forward one node
                return array[length / 2]
        Instead, we can use two pointers to move through the list. The first pointer takes two steps through the list for every one step that the second takes, so it iterates twice as fast.
                fastPointer = list head
                slowPointer = list head
                while fastPointer is not null
                        move fastPointer forward
                        if the end of the list has not been reached
                                move fastPointer forward again
                                move slowPointer forward
                return slowPointer
        When the first pointer reaches the end of the list, the “slower” second pointer will be pointing to the middle element. Let’s visualize the steps of the algorithm:
                Starting State
                        F
                        S
                        1  2  3  4  5  6  7
                First Tick
                              F
                           S
                        1  2  3  4  5  6  7
                Second Tick
                                    F
                           S
                        1  2  3  4  5  6  7
                Third Tick
                                          F
                              S
                        1  2  3  4  5  6  7
                Final Tick
                                             F
                                 S
                        1  2  3  4  5  6  7  null
        As long as we always move the fast pointer first and check to see that it is not null before moving it and the slow pointer again, we’ll exit iteration at the proper time and have a reference to the middle node with the slow pointer.
  -Implementation
        public class findMiddle {
                public static void main(String []args) {
                        // Use this to test your code:  
                        LinkedList ll = createList(7);
                        ll.printList();
                        Node n = findMiddle(ll);
                        System.out.print(n.data);
                }
                public static Node findMiddle(LinkedList linkedList) {
                        Node fastNode = linkedList.head;
                        Node slowNode = linkedList.head;
                        while (fastNode != null) {
                                fastNode = fastNode.getNextNode();
                                if(fastNode != null) {
                                        fastNode = fastNode.getNextNode();
                                        slowNode = slowNode.getNextNode();
                                }
                        }
                        return slowNode;
                }
                public static LinkedList createList(int length) {
                        LinkedList list = new LinkedList();
                        for (int i = 1; i <= length; i++) {
                                list.addToTail(i);
                        }
                        return list;
                }
        }

        As with the nth-to-last solution, this solution has O(n) time complexity, and O(1) space complexity, since only two nodes are created no matter the size of the input list.

  -Half-Speed
        Another equally valid solution is to move the fast pointer once with each loop iteration but only move the slow pointer every-other iteration:
                public static Node findMiddleAlt(LinkedList linkedList) {
                        int count = 0;
                        Node fast = linkedList.head;
                        Node slow = linkedList.head;
                        while(fast != null) {
                                fast = fast.getNextNode();
                                if (count % 2 != 0) {
                                        slow = slow.getNextNode();
                                }
                                count++;
                        }
                        return slow;
                }
Conclusions
        Many linked list problems can be solved with the two-pointer technique. If it seems like a linked list problem requires keeping track of multiple positions or creating other data representations (such as using an array), consider whether two pointers iterating in parallel or at different speeds could help solve the problem efficiently. We won’t cover full solutions to these here, but variations on the two-pointer technique can be used to:
                Detect a cycle in a linked list
                Rotate a linked list by k places