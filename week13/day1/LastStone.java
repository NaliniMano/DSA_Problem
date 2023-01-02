package hwprogram;

import java.util.Arrays;

import org.junit.Test;

public class LastStone {
	
	//https://leetcode.com/problems/last-stone-weight/submissions/
	@Test
	public void example1()
	{
		int[] stones = {2,7,4,1,8,1};
		lastStoneWeight(stones);
	}
	
	  public int lastStoneWeight(int[] stones) {
		    
	        int len=stones.length;
	                                               
	        while(len > 1)
	        {
	            Arrays.sort(stones);
	           if(stones[len-1] == stones[len-2])  
	               len=len-2;
	           else
	           {
	             stones[len-2]=stones[len-1]-stones[len-2];
	               len=len-1;
	           }
	        }
	       
	        if(len==1) return stones[0];
	        
	     return 0;   
	    }

}
