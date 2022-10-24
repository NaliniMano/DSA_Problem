package dsaprogram_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class FindMaxConsecutive_Ones {
	
	@Test
	public void example()
	{
		int[] nums= {1,1,0,1,1,1};
		findmaxconsecutiveones(nums);
		
	}
	
	@Test
	public void example2()
	{
		int[] nums= {0,1,0,1,0,1,0};
		findmaxconsecutiveones(nums);
		
	}
	
	@Test
	public void example3()
	{
		int[] nums= {1,1,1,1,1,0,0,0};
		findmaxconsecutiveones(nums);
		
	}

	/**
	 * brute force
	 * 1. traverse through the input array
	 * 2. if the element = 1   count
	 * 3. if not continue to next iteration ,reset count,add the current count in list
	 * 4. sort the list and return the last index
	 * 
	 * 
	 * @param nums
	 */
	

	private void findmaxconsecutiveones(int[] nums) {
		// TODO Auto-generated method stub
		int count=0;
		List<Integer> li =new ArrayList<Integer>();
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1) count++;
			else
			{
			//	System.out.println("Else count="+count);
				li.add(count);
				count=0;
				continue;
			}
		}
		li.add(count);
		Collections.sort(li);
		System.out.println(li.get(li.size()-1));
		
	}

}
