package com.java.sortingAlgos;

/*we need to sort an array of positive integers {3,11,2,9,1,5}. A bucket sort works as follows: create an array of size 11. Then, go through the input array and place integer 3 into a second array at index 3, integer 11 at index 11 and so on. We will end up with a sorted list in the second array. 
We immediately see two drawbacks to this sorting algorithm. Firstly, we must know how to handle duplicates. Secondly, we must know the maximum value in the unsorted array.. Thirdly, we must have enough memory - it may be impossible to declare an array large enough on some systems. 

The first problem is solved by using linked lists, attached to each array index. All duplicates for that bucket will be stored in the list. Another possible solution is to have a counter. As an example let us sort  3, 2, 4, 2, 3, 5. We start with an array of 5 counters set to zero. 


  0     1     2     3     4     5   
 0  	0 	  0     0     0     0 
Moving through the array we increment counters: 

  0     1     2     3     4     5   
 0  	0  	  2  	2	  1		1 
Next,we simply read off the number of each occurrence: 2 2 3 3 4 5. */
public class BucketSort {

}
