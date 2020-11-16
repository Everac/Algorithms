import java.util.Arrays;

public class InsertionSortTestDrive {
	public static void main(String[] args) {

		int[] unsortedArray = new int[] {10, 7, 3, 9, 3, -5};
		System.out.println("Unsorted Array is " + Arrays.toString(unsortedArray));
			
		int[] arrayInGoodOrder = new int[] { -5, 3, 3, 7, 9, 10};
		System.out.println("Sorted Array is " + Arrays.toString(arrayInGoodOrder));	

		InsertionSort sorter = new InsertionSort();

		int[] sortedArray = sorter.insertSort(unsortedArray);
		System.out.println("Sorted Array is " + Arrays.toString(sortedArray));

		// Check if Array is in good order
		// We do not use 'arrayA == arrayB' because it is like saying:
		// Is it the same array ?
		if (Arrays.equals(arrayInGoodOrder, sortedArray)) {
			System.out.println("Insertion Sort Algorithm works!!!");
		}
	
	}
}
