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
	
	
	@Test
	public void example1()
	{
		int[] nums= {3,2,3};
		findMajority(nums);
	}
	
	@Test
	public void example2()
	{
		int[] nums= {3,2,3,4,4,4};
		findMajority(nums);
	}

	/**
	 * 
	 * 
	 * @param nums
	 */
	private void findMajority(int[] nums) {
		// TODO Auto-generated method stub
		   HashMap<Integer,Integer> hmap =new HashMap();
		   int output=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
	        }
	    	      int maxValueInMap = (Collections.max(hmap.values()));
	    	      
	    	      for (Entry<Integer, Integer> entry :
		               hmap.entrySet()) {
		            if(entry.getValue()==maxValueInMap)
		            {
		                output=entry.getKey();
		            }
		        }
	    	      System.out.println(output);
	}

}
