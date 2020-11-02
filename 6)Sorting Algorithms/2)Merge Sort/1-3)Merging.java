Merging
    "When merging larger pre-sorted lists", we "build the list similarly to how we did with single-element lists".

    Let’s call the two lists "left" and "right". Both left and right are "already sorted". We want to "combine them (to merge them) into a larger sorted list", let’s call it both. To accomplish this we’ll "need to iterate through both with two indices, left_index and right_index".
        1) At first left_index and right_index "both point to the start of their respective lists". left_index points to the smallest element of left (its first element) and right_index points to the smallest element of right.

        2) "Compare the elements at left_index and right_index". The smaller of these two elements should be the first element of both because it’s the smallest of both! It’s the smallest of the two smallest values.
        
        Let’s say that smallest value was in left. We continue by "incrementing" left_index to point to the next-smallest value in left. Then we compare the 2nd smallest value in left against the smallest value of right. Whichever is smaller of these two is now the 2nd smallest value of both.

        3) This process of “look at the two next-smallest elements of each list and add the smaller one to our resulting list” "continues on for as long as both lists have elements to compare".
        
        4) Once one list is exhausted, say every element from left has been added to the result, then we know that all the elements of the other list, right, should go at the end of the resulting list (they’re larger than every element we’ve added so far).

Instructions
    Why is it important that we only merge pre-sorted lists?