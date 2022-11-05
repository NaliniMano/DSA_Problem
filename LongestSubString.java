package day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

public class LongestSubString {
	
	//@Test
	public void example1()
	{
		String s = "abcabcbb";
		findLongestSubString(s);
	}
	

	@Test
	public void example2()
	{
		String s = "pwwkew";
		findLongestSubString(s);
		findLongestSubString_optimise(s);
	}
	
	@Test
	public void example3()
	{
		String s = "";
		findLongestSubString(s);
		findLongestSubString_optimise(s);
	}
	
	/**
	 * Brute force
	 * 1. Use outer and inner loop traverse through the string
	 * 2. check if current character present in hashset
	 *       clear the set
	 *       break the current iteration
	 *     character not in set then add to set
	 *     add the character to list
	 *  3. iterate the list and return the maximum size substring
	 * 
	 * 
	 * @param s
	 * @return
	 */

	private int findLongestSubString(String s) {
		// TODO Auto-generated method stub
        if(s.length() == 1) return 1;
        if(s.length() < 1) return 0;
        		HashSet<Character> hs =new HashSet();
		List<String> li =new ArrayList();
		String t="";
		for(int i =0;i<s.length();i++)
		{
		 for(int j=i;j<s.length();j++)
		  {
			
		     if(hs.contains(s.charAt(j)))
			 {  
		     	 
			 hs.clear();
			    break;
				
			 }else
			 {
			 hs.add(s.charAt(j));
			 t=t+s.charAt(j);
			 }
		  }
		 li.add(t);
		 t="";
		 }
    // System.out.println(hs.size());
      
      int max=0;
      String temp="";
   for(int m=0;m<li.size();m++)
  	{
  	   temp=li.get(m);
  	   max=Math.max(max, temp.length());
  	}

     return max;  
	
	}
	/**
	 * 1) create Two pointers  left->0 , right-> 0
	 * 2) Create HashSet 
	 * 3) Right pointer move to every character and add to set
	 * 4) Check if that character exist in the set --> 
	 * 		a) reset your right with left
	 * 		b) clear your set
	
	 * @param s
	 * @return
	 */
	
	private int findLongestSubString_optimise(String s) {
		
		if(s.length()==1) return 1;
		if(s.length()<1) return 0;
		int left = 0, right = 0, max = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		while(right < s.length()) {
			if(set.add(s.charAt(right))) {
				max = Math.max(max, set.size());
				right++;
			} else {
				right =left++;
				set.clear();
			}
		}
		System.out.println(max);
		return max; 
		

	}
	
}
