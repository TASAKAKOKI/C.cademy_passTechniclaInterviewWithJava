Space Complexity: Java
        Learn about space complexity in Java.

    "Asymptotic notation" is often 'used to describe the runtime of a program or algorithm', but it can 'also be used to describe the space, or memory, that a program or algorithm will need'. Think about a simple function that takes in two numbers and returns their sum:
        public int addNumbers(int a, int b) {
            return a + b;
        }

    This function has a "space complexity of O(1)", because 'the amount of space it needs will not change based on the input'. While this function also has a constant runtime of O(1), "not all functions have matching space and time complexities":
        public void simpleLoop(int[] inputArray) {
            for (int i = 0; i < inputArray.length; i++) { 
            System.out.println(i);
            }
        }
    As we know, a simple for loop that goes through every element in an array of size n has a linear runtime of O(n). However, this function takes "O(1) space" since 'no new variables are being created and therefore no more space must be allocated'.

    Like with time complexity, "space complexity" 'denotes space growth in relation to the input size'. It’s also important to note that space complexity 'usually refers to any additional space that will be needed, and doesn’t count the space of the input'. So a function could have 10 arrays passed into it, but if all it does inside is print "Hello World!", then it still takes O(1) space.

    Consider the doubleArray() and findMin() functions. Both functions have big O runtimes of O(n), but what are their space complexities?:
        public int[] doubleArray(int[] inputArray) { 
            int[] doubledArray = new int[inputArray.length];
            for (int i = 0; i < inputArray.lenght; i++) {
            doubledArray[i] = 2 * inputArray[i];
            }
            return doubledArray;
        }
        
        public int findMin(inputArray) { 
            int min = inputArray[0];
            for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
            }
            return min;
        }
    doubleArray() creates a new array that matches the size of the input array, so the space needed for this function will change as the size of the input array changes: O(n). findMin() only creates one new int variable regardless of the input, so its size is constant: O(1).

    "Space complexity is important to consider alongside time complexity 'when comparing data structures and algorithms'". While two functions may have very similar runtimes, one could use less space. Consider the doubleArray() function from above. It has a runtime of O(n), and takes O(n) space. Could we optimize it to have a better space complexity?
        public int[] doubleInPlace(int[] inputArray) { 
            for (int i = 0; i < inputArray.length; i++) {
                inputArray[i] *= 2;
            }
            return inputArray;
        }
    doubleInPlace() does the same thing as doubleArray() and in the same amount of time, but 'only takes O(1) space', simply "because it doesn’t create a new array". As you move forward, "remember that just because a program has the best runtime possible, doesn’t mean it can’t still be optimized."
