"""
Python implementation of the Merge Sort ALgorithm

	1. Find the middle point to divide the array into two halves
	2. Call mergeSort for first half
	3. Call mergeSort for second half
	4. Merge the two halves sorted in step 2 and 3
"""

class MergeSort():
	
	def __init__(self):
		self.array = []

	def merge(arrayA, arrayB):
	    """
	        Merge two sorted arrays A and B
	    """
	    nA = len(arrayA)
	    nB = len(arrayB)
	    n = nA + nB

	    # Compare elements in both arrays and sort them
	    i = 0
	    j = 0
	    index = 0
	    mergedArray = []

	    while (i < nA) and (j < nB):
	        if arrayA[i] < arrayB[j]:
	            mergedArray.append(arrayA[i])
	            i += 1
	            index += 1
	        else:  # arrayB[j] < arrayA[i]
	            mergedArray.append(arrayB[j])
	            j += 1
	            index += 1

	    # Some elements are left out in arrayA or arrayB
	    # Insert them in mergedArray
	    while (i < nA):
	        mergedArray.append(arrayA[i])
	        i += 1
	        index += 1

	    while (j < nB):
	        mergedArray.append(arrayB[j])
	        j += 1
	        index += 1

	    return mergedArray


	def mergeSort(self):
	    """
	        Merge-Sort is an algorithm of the type
	    	Divide and Conquer'
	    """

	    # 1. Divide problem in smaller problems through recursion
	    # Recursion stop point
	    lst = self.array
	    if len(lst) == 1:
	        return lst
	    # Recursion
	    else:  # len(array) != 1
	        n = len(lst)
	        middlePoint = n//2

	        leftArray = MergeSort()
	        leftArray.array = lst[:middlePoint]
	        
	        rightArray = MergeSort()
	        rightArray.array = lst[middlePoint:n]
	        
	        left = leftArray.mergeSort()
	        right = rightArray.mergeSort()

	        # 2. Conquer problem through merge
	        nL = len(left)
	        nR = len(right)
	        n = nL + nR
	        # Compare elements in both arrays and sort them
	        i = 0
	        j = 0
	        index = 0
	        mergedArray = []

	        while (i < nL) and (j < nR):
			    if left[i] < right[j]:
			        mergedArray.append(left[i])
			        i += 1
			        index += 1
			    else:  # right[j] < left[i]
			        mergedArray.append(right[j])
			        j += 1
			        index += 1
			
	        # Some elements are left out in arrayA or arrayB. Let's insert them
	        while (i < nL):
			    mergedArray.append(left[i])
			    i += 1
			    index += 1

	        while (j < nR):
			    mergedArray.append(right[j])
			    j += 1
			    index += 1

	        return mergedArray
