package practise.day1;

import org.junit.Test;

public class RotateArray {
	
	
	@Test
	public void example1()
	{
		int [] nums= {1,2,3,4,5,6,7};
		int k=3;
		doRotateArray(nums,k);
		
	}

	private void doRotateArray(int[] nums,int k) {
		// TODO Auto-generated method stub
	    
		 
        if(k>nums.length) k=k%nums.length;
        int temp = nums.length-k;
        int l1 =0,l2=temp-1;
        int r1 =temp,r2 =nums.length-1;
        int i=0,j=nums.length-1;
        swap(nums,l1,l2);
        swap(nums,r1,r2);
        swap(nums,i,j);
	}
	  public void swap(int[] nums,int n1,int n2)
	    {
	        while(n1<=n2)
	            {
	                int tr= nums[n1];
	                nums[n1]=nums[n2];
	                nums[n2]=tr;
	                n1++;
	                n2--;
	            }
	    }
}
