package day7;

import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class FindUniqueSum {
	
	@Test
	public void example1()
	{
		int[] nums= {1,2,3,2};
		sumOfUnique(nums);
	}
	
	/**
	 * fil the map with element of  array Key -> number Value ->occurrence
	 * 
	 *iterate the map 
	 *  find the sum of number whose occurrence 1
	 * @param nums
	 */

	private void sumOfUnique(int[] nums) {
		// TODO Auto-generated method stub
		   HashMap<Integer,Integer> hs =new HashMap();
	        int sum=0;
	        for(int i :nums)
	        {
	            hs.put(i,hs.getOrDefault(i,0)+1);
	        }
	        
	        for(Entry<Integer,Integer> m : hs.entrySet())
	        {
	            if(m.getValue() ==1)
	            {
	                sum+=m.getKey();
	            }
	        }
	        System.out.println(sum);
	       // return sum;
	}

}
