package week9.daily.day1;

import org.junit.Test;

public class BinaySearch_DuplicateArray {
	
	@Test
	public void example1()
	{
		int[] nums= {5,7,8,8,10};
		int target=8;
		findTargetIndex(nums,target);
	}

	private int[] findTargetIndex(int[] nums, int target) {
		// TODO Auto-generated method stub
		 int left=0,right=nums.length-1,mid=0;
	      
	        while(left <=right)
	        {
	            mid=(left+right)/2;
	            
	            if(nums[mid] < target) left=mid +1;
	            else if(nums[mid] > target) right=mid-1;
	            else
	            {
	               if(nums[left]< target) left++;
	               else if(nums[right]>target) right--;
	               else
	                   return new int[] {left,right};
	            }
	               
	            
	        }
	       
	     return new int[]{-1,-1};
	    
	}

}
