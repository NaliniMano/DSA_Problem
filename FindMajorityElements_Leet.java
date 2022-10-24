package dsaprogram_easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class FindMajorityElements_Leet {
	
	@Test
	public void example()
	{
		int[] nums= {3,2,3};
		findMajority(nums);
		//findMajority_twopointer(nums);

		
	}
	
	

	/****
	 * 1. sort the gvn array
	 * 2. store the element in map ie element ,no of occurance
	 * 3. retrieve the element  and having max count
	 * 
	 * 
	 * @param nums
	 */

	private void findMajority(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		
		int count=0;
		Map<Integer,Integer> hm =new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++)
		{
			
		  // hm.put(nums[i], hm.getOrDefault(hm.get(nums[i] +1 ), null))
		   hm.put(nums[i],hm.getOrDefault(nums[i],1));

		}
		System.out.println(hm);
		
	}
	/****
	 * 1. sort the gvn array
	 * 2. store the element in map ie element ,no of occurance
	 * 3. retrieve the element  and having max count
	 * 
	 * 
	 * @param nums
	 */

	
	
	
	private void findMajority_twopointer(int[] nums) {
		// TODO Auto-generated method stub
		
	}

}
