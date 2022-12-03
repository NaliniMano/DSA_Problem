package week8.sorting;

import org.junit.Test;

public class FindTarget_BinarySearch {
	
	
	//+ve
	//@Test
	public void example1()
	{
	 int[] nums={-1,0,3,5,9,12};
	 int target=9;
	 findTarget_BinarySearch(nums,target);
	 }
	 
	 //-ve
	@Test
	public void example2()
	{
	 int[] nums={-1,0,3,5,9,12};
	 int target=8;
	 findTarget(nums,target);
	 }
	 
	 //edge
	@Test
	 public void example3()
	{
	 int[] nums={-1,0,3,5,9,9,12};
	 int target=9;
	 findTarget(nums,target);
	 }
	 /**
	 
	 1. Iterate through the given array
	 2. if  target  match with current element  return the index
	 3. if no match return -1;
	 
	 time complexity : o[n]
	 **/
	 public int findTarget(int[] nums,int target)
	  {
	    for(int i=0;i<nums.length;i++)
		 {
		    if(nums[i]==target)
			  return i;
		 }
		 return -1;
	  } 
	  
	  /**
	  1. declare left =0,right= length of the array
	    iterate until left cross right
	  1. find the mid value ->left + right/2
	  2. if mid  less than target  iterate through left = mid+1
	  3   if mid equal target return the index
	  4    if mid  greater than target iterate through right ->mid-1  
	       return mid
	  5 . if  no match return -1;
	  
	  
	  **/
	  
	  public int findTarget_BinarySearch(int[] nums, int target)
	    {
		  int left=0,right=nums.length-1,mid=0;
	        while(left<=right)
	        {
	            mid=(left+right)/2;
	            if(nums[mid] < target)
	            left=mid+1;
	            else if(nums[mid]>target) right =mid -1;
	            else return mid;
	            
	        }
	     return -1;			 
		}
	

}
