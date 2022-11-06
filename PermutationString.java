package day7;

import java.util.HashMap;

import org.junit.Test;

public class PermutationString {
	/**
	 * 
	 * 
	 * https://leetcode.com/problems/permutation-in-string/
	 */
    @Test
	public void example1()
	{
		String k ="ab";
		String s ="eidbaooo";
		findPermutationString(k,s);
	}
    
    @Test
    public void example2()
	{
		String k ="mn";
		String s ="abcdejk";
		findPermutationString(k,s);
	}

    /**
     * 
     * 1. Create two hashmap kmap,hmap
     * 2.  fill the  kmap with character of k string
     * 3.  intialize first window  : iterate upto s string upto 0 to k.length index and fill hmap
     * 4 .  if kmap matches hmap set the flag true
     * 5. Iterate through the string s length from (k to s.length)
     * 6 .add the current character to  hmap 
     * 7. remove the first element from hmap 
     *      check the value of first element if its more than one occurance  then decrement the value by 1.
     *            first elment occurance is 1 then remove that element from hmap.
     *            compare hmap equal to kmap  then set flag to true
     * 
     * 
     * 
     * @param k
     * @param s
     * @return
     */
	private boolean findPermutationString(String k, String s) {
		// TODO Auto-generated method stub
int start=0;
		
		HashMap<Character,Integer> kmap =new HashMap();
		HashMap<Character,Integer> hmap =new HashMap();
		boolean flag=false;
        if(s.length()< k.length()) { return false;}

		for(int i=0;i<k.length();i++)
		{
			kmap.put(k.charAt(i),kmap.getOrDefault(k.charAt(i), 0)+1);
		}
		
		for(int i=0;i<k.length();i++)
		{
			hmap.put(s.charAt(i), hmap.getOrDefault(s.charAt(i), 0)+1);
		}
		if(hmap.equals(kmap))
		{
			flag=true;
		}
		
		for(int j=k.length();j < s.length();j++)
		{
			//eidbaooo
			hmap.put(s.charAt(j), hmap.getOrDefault(s.charAt(j), 0)+1);
            
         //  System.out.println(hmap);
          // System.out.println(hmap.get(s.charAt(start)));
			if(hmap.get(s.charAt(start))>1)
                hmap.put(s.charAt(start), hmap.get(s.charAt(start))-1);
			else
			  hmap.remove(s.charAt(start));
			
				if(hmap.equals(kmap))
				{
					flag=true;
				}
		
			start++;
		}
		System.out.println(flag);
     return flag; 
		
		
	}
}
