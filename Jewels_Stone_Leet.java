package hashmap;

import java.util.HashMap;

public class Jewels_Stone_Leet {
	/**
	 * 
	 * https://leetcode.com/problems/jewels-and-stones/description/
	 * 
	 */

	public void example1()
	{
		String jewel="aA";
		String stone="aAAbbbb";
		numJewelsInStones(jewel,stone);
	}

	private int numJewelsInStones(String jewels, String stones) {
		// TODO Auto-generated method stub
		 int count=0;
	        
	        HashMap<Character,Integer> hMap = new HashMap();
	        for(int i=0;i<stones.length();i++)
	        {
	           
	            hMap.put(stones.charAt(i), hMap.getOrDefault(stones.charAt(i), 0)+1);

	        }
	        
	       
	        for(int j=0;j<jewels.length();j++)
	        {
	            
	            if(hMap.containsKey(jewels.charAt(j)))
	            {
	        
	                count=count+hMap.get(jewels.charAt(j));
	            }
	           
	        }
	                 return count;   
	        }
	  
	}

