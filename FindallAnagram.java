package day7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;

public class FindallAnagram {
	
	/**
	 * 
	 * https://leetcode.com/problems/find-all-anagrams-in-a-string/
	 */
 //  @Test
	public void example1()
	{
		String s="cbaebabacd";
		String k="abc";
		findallAnagram(s,k);
		
	}
    
    @Test
   	public void example2()
   	{
   		String s="abab";
   		String k="ab";
   		findallAnagram(s,k);
   		
   	}
	
	/**1) Create Hashmap for s, k
	 * 2) store the string K  in the map 
	 * 3) loop through the String s till last index
	 * 		 Get first 3 characters and fill the map
	 * 4)  compare both map
	 *  5) if it matched return start index of  the map add to list
	 *  6) repeat the step 3,4,5
	 *  7 return the list
	
**/
	private void findallAnagram(String s, String k) {
		// TODO Auto-generated method stub
	
		HashMap<Character,Integer> kmap =new HashMap();
		HashMap<Character,Integer> smap =new HashMap();
		List<Integer> li =new ArrayList();
		for(int i=0;i<k.length();i++)
		{
			kmap.put(k.charAt(i),kmap.getOrDefault(k.charAt(i), 0)+1);
		}
		
		for (int i = 0; i <= s.length()-k.length(); i++) {
		  for(int j= i;j<k.length()+i;j++) {
			  //System.out.println(s.charAt(j));
			  smap.put(s.charAt(j), smap.getOrDefault(s.charAt(j), 0)+1);
		  }
		  System.out.println(smap);
		  if(kmap.equals(smap)) {
				//System.out.println("Matches");
				li.add(i);
			}
			smap.clear();
			
	   }
	}
	
	/*
	 * 1) intialize the first window
	 * 2) 
	 * 
	 * 
	 * 
	 * 
	 */
	public void findAnagram_optimised(String s ,String k)
	
	{
		int start=0;
		String temp="";
		HashMap<Character,Integer> kmap =new HashMap();
		
		for(int i=0;i<k.length();i++)
		{
			kmap.put(k.charAt(i),kmap.getOrDefault(k.charAt(i), 0)+1);
		}
		
		for(int i=0;i<s.length();i++)
		{
			temp=temp+s.charAt(i);
		}
		
	
	}
}
