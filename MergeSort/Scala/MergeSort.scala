/*
Merge Sort Algorithm implementation in Scala
*/

class MergeSort() {
	/*
	Input: 
		A sequence of n numbers < a1, a2, ..., an >
	Output: 
		A permutation (reordering) < a1', a2', ..., an' > of the \
		input sequence such that < a1' <= a2' <= ... <= an' >
	
	Algorithm steps: 
		1. Find the middle point to divide the array into two halves
		2. Call mergeSort for first half
		3. Call mergeSort for second half
		4. Merge the two halves sorted in step 2 and 3
	*/
	
	def merge(leftArray: Array[Int], rightArray: Array[Int]): Array[Int] = {
		
		var i = 0
		var j = 0
		var k = 0
		
		var mergedArray = Array.fill(leftArray.length + rightArray.length)(0)

		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray(i) < rightArray(j)) {
				mergedArray(k) = leftArray(i)
				i = i + 1  
			} else { // rightArray[] < leftArray[]
				mergedArray(k) = rightArray(j)
				j = j + 1
			}
			k = k + 1
		}

		while (i < leftArray.length) {
			mergedArray(k) = leftArray(i)
			i = i + 1
			k = k + 1
		}

		while (j < rightArray.length) {
			mergedArray(k) = rightArray(j)
			j = j + 1
			k = k + 1
		}

		return mergedArray
	}

	def mergeSort(array: Array[Int], lowerIndex: Int, higherIndex: Int): Array[Int] = {
		if (higherIndex - lowerIndex < 1) {
			return array.slice(lowerIndex, higherIndex+1)
		} 	
		val middlePoint = (higherIndex - lowerIndex)/2 + lowerIndex

		val leftArray = mergeSort(array, lowerIndex, middlePoint) 
		val rightArray = mergeSort(array, middlePoint+1, higherIndex)

		return merge(leftArray, rightArray)
	}

}
