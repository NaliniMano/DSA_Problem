package slidding_wind;

import org.junit.Test;

public class FindLongestOne_DeletingZero {
	/****
	 * 
	 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	 * 
	 */
	
	//@Test
	public void example1() {
		int[] nums = {1,1,0,1};
		int k = 1;
		findlongestOneDelete(nums);
	}
	
	




	@Test
	public void example2() {
		int[] nums = {0,1,1,1,0,1,1,0,1};
		int k = 1;
		findlongestOneDelete(nums);
	}
	

	private void findlongestOneDelete(int[] nums) {
		// TODO Auto-generated method stub
		
		int left = 0, right =0, max=Integer.MIN_VALUE;
        int k=1;
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

    if( k>=0 && k<=1) max = Math.max(max,right-left);
  right++;
}
System.out.println(max);
//return max;

		
	}


}
