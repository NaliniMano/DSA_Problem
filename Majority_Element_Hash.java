package hashmap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class Majority_Element_Hash {
	/**
	 * https://leetcode.com/problems/majority-element/submissions/
	 * 
	 * 
	 * 
	 */
	
	
	//@Test
	public void example1()
	{
		int[] nums= {3,2,3};
		findMajority(nums);
	}
	
	@Test
	public void example2()
	{
		int[] nums= {2,2,1,1,1,2,2};
		findMajority(nums);
	}

	/**
	 * loop through the array element
	 * add to hashmap Key -->element , Values ->occurrence
	 * check if the current element value more than length/2 then return the key
	 * 
	 * @param nums
	 */
	private int findMajority(int[] nums) {
		// TODO Auto-generated method stub
		   HashMap<Integer,Integer> hmap =new HashMap();
		  
	        for(int i=0;i<nums.length;i++)
	        {
	            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
	            if(hmap.get(nums[i])>nums.length/2) 
	            	{ System.out.println(nums[i]);
	            	return nums[i];
	            	}
	        }
	        return 0;
	}

}
