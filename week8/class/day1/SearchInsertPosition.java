package week8.sorting;

import org.junit.Test;

public class SearchInsertPosition {

	//+ve
	//@Test
	public void example1()
	{
	 int[] nums={-1,0,3,5,9,12};
	 int target=9;
	 searchInsert(nums,target);
	 }
	 
	
	//-ve
	@Test
	public void example2()
	{
	 int[] nums={-1,0,3,5,9,12};
	 int target=8;
	 searchInsert(nums,target);
	 }
	 
	 //edge
	@Test
	 public void example3()
	{
	 int[] nums={-1,0,3,5,9,9,12};
	 int target=9;
	 searchInsert(nums,target);
	 }
	
    /*
    int left=0,right=nums.length-1;
    iterate until left cross right
    find mid value
    if mid less target left=mid+1;
    if mid greater target right =mid-1
    if mid equal target return mid
    
    when no match check if left element less than target
    return left
     
     
    */
	
	 private int searchInsert(int[] nums, int target) {
			// TODO Auto-generated method stub
		    
	        int left=0,right=nums.length-1,mid=0;
	        while(left<right)
	        {
	            mid=(left+right)/2;
	            if(nums[mid] < target)
	            left=mid+1;
	            else if(nums[mid]>target) right =mid -1;
	            else return mid;
	            
	        }
	//System.out.print(left+","+right+","+mid);
	        if(nums[left] < target )
	            return left+1;
	        else
	        return left;
		 
		}

	

}

