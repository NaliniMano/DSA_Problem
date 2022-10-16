

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class Array_Parity1_LeetCode {
	

	/*Given an integer array nums, move all the even integers at the
	 *  beginning of the array followed by all the odd integers
	 * 
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums= {3,5,2,7,6};
         Assert.assertArrayEquals(doParity(nums),new int[] {2,6,3,5,7});
	}

	

	@Test // edge
	public void example2() {
		int[] nums= {3,5,7,9,1};
        Assert.assertArrayEquals(doParity(nums),new int[] {3,5,7,9,1});
	}

	@Test // negative
	public void example3() {
		int[] nums= {3};
        Assert.assertArrayEquals(doParity(nums),new int[] {3});

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 
	 * Traverse through input array
	 * create count=0
	 * check if element is even 
	 *  store the even element in first of output 
	 *  increment the count 
	 *  
	 *  Traverse through input array
	 *  check if element is odd
	 *  store the odd element after the even element
	 *  
	 */

	private int[] doParity(int[] nums) {
		
		if(nums.length<2)
		{
			return nums;
		}else {
		// TODO Auto-generated method stub
		int count=0;
		  int output[] = new int[nums.length];
		  
		  // adding  even number to first
		    for(int i=0;i<nums.length;i++)
		    {
		        if(nums[i]%2==0)
		        {
		            output[count]=nums[i];
		        	count++;
		        }
		    }
		    
		    //adding  odd number to last
		   for(int k=0;k<nums.length;k++)
		    {
		    	
		    	if(nums[k]%2!=0)
		    	{
		    	output[count]=nums[k];
		    	count++;
		    	}
		     
		    }
		   System.out.println(Arrays.toString(output));
		    return output;
		   

		}
	}
	
	    
}   
    


