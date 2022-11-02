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
	}
	
	@Test
	public void example2()
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
             if (s.charAt(i) != s.charAt(i+1) && s.charAt(i+1) != s.charAt(i+2) && s.charAt(i) != s.charAt(i+2)) {
                count++;
            }
        }

		System.out.println(count);
	}
   public boolean uniquestring(String s) {
	   
	   
	return false;
	   
   }
   
}
