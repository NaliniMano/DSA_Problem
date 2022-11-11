package day7;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class FirstUniqueCharacter {
	
	//@Test
	public void example1()
	{
		String s="leetcode";
		findUniqueChar(s);
	
	}
	
	
	@Test
	public void example2()
	{
		String s="loveleetcode";
		findUniqueChar(s);
	
	}
	/**
	 * Brute force
	 * 1. loop through given array
	 * 2. for current character check first index & last index matches
	 * 3. match found return first match the character
	 * 4. 
	 * 
	 * Time complexity -> O[n2]
	 * @param s
	 */

	private void findUniqueChar(String s) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length();i++)
		{
			int m =s.indexOf(s.charAt(i));
			int n =s.lastIndexOf(s.charAt(i));
		System.out.println(m+ ","+n);
			if(m==n) {
				System.out.println(s.charAt(i));
				break;
			}
			
		}
		
	}
	
	private int findUniqueChar_usingmap(String s) {
		  int output=-1;
			if(s.length()==0) return output;
			
	        Map<Character,Integer> hmap =new HashMap();
	        char[] str=s.toCharArray();
	        for(int i=0;i<s.length();i++)
	        {
	            hmap.put(str[i],hmap.getOrDefault(str[i],0)+1);
	        }
	               

	    for (Entry<Character, Integer> entry : hmap.entrySet()) {
	    	
	       if(entry.getValue() ==1)
	        {
	            output=s.indexOf(entry.getKey());
	            break;
	        }
	    } 
	    
	     return output;
	    
		
	}

}
