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
		maxProduct_opti(nums);
		
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
	 //2,3,-2,4
	 public int maxProduct(int[] nums) {
	        
	        int prod=1,max=Integer.MIN_VALUE;
	        for(int i=0;i<nums.length;i++)
	        {
	            prod=1;
	            for(int j=i;j< nums.length;j++)
	            {
	                prod=prod*nums[j];
	                max=Math.max(prod,max);
	            }
	        }
	       return max;
	    }
	 
	 
	 
	 /*
	    Optimised Solution

	    1. Use 2 variables, max & current product
	    2. Iterate from 0 to len-1 for first for loop
	    3. calculate current prod => current prod * nums[i]
	    4. For each iteration calculate the max product
	    5. If current product is 0 (element is 0) , reset current product as 1 and continue
	    6. Similar to step 2 but from array len-1 to 0 since the right side of array can have largest product
	    7. return max product

	    Time Complexity O[n]*/
	private int maxProduct_opti(int[] nums) {
	        int maxprod=Integer.MIN_VALUE;
	        int currprod=1;


	        for(int i=0;i<nums.length;i++){
	            currprod*=nums[i];
	            maxprod = Math.max(maxprod,currprod);

	            if(currprod==0) currprod=1;
	        }

	        currprod=1;

	        for(int j=nums.length-1;j>=0;j--){
	            currprod*=nums[j];
	            maxprod = Math.max(maxprod,currprod);

	            if(currprod==0) currprod=1;
	        }

	        return maxprod;
	}
	
	
	/** 3rd approach
	 * 
	 */
	
	public int maxProduct_opti2(int[] nums)
	{
		int n = nums.length;
        int l=1,r=1;
        int ans=nums[0];

        for(int i=0;i<n;i++){


            l = l==0 ? 1 : l;
            r = r==0 ? 1 : r;

            l *= nums[i];
            r *= nums[n-1-i];

            ans = Math.max(ans,Math.max(l,r));

        }

        return ans;

	}
	 
	
}
