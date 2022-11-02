package hashmap;

import java.util.Collections;
import java.util.HashMap;

import org.junit.Test;

public class Substring_Distinct_Char {
	
	/**
	 * https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/submissions/
	 * 
	 */
	
	@Test
	public void example1()
	{
		String s ="aababcabc";
		findDistinctSubString(s);
		findDistinctSubString_optimise(s);
	}
	
	@Test
	public void example2() {
		// TODO Auto-generated method stub
		String s ="xyzzaz";
		findDistinctSubString(s);
		findDistinctSubString_optimise(s);
	}

	//@Test
	public void example3()
	{
		String s ="ab";
		findDistinctSubString(s);
	}

	/**
	 * 1.loop through the last index of string
	 * 2. compare the first 3 element  not matching
	 *      increment the count
	 * 3. return the count
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 */
	private void findDistinctSubString(String s) {
		// TODO Auto-generated method stub
       
        int count = 0;
        for (int i = 0; i < s.length()-2; i++) {
        	
        	//System.out.println(s.charAt(i)+","+s.charAt(i+1)+","+s.charAt(i+2));
             if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2)) {
                count++;
            }
        }

		System.out.println(count);
	}
	/**
	 * Optimised
	 *   Declare variable start,count and hashmap
	 * 1. add first 3 element into hashmap and check size equal to 3 and increment the counter
	 * 2. loop through from 3 to length of string
	 * 3. add current element to hashmap
	 * 4. check occurance of start element greater then 1 decrement the value by 1
	 * 5.    else remove first element
	 * 6.  check the size equal to 3 increment the count
	 * 7.  increment the start variable
	 * @param s
	 * @return
	 */
   public int findDistinctSubString_optimise(String s) {
	   int count = 0;
       int start=0;
       if(s.length()<3) return 0;
      HashMap<Character,Integer> hs =new HashMap();
       for(int i=0;i<3;i++)
       {
           hs.put(s.charAt(i),hs.getOrDefault(s.charAt(i),0)+1);
           
       }
      if(hs.size()==3) count++;
       
       for(int j=3;j<s.length();j++)
       {
          
            hs.put(s.charAt(j),hs.getOrDefault(s.charAt(j),0)+1);
           if(hs.get(s.charAt(start))>1) hs.put(s.charAt(start),hs.get(s.charAt(start))-1);
           else
              hs.remove(s.charAt(start));
           if(hs.size()==3) count++;
           start++;
       }
   	System.out.println(count);
    return count;
	   
   }
   
}
