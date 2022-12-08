package week8.day4;

import java.util.HashSet;

import org.junit.Test;

public class GreatestLowest_UpperCase {
	
	@Test
	public void example1()
	{
		String s ="lEeTcOdE";
		findGreatestLowestCase(s);
	}
/***	
	1. fill the character from given string in Set
    iterate the character Z to A reverse order
     check if the set contains character & its respective lowerCase
      when  match return Character as String

 ****/
	
	private String findGreatestLowestCase(String str) {
		// TODO Auto-generated method stub
		HashSet<Character> hs =new HashSet();
		for(char s : str.toCharArray())
		{
			hs.add(s);
		}
		
		for(char c ='Z';c>='A';c--)
		{
		if(hs.contains(c) && hs.contains(Character.toLowerCase(c)))
					{
			    System.out.println(c);
				  return ""+c;
					}
		}
		return "";
	}

	public void example2()
	{
		
	}


}
