/*
Insertion Sort Algorithm
*/

public class InsertionSort {
	/*
	Input: 
		A sequence of n numbers < a1, a2, ..., an >
	Output: 
		A permutation (reordering) < a1', a2', ..., an' > of the \
		input sequence such that < a1' <= a2' <= ... <= an' >


	for j in range(1, len(array)):
		key = array[j]
		# Insert array[j] into sorted sequence array[1, ..., j-1]
		i = j-1
		while i >=0 and arrays[i] > key:
			array[i + 1] = arrsay[i]
			i = i - 1
		array[i + 1] = key

	return array
	*/

	public static int[] insertSort(int array[]){
		for (int j=1; j < array.length; j++) {
			int key = array[j];
			// Insert array[j] into sorted sequence array[1, ..., j-1]
			int i = j - 1;
			while (i >= 0 && array[i] > key) {
				array[i + 1] = array[i];
				i = i - 1;
			}
			array[i + 1] = key;
		}

		return array;

	}
}
