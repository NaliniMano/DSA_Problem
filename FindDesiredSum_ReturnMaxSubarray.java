package slidding_wind;

import java.util.Arrays;

import org.junit.Test;

public class FindDesiredSum_ReturnMaxSubarray {
	
	@Test
	public void example1()
	{
		int[] nums= {1,7,4,3,1,2,1,5,1};
		int target=7;
	//	findmaxsubarray(nums,target);
		findmaxsubarray_slidingwindow(nums,target);
	}
	
	/***
	 * intialize sum=0
	 * outer loop intialize sum = element from the array & check if equal to target
	 * inner loop upto length of element
	 * add element from outer loop to element in the inner loop
	 * if the sum match target print index
	 *    sum< target continue the iteration
	 *    sum > target break 
	 *    
	 * 
	 * Time complexity -O[n2]
	 * Space -o[1]
	 * 
	 * 
	 * @param nums
	 * @param target
	 */

	private void findmaxsubarray(int[] nums, int target) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum=nums[i];
		    if(sum==target) System.out.println("index="+i);
			for(int j=i+1;j<nums.length;j++)
			{
				sum=sum+nums[j];
			    if(sum==target) {
			    	System.out.println("**sustring"+i+","+j);
			    }else if (sum<target) continue;
			    else break;
			   
				
			}
		}
	}
		
		/***
		 *1) intialize left=0,right=0
		 *loop until length of array
		 *2)add element and calculate sum
		 *3) if sum < target increment right(grow)
		 *4) sum>target increment left (shrink)
		  5)sum =target print index
		 *    
		 * 
		 * Time complexity -O[n]
		 * Space -o[1]
		 * 
		 * 
		 * @param nums
		 * @param target
		 */
		
		
	public void findmaxsubarray_slidingwindow(int[] nums,int target)
	{
		int left=0,right=0,sum=0;
		
		while(right < nums.length)
		{
			sum=sum+nums[right];
			
			while(sum > target)  {
				//sum=0;
				sum-=nums[left++];
			}
			if(sum==target) {
				System.out.println(left +"," +right);
				//left++;
				//right++;
				}
			right++;
			}	
		}
		
	}
	
	


