/*
Test Insertion Sort Algorithm
*/

object InsertionSortTestDrive {

	def main(args: Array[String]): Unit = {
		
		var unsortedArray = Array(10, 7, 3, 9, 3, -5) 
		println("Unsorted Array is " + unsortedArray.mkString(", "))
		
		var arrayInGoodOrder = Array( -5, 3, 3, 7, 9, 10)
		println("Once sorted, the Sorted Array should look like this: " + arrayInGoodOrder.mkString(", "))

		var sorter = new InsertionSort()
		var sortedArray = sorter.insertSort(arrayInGoodOrder)
		println("Your Sorted Array is " + sortedArray.mkString(", "))

		if (arrayInGoodOrder.sameElements(sortedArray)) {
			println("Your Insertion Algorithm rocks !!!")
		}
	}
}