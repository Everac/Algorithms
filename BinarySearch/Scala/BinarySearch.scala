// Scala implementation of Binary Search algorithm

object BinarySearch {
	def binarySearch(orderedArray: Array[Int], 
					left: Int, 
					right: Int, 
					x: Int): Int = {

		// Base case
		if (right>=left) {
			
			var midPoint = left + (right - left)/2
			
			if (orderedArray(midPoint) == x)
				return midPoint
			
			if (x < orderedArray(midPoint))
				// x is in he leftmost part of the array
				return binarySearch(orderedArray, left, midPoint -1, x)
			 
			// orderedArray[midPoint] < x
			// x is in the rightmost part of the array
			return binarySearch(orderedArray, midPoint + 1, right, x)
		} else {
			return -1
		}
	}

	def main(args: Array[String]) {

		val array1 = Array(1, 2, 11, 33, 57, 99)
		val l1 = 0
		val r1 = array1.length
		val x1 = 2

		var index1 = binarySearch(array1, l1, r1 - 1, x1)

		val array2 = Array(1, 6, 9, 500, 1000)
		val l2 = 0
		val r2 = array2.length
		val x2 = 5000

		var index2 = binarySearch(array2, l2, r2 - 1, x2)


		if (index1 == 1)
			print("Your algo rocks! :)")
		else
			print("It does not work! :(")

		if (index2 == -1)
			print("Your algo rocks again! :)")
		else
			print("It still does not work! :(")
	}
}