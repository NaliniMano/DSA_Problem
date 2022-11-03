package hashmap;

import java.util.HashSet;
import java.util.Set;

public class Arithmetic_Triplet {
	/**
	 * 
	 * https://leetcode.com/problems/number-of-arithmetic-triplets/
	 */

	public void example1()
	{
		int[] nums= {0,1,4,6,7,10};
		int diff=2;
		arithmeticTriplets(nums,diff);
		
	}
	/**
	 * add given array to Hashset
	 * iterate through hashset
	 * check the hashset contains difference  match with current element -previous element
	 * 
	 * @param arr
	 * @param diff
	 * @return
	 */

	private int arithmeticTriplets(int[] arr, int diff) {
		// TODO Auto-generated method stub
		Set<Integer> hs=new HashSet<Integer>();
        int count=0;
        for (int val: arr)
        {
            hs.add(val);
        }
        
        for(int curr: hs)
        {
            if(hs.contains(curr+diff)  && hs.contains(curr-diff))
            {
                count++;
            }
        }
        return count;

	}
}
