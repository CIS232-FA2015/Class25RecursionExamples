package cis232.examples;

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] nums = {1,2,4,8,16,32,64};
		
		System.out.println(binarySearch(125, nums));
	}

	/**
	 * Performs a binary search for value in an array.
	 * @param search value to search for
	 * @param nums array to search
	 * @return index of match or -1 if no match
	 */
	public static int binarySearch(int search, int[] nums){
		return binarySearchRec(search, nums, 0, nums.length - 1);
	}
	
	public static int binarySearchRec(int search, int[] nums, int start, int end){
		System.out.println("Calling recursive search!");
		if(start > end){
			//Base case, no more elements to check
			return -1;
		}
		int middle = (start + end) / 2;
		if(nums[middle] == search){
			//Base case, we found a match!
			return middle;
		} else if(nums[middle] > search){
			return binarySearchRec(search, nums, start, middle - 1);
		} else{
			return binarySearchRec(search, nums, middle + 1, end);
		}
		
		
	}
}
