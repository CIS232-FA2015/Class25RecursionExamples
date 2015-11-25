package cis232.examples;

public class SummingArrayRangeExample {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
		
		//Non-recursive
//		int total = 0;
//		for(int i = 2; i <= 5; i++){
//			total += nums[i];
//		}
		System.out.println(sumRange(nums, 2, 5));
	}
	
	
	public static int sumRange(int[] nums, int start, int end){
		//base case
		if(start > end){
			return 0;
		} else{
			return nums[start] + sumRange(nums, start + 1, end);
		}
	}
	

}
