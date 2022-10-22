package hwprogram;

import java.util.Arrays;

import org.junit.Test;

public class ReverseOnlyLetters_Leet {
	/************
	https://leetcode.com/problems/reverse-only-letters/

	***************/
	@Test //positive
	public void example1()
	{
	 String word ="ab-cd-efg*hij";

	 reverseOnlyLetters(word);
	}

	@Test //Edge
	public void example2()
	{
	 String word ="Test1ng-Leet=code-Q!";

	 reverseOnlyLetters(word);
	}

	@Test //negative
	public void example3()
	{
	 String word =":";

	 reverseOnlyLetters(word);
	}

	/***
	 *  two pointer approach
 intialize p1=0,p2=length of input string
1) traverse through the character in input string 
chek if char in p1 = ischarac && p2  = ischarac
     swap
	 else if char in p1 is character
	 decrement p2;
	 else
	 increment p1;122
	 *  
	 * 
	 * @param word
	 * @return
	 */
	public void reverseOnlyLetters(String s)
	{
	 char[] ch=s.toCharArray();
	 int p1=0,p2=s.length()-1;
	 char temp;
	 while(p1 < p2)
	 {
	  if(ischaracter(ch[p1]) && ischaracter(ch[p2]))
	   {
	    temp=ch[p1];
		ch[p1]=ch[p2];
		ch[p2]=temp;
		p1++;
		p2--;
	   }else if(ischaracter(ch[p1]))
	    {
		p2--;
		}else
		{
		p1++;
		}
	 
	 }
	 
	 System.out.println(Arrays.toString(ch));
	}

	public boolean ischaracter(char c)
	{
	  int ch=c;
	  boolean flag=false;
	  if(ch>=65 && ch<=122)
	   {
	   flag=true;
	   }
	   return flag;
	}
}
