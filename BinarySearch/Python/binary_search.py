"""
Given a sorted array arr[] of n elements, write a function to search a given element x in arr[].
"""

def binary_search(ordered_list, l, r, x):
	"""
	Args:
    	ordered_lists (list): Ordered list of numbers
    	l (int): leftmost index
    	r (int): rightmost index
		x (int): number
	Returns:
    	Returns index of x in ordered_list if present, else -1 
	"""
	# Base case
	if r>=l: # Array has at least 1 element
		mid_point = (l + r) // 2

		if ordered_list[mid_point] == x:
			return mid_point
		elif ordered_list[mid_point] < x:
			return binary_search(ordered_list, mid_point + 1, r, x)
		else: # ordered_list[mid_point] > x
			return binary_search(ordered_list, l, mid_point, x)

	else:  # Array is empty
		return -1


def main():
	# Test 1
	array = [1,2,13,49,78,99]
	l = 0
	r = len(array) - 1
	x = 13

	index_test1 = binary_search(array, l, r, x)
	if index_test1 == 2:
		print("Your algo works!!!")
	else: 
		print("Your algo sucks!!!")

	# Test 2
	l = 0
	r = len(array) - 1
	x = 500
	index_test2 = binary_search(array, l, r, x)
	if index_test2 == -1:
		print("Your algo works!!!")
	else: 
		print("Your algo sucks!!!")


if __name__=='__main__':
	main()