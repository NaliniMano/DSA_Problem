package week7.class_day1;

import org.junit.Test;

public class CheckWord_Occured_as_Prefix {

	/**
	 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
	 * 
	 */
	@Test
	public void example1()
	{
		String sentence="i love eating burger";
		String searchword="burg";
		findprefixWord(sentence,searchword);
		
	}

	private int findprefixWord(String sentence, String searchword) {
		// TODO Auto-generated method stub
		 String[] s = sentence.split(" ");
	        for(int i=0;i<s.length;i++)
	        {
	            if(s[i].length()>=searchword.length())
	            {
	                if(s[i].substring(0,searchword.length()).equals(searchword))
	                {
	                    return i+1;
	                }
	               
	            }
	        }
	      return -1;  

	}
}

