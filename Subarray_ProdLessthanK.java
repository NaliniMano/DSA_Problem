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
	   findsubarray_opti(nums,target);
		
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
	/***
	 * 
	 * Optimize approach
	 * Slidding window
	 * 
	 * @param nums
	 * @param k
	 */
	
public int findsubarray_opti(int[] nums,int k)
{
	int counter =0;
    int start=0;
    int prod =1;

    for(int i=0;i<nums.length;i++){

        prod*=nums[i];
        if(prod>=k){
            while(prod>=k && start<nums.length){
                prod=prod/nums[start++];
            }
        }
        if(prod<k) counter+=i-start+1;
    }
    System.out.println(counter);

    return counter;
}
		
}
