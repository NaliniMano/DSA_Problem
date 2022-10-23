package slidding_wind;

import org.junit.Test;

public class FindMinimumRecolor_Leet {
	
	/**
	 * https://leetcode.com/problems/minimum-recolors-to-get-k-consecutive-black-blocks/
	 * 
	 */
	
	@Test
	public void exmaple1()
	{
	String blocks = "WBBWWBBWBW" ;
	int k = 7;
	findminimumflip(blocks,k);
	}

    @Test  
	public void exmaple2()
	{
	String blocks = "WBWBBBW" ;
	int k = 2;
	findminimumflip(blocks,k);
	}

	/**
	convert the string into char
	loop through first k element,find flips and store in min variable.
	loop thorugh k to end of char
	find the flip & compare with min
	return min vlaue


	**/


	public void findminimumflip(String blocks,int k)
	 {
	  
	   
	   int min=0;
	   int count=0;
	   //int start=0;
	   for(int i=0;i<k;i++)
	    {
		  if(blocks.charAt(i)=='W') {
		    count++;
		    }
		}
		min =count;
		
		for(int j=k;j<blocks.length();j++)
		{
		  if(blocks.charAt(j-k)=='W')count--;
		  if(blocks.charAt(j)=='W')count++;
		  min=Math.min(count,min);
			
		}
		
		System.out.println(min);
	 
	  }

}
