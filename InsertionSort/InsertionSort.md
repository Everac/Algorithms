# Insertion Sort Algorithm Complexity

## Best Case Scenario
* Insertion Sort scans through an array of numbers, compares each pair of numbers and if they are out of order, it swaps them. 
* In the best case scenario, the array is already sorted. For example, we could have the next array : {1,2,3,4,5}. In this case, the Insertion SOrt Algorithm would only scan through the array numbers without swaping, so its complexity would be **O(n)**. 

## Worst Case Scenario
* Now, on the contrary, imagine that the array is in decreasing order. For example, {5,4,3,2,1}. To insert the last element, we need at most (n-1) comparisons and at most (n_1) swaps. To insert the second last element, we need at most (n-2) comparisons and at most (n-2) swaps, and so on. The number of operations needed to perform Insertion sort is therefore 2 x (1 + 2 + ... + n-2 + n-1). The solution to this *recurrence relation* for the runnign time gives a complexity of **O(n^2)** in the worst case scenario. 

### Conclusion

 - Insertion sort has a fast best-case running time and is a good sorting algorithm to use if the input list is already mostly sorted. 
 - For larger or more unordered lists, an algorithm with a faster worst and average-case running time, such as *mergesort*, would be a better choice.