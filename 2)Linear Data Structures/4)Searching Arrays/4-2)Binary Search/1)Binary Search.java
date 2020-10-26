Learn Binary Search
    With a sorted data-set, we can take advantage of the ordering to make a sort which is more efficient than going element by element.

    Let’s say you were looking up the word “Telescope” in the dictionary. You wouldn’t flip through the “A” words and “B” words, page by page, until you got to the page you wanted because you know “T” is near the end of the alphabet.

    You might flip it open near the end and see “R” words. Maybe then you jump ahead and land at “V” words. You would then go slightly backward to find the “T” words.

    At each point, you knew to look forward or backward based on the ordering of the alphabet. We can use this intuition for an algorithm called binary search.

    Binary search requires a sorted data-set. We then take the following steps:
        1. Check the middle value of the dataset.
            2-1. If this value matches our target we can return the index.
            
            2-2. If the middle value is less than our target
            3. Start at step 1 using the right half of the list.
            
            2-3.If the middle value is greater than our target
            3.Start at step 1 using the left half of the list.
    We eventually run out of values in the list, or find the target value.