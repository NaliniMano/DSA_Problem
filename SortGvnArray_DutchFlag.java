package slidding_wind;

import java.util.Arrays;

import org.junit.Test;

public class SortGvnArray_DutchFlag {
	
	@Test
	public void example1()
	{
	  int[] nums= {1,2,0,1,2};
     // doSortDutchFlag(nums);
	  doSortDutchFlag_desc(nums);
	  
	}
	
	 private int[] bruteForce(int[] input){
	        int[] output = new int[input.length];
	        int index =0;
	        for(int i : new int[]{0,1,2}){
	            for( int j =0; j < output.length; j++){
	                if(input[j] == i) output[index++] = i;
	            }
	        }
	        return output;
	    }


	private void doSortDutchFlag(int[] input) {
		// TODO Auto-generated method stub
		int low=0,middle=0,high=input.length-1;
		int temp;
		while(middle <= high)
		{
			
			if(input[middle]==0)
			 {
			    temp=input[middle];
			   input[middle]=input[low];
			   input[low]=temp;
			   middle++;
			   low++;
			 }
			else if(input[middle]==1) 
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
		System.out.println(Arrays.toString(input));
	}
	
	private void doSortDutchFlag_desc(int[] nums) {
		// TODO Auto-generated method stub
		String k="abc";
	System.out.println(k.codePointAt(1));

int low=0,middle=0,high=nums.length-1;

		int temp;
		while(middle <= low)
		{
			
			if(nums[middle]==2)
			 {
			    temp=nums[middle];
			   nums[middle]=nums[low];
			   nums[low]=temp;
			   middle++;
			   low++;
			 }
			else if(nums[middle]==1) 
			{
			middle++;
			}else
			{
			 temp =nums[high];
			 nums[high]=nums[middle];
			  nums[middle]=temp;
			 high--;
			}

		}
		System.out.println(Arrays.toString(nums));
		
	}

	
}
