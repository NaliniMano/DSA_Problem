import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Array_Parity2_Leetcode {

	
	/*Given an integer array nums, move all the even integers at the
	 *  beginning of the array followed by all the odd integers.


	 * 
	 * 
	 */

	@Test // +ve
	public void example1() {
		int[] nums= {3,5,2,7,6,4};
		doParity(nums);
        Assert.assertArrayEquals(doParity(nums),new int[] {2,3,6,5,4,7});
	}

	@Test // edge
	public void example2() {
	//	int[] nums= {3,5,7,9,1};
		int[]  nums= {2,4,6,8};
		//doParity(nums);
        Assert.assertArrayEquals(doParity(nums),new int[] {2,0,4,0});
	}

	@Test // negative
	public void example3() {
		int[] nums= {3};
       doParity(nums);
       Assert.assertArrayEquals(doParity(nums),new int[] {3});

	}


	
	/****
	 * 
	 *create odd and even counter
	 *create result array equal to gvn input
	 *check length of input less than 2  return input array
	 * loop through the array
	 * check if element is even add to even postion of index(0,2,4...) .
	 * increment even counter twice
	 * loop through the array
       Check if element is odd add to odd position of index(1,3,5...) .
	 * increment even counter twice
	 *  return output
	  l
	 *  
	 * 
	 * 
	 * 
	 * 
	 * @param nums
	 */
	
	
	private int[] doParity(int[] nums) {
		// TODO Auto-generated method stub
		   int count=0;
		   int odd=1,even=0;
		    int output[] = new int[nums.length];
		    Arrays.fill(output, 0);
		    
     if(nums.length <2) {return nums; }
      
	for(int i=0;i<nums.length;i++)
	    {
	        if(nums[i]%2==0 && even<nums.length)
	        {
	            
	        	output[even]=nums[i];
	        	even=even+2;
	        }
	    }
	for(int k=0;k<nums.length;k++)
	    {
	    	
	    	if(nums[k]%2!=0 && odd<nums.length)
	    	{
	    	output[odd]=nums[k];
	    	odd=odd+2;
	    	}
	     
	    }
	    
	   // System.out.println(Arrays.toString(output));
	    return output;
	}
	
}
