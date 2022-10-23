package hwprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ReverseOnlyVowel {
	/*****************
	https://leetcode.com/problems/reverse-only-letters/

	***************/
	@Test //positive
	public void example1()
	{
	 String word ="hello";
	 reverseOnlyVowel(word);
	// reverseOnlyVowel_twopointer(word);
	}
   @Test //Edge
	public void example2()
	{
	 String word ="leetcode";
	 reverseOnlyVowel(word);
	 reverseOnlyVowel_twopointer(word);
	}

	//@Test //negative
	public void example3()
	{
	 String word ="bcde";

	 reverseOnlyVowel_twopointer(word);
	 char c='b';
	 int y=c;
	System.out.println(y);
	}

	
	/***
	 * Brute -Force
	 * loop through character of string
	 * if character Vowel store in string
	 * add character to list
	 * iterate the list
	 * repalce 
	 * 
	 * @param word
	 */
	private void reverseOnlyVowel(String word) {
		// TODO Auto-generated method stub
		StringBuffer output= new StringBuffer(word);
		List<Character> li =new ArrayList<Character>();
		
		String vowel="";
		char ch;
		for(int i=0;i<word.length();i++)
		{
			ch=word.charAt(i);
			if(isVowel(ch))
			{
				vowel+=ch;
			}
			li.add(ch);
		}
		  
		
	int j=vowel.length()-1;
    for(int k=0;k<li.size();k++)
	   {
		   
		  if(isVowel(li.get(k)))
		  { 
		   li.set(k,vowel.charAt(j--) ) ;
		  }
	   }
	  System.out.println(li);
		
	}
	
	private void reverseOnlyVowel_twopointer(String word) {
		// TODO Auto-generated method stub
		char[] ch = word.toCharArray();
		int left = 0, right = ch.length-1;
		
		while(left < right) {
			if(isVowel(ch[left]) && isVowel(ch[right])) {
				char temp = ch[left];
				ch[left++] = ch[right];
				ch[right--] = temp;
			} else if(isVowel(ch[left])) {
				right--;
			} else {
				left++;
			}
		}
		System.out.println(Arrays.toString(ch));
		
	}
	
	
	public boolean isVowel(char c)
	{
		boolean flag =false;
		if(c=='a' ||c=='e' || c=='i'||
				c=='o'||c=='u' || 
				c=='A' ||c=='E' ||
				c=='I'|| c=='O' || 
				c=='U'||c=='u'  )
		{
			flag=true;
		}
		return flag;
	}

}
