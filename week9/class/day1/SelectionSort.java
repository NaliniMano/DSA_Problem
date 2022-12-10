package week9;

import java.util.Arrays;

import org.junit.Test;

public class SelectionSort {
	
	//@Test
	public void example1()
	{
		int[] nums= {3,1,5,8,4,2};
		doSortArr(nums);
		//doSortArr_twopointer(nums);
	}
	
	

	@Test
	public void example2()
	{
		int[] nums= {3,1,5,8,-4,-2};
		//doSortArr_Bubble(nums);
		doSort_SelectionSort(nums);
	}

	private void doSort_SelectionSort(int[] nums) {
		// TODO Auto-generated method stub
		
		int pivot=0, i;
		for( i=0;i<nums.length-1;i++)
		{
		   if(nums[i]>nums[i+1])
		   {
			   int temp = nums[i];
			   nums[i]=nums[i+1];
			   nums[i+1]=temp;
		   }
		   
		   pivot=i;
			for(int j=pivot;j>0;j--)
			{
				if(nums[j]<nums[j-1])
				{
				int temp2 = nums[j-1];
				nums[j-1]=nums[j];
				nums[j]=temp2;
				}
			}
		}
		
		 System.out.println(Arrays.toString(nums));
	}



	// time complex-> o[n^2]
	private void doSortArr(int[] nums) {
		// TODO Auto-generated method stub
	
		 for(int i=0;i<nums.length;i++)
		 {
			 for(int j=i+1;j<nums.length;j++)
			 {
				 if(nums[i] > nums[j])
				 {
					 int temp =nums[i];
					 nums[i]=nums[j];
					 nums[j]=temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(nums));
		
	}
	
	
	
	private void doSortArr_Bubble(int[] nums) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<nums.length;i++)
		 {
		  for(int j=0;j<nums.length-i-1;j++)
		   {
		      if(nums[j] > nums[j+1])
			  {
			    int temp =nums[j];
				nums[j]=nums[j+1];
				nums[j+1]=temp;
			  }
		   }
		 }
	  System.out.println(Arrays.toString(nums));
	  
	  /**
	  for(int i=0;i<nums.length;i++)
		 {
		  for(int j=1;j<nums.length-i;j++)
		   {
		      if(nums[j-1] > nums[j])
			  {
			    int temp =nums[j];
				nums[j]=nums[j-1];
				nums[j-1]=temp;
			  }
		   }
		 }
	  System.out.println(Arrays.toString(nums));
	  ****/
		
	}
	

}
