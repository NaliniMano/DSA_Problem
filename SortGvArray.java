package day7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SortGvArray {
	

	@Test
	public void example1()
	{
	 int[] nums={5,7,2,9,1,14,12,10,5,3};
	 doSort(nums);
	 doSort_optimise(nums);
	}
	
	/*
	1. iterate through given array
	2. declare 3 list first,middle,last
	2. if num less than 3  add to first
	3  if num between 4 to 10 add to middle
	4. if num between 10 to 15  add to last
	5. combine all the list  and return the array


	*/

	private void doSort(int[] nums) 
	{
		// TODO Auto-generated method stub
		
		List<Integer> first =new ArrayList();
		List<Integer> middle =new ArrayList();
		List<Integer> last =new ArrayList();
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]<=3) {
				first.add(nums[i]);
			}else if(nums[i]>=4 && nums[i]<=10) middle.add(nums[i]);
			else last.add(nums[i]);
		}
		//System.out.println(first+","+middle+","+last);
		middle.addAll(last);
		first.addAll(middle);
		System.out.println(first);
	}
/**
 * Dutch flag algorithm
 * 
 * 
 * @param nums
 */
	
	private void doSort_optimise(int[] input) 
	{
		// TODO Auto-generated method stub
		
		int low=0,middle=0,high=input.length-1;
		int temp;
		while(middle <= high)
		{
			
			if(input[middle]<=3)
			 {
			    temp=input[middle];
			   input[middle]=input[low];
			   input[low]=temp;
			   middle++;
			   low++;
			 }
			else if(input[middle]>=4 && input[middle]<=10) 
			{
			middle++;
			}else
			{
			 temp =input[middle];
			 input[middle]=input[high];
			  input[high]=temp;
			 high--;
			}
		
	}

		System.out.println("Dutch flag="+Arrays.toString(input));
	}
	
	
	
	

}
