/*
Merge Sort Algorithm implementation in Java
*/
import java.lang.Math;

public class MergeSort {
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
	public static int[] merge(int leftArray[], int rightArray[]) {
		/*
		Input: 
			leftArray:  A sequence of nl numbers < l1, l2, ..., ln > in ascending order
			rightArray: A sequence of nr numbers < r1, r2, ..., rn > in ascending order
		Output: 
			mergedArray A sequences of (nl + nr) numbers from LeftArray and rightArray,
			in ascending order
		*/
		
		// Get Arrays' lengths and create an empty merged Array
		int leftLength = leftArray.length;
		int rightLengt = rightArray.length;
		int mergedArray[] = new int[leftLength + rightLengt];

		int i = 0; // index for leftArray
		int j = 0; // index for rightArray
		int k = 0; // index for mergedArray

		while (i < leftArray.length &&  j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				mergedArray[k] = leftArray[i];
				i++;
			} else { // rightArray[j] < leftArray[i] 
				mergedArray[k] = rightArray[j];
				j++;
			}
			k++;
		}

		while (i < leftArray.length) {
			mergedArray[k] = leftArray[i];
			i++;
		}

		while (j < rightArray.length) {
			mergedArray[k] = rightArray[j];
			j++;
		}

		return mergedArray;
	}

	public static int[] mergeSort(int array[]) {
		if (array.length == 1) {
			return array;

		} else {
			int arrayLength = array.length;
			int middlePoint = Math.floorDiv(arrayLength, 2);

			int[] leftArray = new int[middlePoint];
			int[] rightArray = new int[arrayLength - middlePoint];

			//              (src   , src-offset  , dest , offset, count)
			System.arraycopy(array, 0           , leftArray, 0     , leftArray.length);
			System.arraycopy(array, leftArray.length, rightArray, 0     , rightArray.length);

			int[] left = MergeSort.mergeSort(leftArray);
			int[] right = MergeSort.mergeSort(rightArray);

			int[] mergedArray = MergeSort.merge(left, right);

			return mergedArray;
		}
	}
}