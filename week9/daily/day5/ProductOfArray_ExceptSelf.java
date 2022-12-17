package week9.daily.day1;

import java.util.Arrays;

import org.junit.Test;

public class ProductOfArray_ExceptSelf {
	
	@Test
	public void example1()
	{
	int[] nums= {1,2,3,4};
	findProdOfArray(nums);
	}

	private void findProdOfArray(int[] nums) {
		// TODO Auto-generated method stub
		   int [] output =new int[nums.length];
	        int [] temp1 =new int[nums.length];
	      
	        int [] temp2 =new int[nums.length];
	        
	        temp1[0] =1; temp2[nums.length-1] =1;
	        
	        for(int i=0;i<temp1.length-1;i++)
	        {
	            temp1[i+1]=nums[i] * temp1[i];
	            
	        }
	        
	        
	        for(int j=temp2.length-1;j>0;j--)
	        {
	            temp2[j-1]=nums[j] * temp2[j];
	            
	        }
	      
	        
	        for(int m=0;m<temp1.length;m++)
	        {
	            output[m]=temp1[m]* temp2[m];
	        }
	            System.out.print(Arrays.toString(output));
	}

}
