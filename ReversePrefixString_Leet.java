package hwprogram;

import org.junit.Test;

public class ReversePrefixString_Leet {
	/************
	https://leetcode.com/problems/reverse-prefix-of-word/

	***************/
	@Test //positive
	public void example1()
	{
	 String word ="abcdefghij";
	 char c='d';
	 findReversePrefix(word,c);
	}

	@Test //Edge
	public void example2()
	{
	 String word ="abcdefghij";
	 char c='m';
	 findReversePrefix(word,c);
	}

	@Test //negative
	public void example3()
	{
	 String word ="c";
	 char c='c';
	 findReversePrefix(word,c);
	}
/**
 * 1. using substring 
 * 
 * @param word
 * @param c
 * @return
 */
	public String findReversePrefix(String word,char c)
	{
	  String start=word.substring(0,word.indexOf(c)+1);
	String end=word.substring(word.indexOf(c)+1,word.length());
	  StringBuffer bf =new StringBuffer(start);
	  bf.reverse();
	  bf.append(end);
	  System.out.println(bf.toString());
	  return bf.toString();
	}

}
