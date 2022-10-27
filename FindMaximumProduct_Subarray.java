package slidding_wind;

import org.junit.Test;

public class FindMaximumProduct_Subarray {
	
	/***
	 * https://leetcode.com/problems/maximum-product-subarray/
	 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product,
	 *  and return the product.
	 * 
	 * 
	 */
	//@Test
	public void example1()
	{
		int[] nums= {2,3,-2,4};
		findmaxprod(nums);
	}
	
	@Test
	public void example2()
	{
		int[] nums= {2,-5,-2,-4,3};
		findmaxprod(nums);
	}
	
	//@Test
	public void example3()
	{
		int[] nums= {0,2};
		findmaxprod(nums);
	}

	
	/***
	 * y 
	 * declare variable left=0,right=0,prod=1,max=integer min value
	 * loop thorugh until left reach end of array
	 *
	 * multiply prod with right element and find max increment right
	 * when right reaches the last index reset the right pointer and increment the left
	 * 
	 * 
	 * @param nums
	 */
	private void findmaxprod(int[] nums) {
		// TODO Auto-generated method stub
		
		
		//time complexity 0[n*m]
		//space o[1]
		int left=0,right=0,prod=1,max=Integer.MIN_VALUE;
		while(left<nums.length)
		{
			prod=prod*nums[left];
			System.out.println(prod);
			max=Math.max(max, prod);
			prod=1;
			while (right<nums.length)
			{
				prod=prod*nums[right];
				
				max=Math.max(max, prod);
				
				right++;
			}
			//System.out.println(max);
			if(right >=nums.length) {
				right=left;
				left++;
			}
			prod=1;
		}
		System.out.println("max="+max);
	}

	/**
	 * Brute force
	 * use outer and inner loop 
	 * find prod of outer element and inner element
	 * compare and return the max value
	 * 
	 * @param nums
	 * @return
	 */
	 
	 public int maxProduct(int[] nums) {
	        
	        int prod=1,max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            prod=prod*nums[i];
	            max=Math.max(prod,max);
	            prod=1;
	            for(int j=0;j<=i;j++)
	            {
	                prod=prod*nums[j];
	            }
	          max=Math.max(prod,max);
	            prod=1;
	        }
	       return max;
	    }
	
}
