How To Merge Sort:
    Merge sorting takes two steps: 
        1) "splitting the data" into “runs” or smaller components,
        2) and the "re-combining" those runs into sorted lists (the “merge”).

    When splitting the data, 
        1) we "divide the input to our sort in half". 
        2) We then "recursively call the sort on each of those halves", which cuts the halves into quarters. 
        3) This process "continues until all of the lists contain only a single element".
        4) Then we "begin merging".

    When merging two single-element lists,
        1) we "check if the first element is smaller or larger than the other".
        2) Then we "return the two-element list with the smaller element followed by the larger element".

Instructions
    How can we be sure that the leftover contents from two lists that we’re merging are all larger than the result we’ve built so far?