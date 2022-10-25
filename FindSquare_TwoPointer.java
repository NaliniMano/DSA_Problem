package week2.day21.assignemnt;

import java.util.Arrays;

import org.junit.Test;

public class FindSquare_TwoPointer {
	
	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums= {-7,5,1,4,7};
		findSqUsingTwoPointer(nums);
		

	}
//	@Test // edge
	public void example2() {

	}

//	@Test // negative
	public void example3() {

	}

	
	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * assign two pointer left =0, right=length-1
	 * loop until if left less than right
	 * Use Maths.absolute to remove the - sign
	 * check if left <= right then  take the left and sqare it in an array
	 * increment the left & right
	 * 
	 * 
	 */

	private void findSqUsingTwoPointer(int[] nums) {
		// TODO Auto-generated method stub
		
		int left=0,right=nums.length-1;
		
		while(left < right)
		{
			if(Math.abs(nums[left])==Math.abs(nums[right]))
			{
				
				nums[right]=nums[left]*nums[left];
				nums[right--]=nums[left]*nums[left];
				
				left++;
				
			}else if(Math.abs(nums[left]) > Math.abs(nums[right]))
					{
				     nums[right]=nums[left]*nums[left];
				     left++;
					}
			else
				nums[right]=nums[right]*nums[right];
			
			right--;
		}
		System.out.println(Arrays.toString(nums));
	}

	
	
	private void twoSum_BruteForce() {

	}

	private void twoSum_TwoPointer() {

	}


}
