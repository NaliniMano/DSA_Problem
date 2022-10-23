package slidding_wind;

import java.util.Arrays;

import org.junit.Test;

public class FindMiniumumDiff_Leet {
	
	/***
	 * 1.https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/(sliding- window)
    *
	 * 
	 */
	
	@Test //postive
	public void example1()
	{
		int[] nums= {9,4,1,7};
		int k=2;
		findDifference(nums,k);
		
	}
	

	@Test //edge
	public void example2()
	{
		int[] nums= {9};
		int k=1;
		findDifference(nums,k);
	
	}
	
	/**
	 * 1. sort the given array 
	 * 2. calcualate diff between start and target index and set as minimum
	 * 3. loop thorugh from target until the length of array
	 * 4.  find the difference of elment from target and start index
	 * 5.. compare difference and find minimum
	 * 
	 * 
	 * 
	 * @param nums
	 * @param k
	 */

	private void findDifference(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		// O[n]
		Arrays.sort(nums);
		int start=0,diff=0,min=Integer.MAX_VALUE;
		
		diff=nums[k-1]-nums[start];
		min=Math.min(diff,min);
			start++;
		for(int i=k;i<nums.length;i++)
		{
		  diff=nums[i] -nums[start];
		  start++;
		  min=Math.min(diff, min);
		}
		System.out.println(min);
	}

}
