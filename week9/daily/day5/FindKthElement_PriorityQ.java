package week9.daily.day1;

import java.util.PriorityQueue;

import org.junit.Test;

public class FindKthElement_PriorityQ {

	@Test
	public void example1()
	{
		int[] nums = {3,2,1,5,6,4};
		int k = 2;
		findKthElement(nums,k);
		

	}

	private void findKthElement(int[] nums, int k) {
		// TODO Auto-generated method stub
		
		  PriorityQueue<Integer> pq =new PriorityQueue();
	        for(int i=0;i<nums.length;i++)
	        {
	            pq.add(nums[i]);
	            if(pq.size()> k)
	            {
	                pq.poll();
	            }
	        }
	     System.out.print(pq.poll()); 
		
	}
	
}
