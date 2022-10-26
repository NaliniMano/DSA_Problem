package hwprogram;

import org.junit.Test;

public class Subarray_ProdLessthanK {
	/**
	 * https://leetcode.com/problems/subarray-product-less-than-k/
	 * Given an array of integers nums and an integer k, return the number of contiguous subarrays
	 *  where the product of all the elements in the subarray is strictly less than k.


	 */
    @Test
	public void example1()
	{
		int[] nums= {10,5,2,6};
		int target=100;
	   findSubArray(nums,target);
		findsubarray_sliddingwindow(nums,target);
	}

	private void findSubArray(int[] nums,int k) {
		// TODO Auto-generated method stub
		int prod=1,count=0;
		for(int i=0;i<nums.length;i++)
		{
			prod=nums[i];
			if(prod <k)count++;
			
			for(int j=i+1;j<nums.length;j++)
			{
				
				prod*=nums[j];
                //System.out.println(prod);
				if(prod<k) count++;
				else break;
					
			}
		}
		//System.out.println(count);
	}
	
	public void findsubarray_sliddingwindow(int[] nums,int k)
	{
		int prod=1,count=0,left=0,right=0;
		while(right<nums.length)
		{
			prod=prod*nums[right++];
			while(prod >=k)
			{
				//System.out.println("inside");
				prod/=nums[left++];
			
				
			}
			if(prod < k) 
			{
				count++;
				System.out.println(left+", "+right);
				
			}
			
		}
	 while(right>=nums.length && left < nums.length)
		{
			prod=prod*nums[left++];
		
			if(prod < k)
				{
				count++;
				System.out.println(left+", "+right);
				}
			else
			{
			  prod=1;
			}
			
		}
		
		System.out.println(count);
	//	System.out.println(left+", "+right +"="+prod);
	}
	
}
