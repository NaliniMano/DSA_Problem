package day7;

import org.junit.Test;

public class Equivalent_Domino_MatrixProb {
	
	@Test
	public void example() {
      int nums[][]= {{1,2},{1,2},{1,1},{1,2},{2,2}};
	//	int[][] nums= {{1,2},{3,4},{5,6},{1,2}};
	findequivalentpairs(nums);
	}

	/**
	 * Brute force
	 * 
	 * 1. use outer(0 to lenght of array) and inner loop(1 to length of array) through the element in the array
	 * 2. compare the outer element with inner element such that a==c &b ==d  or a==d && b==c 
	 * 3. increment the count and return it
	 * 
	 * @param nums
	 */
	private void findequivalentpairs(int[][] nums) {
		// TODO Auto-generated method stub
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
        	for(int j=i;j<nums.length;j++)
        	{
        	   if(i!=j)
        	   {
        			//System.out.println(nums[i][0]+","+nums[i][1]+"="+nums[j][0]+","+nums[j][1]);
        			if((nums[i][0] ==nums[j][0]  && nums[i][1] ==nums[j][1] )||(nums[i][0]==nums[j][1] && nums[i][1]==nums[j][0]))
        			{
        				count++;
        			}
        	   }
        		
        	}
        }
     System.out.println(count);
	}
}
