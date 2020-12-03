class BinarySearchTestDrive {
	public static void main(String[] args) {
		int[] orderedArray = {1, 2, 11, 44, 76, 99};
		int left = 0;
		int right = orderedArray.length;
		int x = 99;
		// Get index throuth Binary Search
		int indexX = BinarySearch.search(orderedArray, left, right-1, x);
		if (indexX == 5) {
			System.out.println("Your algo rocks!!!");
		} else {
			System.out.println("Your algo sucks :S. Keep trying");
		}

		int y = 500;
		// Get index throuth Binary Search
		int indexY = BinarySearch.search(orderedArray, left, right-1, y);
		if (indexY == -1) {
			System.out.println("Your algo rocks!!!");
		} else {
			System.out.println("Your algo sucks :S. Keep trying");
		}
	}
}