package week8.day4;

import org.junit.Test;

public class PivotIndex {
	
	@Test
	public void example1()
	{
		int[] nums= {1,7,3,6,5,6};
		findPivotIndex(nums);
	}

	private void findPivotIndex(int[] nums) {
		// TODO Auto-generated method stub
	    int wSum=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        
        for(int i=0;i<nums.length;i++)
        {
            wSum=wSum-nums[i];
            if(sum==wSum)
            {
            	System.out.println(i);
              //  return i;
            }
                wSum=wSum+nums[i];
                
        }
	}

}
