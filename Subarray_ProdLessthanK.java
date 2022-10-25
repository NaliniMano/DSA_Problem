package hwprogram;

public class Subarray_ProdLessthanK {
	/**
	 * https://leetcode.com/problems/subarray-product-less-than-k/
	 * Given an array of integers nums and an integer k, return the number of contiguous subarrays
	 *  where the product of all the elements in the subarray is strictly less than k.


	 */

	public void example1()
	{
		int[] nums= {10,5,2,6};
		findSubArray(nums);
	}

	private void findSubArray(int[] nums) {
		// TODO Auto-generated method stub
		int prod=1,count=0;
		for(int i=0;i<nums.length;i++)
		{
			prod*=nums[i];
			for(int j=i+1;j<nums.length;j++)
			{
				
				prod*=nums[j];
System.out.println(prod);
				if(prod<100) count++;
				else break;
					
			}
		}
		System.out.println(count);
	}
	
	
}
