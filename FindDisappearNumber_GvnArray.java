package essyprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class FindDisappearNumber_GvnArray {
	/**
	 * 
	 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
	 */
	@Test
	public void example()
	{
		int[] nums= {4,3,2,7,8,2,3,1};
		findDisapperNumber(nums);
	}
	
	//@Test
	public void example2()
	{
		int[] nums= {1,1};
		findDisapperNumber(nums);
	}

	/*
	 * 1.sort the array
	 * 2. store the sorted array into set
	 * 3. loop through array
	 * 4. compare the element in set
	 * 5. when no match add into the list
	 * 
	 */
	private void findDisapperNumber(int[] nums) {
		// TODO Auto-generated method stub
      
       HashSet<Integer> hs =new HashSet();
       List<Integer> li=new ArrayList();
       for(int i=0;i<nums.length;i++)
       {
    	   hs.add(nums[i]);
       }
     //  System.out.println(hs);
       for(int j=1;j<=nums.length;j++)
       {
    	   if(!hs.contains(j))
    	   {
    		   li.add(j);
    	   }
       }
       System.out.println(li);
		
	}

}
