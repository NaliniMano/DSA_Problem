package hashmap;

import java.util.HashMap;

import org.junit.Test;

import junit.framework.Assert;

public class FindInteger_ContainsDuplicate2 {
	/**
	 * https://leetcode.com/problems/contains-duplicate-ii/
	 * 
	 * 
	 */
	
	@Test
	public void example1()
	{
		int[] nums= {1,2,3,1};
		int k=3;
	//	findDuplicate(nums,k);
		Assert.assertEquals(findDuplicate_optimise(nums,k), true);
		
	}
	
	
	@Test
	public void example2()
	{
		int[] nums= {1,0,1,1};
		int k=1;
	//	findDuplicate(nums,k);
		Assert.assertEquals(findDuplicate_optimise(nums,k), true);
		
	}
	
	@Test
	public void example3()
	{
		int[] nums= {1,2,3,1,2,3};
		int k=2;
	//	findDuplicate(nums,k);
		Assert.assertEquals(findDuplicate_optimise(nums,k), false);
		
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
	/**
	 * 1. iterate through length of array
	 * 2. check if map contains element of array & also check find difference between the current index and hashmap values less than K
	 *           return true
	 * 3. add element to hmap
	 * 
	 * 
	 * @param nums
	 * @param k
	 * @return
	 */
	
	public boolean findDuplicate_optimise(int[] nums,int k)
	{ boolean flag=false;
	  HashMap<Integer,Integer> hmap =new HashMap();
	  for(int i=0;i<nums.length;i++)
	  {
		  if( hmap.containsKey(nums[i])  && (Math.abs(i-hmap.get(nums[i]))<=k))
				  return true;
		  hmap.put(nums[i], i);
	  }
	  return false;
	}

}
