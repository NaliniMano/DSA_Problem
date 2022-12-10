package week9;

import java.util.Arrays;

import org.junit.Test;

public class InsertionSort {
	
	

	@Test
	public void example2()
	{
		int[] nums= {3,1,5,8,-4,-2};
		doInsertionSortArr(nums);
	}

	private void doInsertionSortArr(int[] nums) {
		// TODO Auto-generated method stub
		int min=0;
		for(int i=0;i<nums.length-2;i++)
		{
			min=i;
			
			for(int j=i+1;j<nums.length;j++)
			{
				if(nums[min]<nums[j]) min=j;
			}	
				int temp=nums[i];
				nums[i]=nums[min];
				nums[min]=temp;
			
		}
		System.out.println(Arrays.toString(nums));
	}
	
	

}
