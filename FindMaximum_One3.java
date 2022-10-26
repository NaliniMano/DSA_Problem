package slidding_wind;

import org.junit.Test;

public class FindMaximum_One3 {
	/**
	 * https://leetcode.com/problems/max-consecutive-ones-iii/
	 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.


	 */
	
	@Test
	public void example1() {
		int[] nums = {1,1,1,0,0,0,1,1,1,0};
		int k = 2;
		findlongestOnes(nums,k);
	}
	
	

	@Test
	public void example2() {
		int[] nums = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
		int k = 3;
		findlongestOnes(nums,k);
	}
	
	/**
	 * Slidding Window
	 * 1)create two pointer left and right
	 * 2)loop through until length of array
	 * 3) if value of element in right is 0 reduce the k value
	 * 4) when k less than 0 increment left & reset k
	 * 5) calcuate the length of subarray right-left and find the maximum
	 * 6) return max
	 * 
	 * time complexity O[n]
	 * space o[1]
	 * 
	 * 
	 * @param nums
	 * @param k
	 */
	
	private void findlongestOnes(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		int left = 0, right =0, max=Integer.MIN_VALUE,len=0; 
		while(right<nums.length) {
			if(nums[right] == 0) {
				k--;
			}
			
			if(k < 0) {
				if(nums[left] == 0) {
					k++;
				}
				left++;
			}
			len=right-left+1;
			max = Math.max(max,left);
          right++;
		}
		System.out.println(max);

		
	}

}
