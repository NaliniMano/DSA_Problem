package hwprogram;

import java.util.Arrays;

import org.junit.Test;

public class MoveTargetElementLast_Leet {
	/**
	 * Question here !!
	 * 
	 */
	

	//@Test // +ve
	public void example1() {
      int[] nums= {0,1,0,3,1,2};
      movezeroelement(nums);
	}

	

	@Test // edge
	public void example2() {
		 int[] nums= {1,0,10};
	      movezeroelement(nums);


	}

	//@Test // negative
	public void example3() {
		 int[] nums= {3};
	      movezeroelement(nums);


	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 1.intialize left=0,right=0
2.loop until right less that lastindex of array
3. if right element not =0  
       swap right to left
        increment both left and right
   else if left element ==0 & right element == 0
         increment right
    else 
         increment left & right

	 * 
	 */

	private int[] movezeroelement(int[] nums) {
		
		// TODO Auto-generated method stub
		
		int left=0,right=0,temp;
		if(nums.length <2 ) return nums;
		while(right < nums.length )
		 {
		   if(nums[right]!=0)
		    {
			  temp = nums[left];
			 nums[left++] =nums[right];
			 nums[right++] =temp;
			  			  
			}
		   else
			{
			   right++;
			   
			}
			
		    
		 }
		System.out.println(Arrays.toString(nums));
		return nums;
		
	}
}
