# Merge Sort Algorith Time Complexity Analysis

The Merge Sort Algorith has two main steps: 
    1. Split arrays in two subarrays
    2. Merge pairs of ordered subarrays in ascending order
    
Let's analyse each part separately.

### Merging
- Merging two pairs of numbers who together have *n* numbers will result in performing (*n-1*) comparisons between pairs of numbers.

### Splitting
- If the array has *1* element, we get array back. This operations takes *T(1) = 0* time. 
- If the array has more than *1* element, let's say *n* elements. The splitting process will behave as follows: 
The first array will be splitted in two subarrays of *n/2* elements. Resulting subarrays will be splitted in fours subarrays of *n/4* elements. This process will go continue until we have *n* subarrays of size *1*.
- We'll merge and order each pair of subarrays recursively.

## Time complexity in best case and worst case scenarios
**O(nlogn)**
