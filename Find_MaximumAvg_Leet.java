package slidding_wind;

import org.junit.Test;

public class Find_MaximumAvg_Leet {
	
	@Test
	public void exmaple1()
	{
	int[] nums ={1,5,2,3,7,1};
	int target=3;
	findmaxavg(nums,target);
	}

	private double findmaxavg(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		  double max= Double.MIN_VALUE;
	        int p1=0;
	        double avg=0.0;
	        double sum=0.0;
	        
	       
	        for(int i=0;i<k;i++)
	        {
	            sum+=nums[i];
	        }
	        avg=sum/k;
	        max=avg;
	        for(int j=k;j<nums.length;j++)
	        {
	            sum=sum+nums[j];
	            sum=sum-nums[p1++];
	            avg=sum/k;
	            max=Math.max(avg,max);
	            
	        }
	        System.out.println(max);
	        return max;
		
	}


}
