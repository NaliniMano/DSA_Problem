package hwprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class MaximumProd_Brute {
	
	//https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/
	
	@Test
	public void postive_scenario(){
		int[] nums={3,4,5,2};
		findmaxproduct_twopointer(nums);
		Assert.assertEquals(findmaxproduct(nums), 12);
		}

	
	@Test
		public void negative_scenario(){
		int[] nums={1};
		findmaxproduct(nums);
		Assert.assertEquals(findmaxproduct(nums), 0);
		}
	@Test
		public void edge_scenario(){
		int[] nums={1,2,1,2};
		findmaxproduct_twopointer(nums);
		Assert.assertEquals(findmaxproduct(nums), 1);


		}

		/***
		2.assign maximum number = Integer.minium number
		1.traverse through the loop 0 to lastindex
		2. create inner loop through 1 1 to lastindex
		3. calculate, prod= (num[i]-1) * (nums[j]-1)
		4  if(prod > maximum) print the index
		  
		  
		Two pointer
		
		  1. sort the gvn array
		     
		  2. intialize p1=0 p2=1;
		  3. loop thr p2< array length
		  4. calcualte prod 
		  5. compare prod with max value
		  6  return the max
		  

		***/
	
	
		private int findmaxproduct(int[] nums) {
			// TODO Auto-generated method stub
		 
			int max=Integer.MIN_VALUE,prod=1;
			if(nums.length< 2 )  { 
				//System.out.println("No I");
				return 0;
			}
				
			else{
			for(int i=0;i<nums.length;i++)
			{
			for(int j=i+1;j<nums.length;j++)
			 {
			    prod=(nums[i]-1)*(nums[j]-1);
				if(prod>max)
				{
				max=prod;
				}
			  }

			}

			//System.out.println("maxvalue ="+max);
			return max;
		}
			
	  			
		
}
		public int findmaxproduct_twopointer(int[] nums)
		
		  {
	        Arrays.sort(nums);
			int p1=0,p2=1;
			int prod=0;
			int max=Integer.MIN_VALUE;
			while(p2<nums.length)
			{
				prod=(nums[p1]-1)*(nums[p2]-1);
				if(prod>max) {
					max=prod;
				}
				
				p1++;
				p2++;
			}
			  System.out.println(max);
			  return max;
		  }

		
		
}