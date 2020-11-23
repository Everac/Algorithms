"""
Test Merge Sort Algorithm
"""
from merge_sort import MergeSort

def main():
    """
       #     Test mergeSort function
    """

    # List to be sorted
    msObject = MergeSort()
    msObject.array = [10, 7, 3, 9, 3, -5]
    print('Unordered array: {}'.format(msObject.array))

    # Sort list
    mergedArray = msObject.mergeSort()

    # Expected result: [-5, 3, 3,7, 9, 10]
    if mergedArray == [-5, 3, 3, 7, 9, 10]:
        print('Ordered array: {}'.format(mergedArray))
        print("Your Merge Sort Algorithm works !!!")


if __name__ == '__main__':
    main()
