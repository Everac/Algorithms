"""
Insertion Sort Algorithm implementation in Python
"""

def insertion_sort(array):
	"""
	Input: 
		A sequence of n numbers < a1, a2, ..., an >
	Output: 
		A permutation (reordering) < a1', a2', ..., an' > of the \
		input sequence such that < a1' <= a2' <= ... <= an' >
	"""
	for j in range(1, len(array)):
		key = array[j]
		# Insert array[j] into sorted sequence array[1, ..., j-1]
		i = j-1
		while i >=0 and arrays[i] > key:
			array[i + 1] = arrsay[i]
			i = i - 1
		array[i + 1] = key

	return array


def main():
	"""
		Test if insertion_sort function works
	"""
	
	# List to be sorted
	my_array = [10, 7, 3, 9, 3, -5]
	print('Unordered array: {}'.format(my_array))
	
	# Sort list
	my_array = insertion_sort(my_array)

	# Expected result: [-5, 3, 3,7, 9, 10] 
	if my_array == [-5, 3, 3,7, 9, 10]:
		print('Ordered array: {}'.format(my_array))
		print("Your Insertion Sort Algorithm works !!!")

if __name__ == '__main__':
	main()
