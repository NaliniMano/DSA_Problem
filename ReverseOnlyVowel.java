package hwprogram;

import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyVowel {
	/*****************
	https://leetcode.com/problems/reverse-only-letters/

	***************/
	@Test //positive
	public void example1()
	{
	 String word ="hello";

	 reverseOnlyVowel_twopointer(word);
	}
   //Test //Edge
	public void example2()
	{
	 String word ="leetcode";

	 reverseOnlyVowel_twopointer(word);
	}

	@Test //negative
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
	 * loop throuth tge string
	 * check if the charac is vowel if vowel change it and store in output
	 * return output
	 * 
	 * 
	 * @param word
	 */
	private void reverseOnlyVowel(String word) {
		// TODO Auto-generated method stub
		StringBuffer output= new StringBuffer(word);
		output.reverse();
		word=output.toString();
	//	word.re
		/**
		char[] ch = new char[word.length()];
		int k=word.length()-1;

		
		for(int i=0;i<word.length();i++)
		{
			
			if(isVowel(word.charAt(i)))
			{
				ch[k]=word.charAt(i);
			}
			else
			{
				ch[i]=word.charAt(i);
			}
			
			System.out.println(Arrays.toString(ch));
		}
		***/
		
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
