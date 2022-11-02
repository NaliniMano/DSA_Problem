package hashmap;

public class FindInteger_ContainsDuplicate2 {
	
	public void example1()
	{
		int[] nums= {1,2,3,1};
		int k=3;
		findDuplicate(nums,k);
	}
	
	/**
	 * use outer and inner loop 
	 * compare outer element match with inner element and different of their index less than k
	 * return true
	 * 
	 * 
	 * @param nums
	 * @param k
	 */

	private void findDuplicate(int[] nums,int k) {
		// TODO Auto-generated method stub
		 boolean flag=false;
	        
	        for(int i=0;i<nums.length;i++)
	        {
	            for(int j=i+1;j<nums.length;j++)
	            {
	                if(nums[i]==nums[j]  && Math.abs(i-j)<=k)
	                {
	                  flag=true;   
	                }
	            }
	        }

	}

}
