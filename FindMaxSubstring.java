package dsaprogram_easy;

import org.junit.Test;

public class FindMaxSubstring {
	/**
	from RajaPrabhu to everyone in this session:    2:38 PM
	Given a string s and a number k, find the maximum number of vowels in substring of size k.
	String: "workaattech"
	k: 3
***/
	@Test //postive
	public void example1()
	{
	String name ="workaattech";
	int k=3;
	findmaxnoofvowelsubstring_brute(name,k);
	}


	/**
	bruteforce:
	1. loop throgh length of array
	2. find the substring and count vowels  
	3. compare and return the maximum


	**/
	public int findmaxnoofvowelsubstring_brute(String name,int k)
	{
	 int max=Integer.MIN_VALUE;
	 String temp = "";
	 int count=0;
	 for(int i=0;i<name.length()-3;i++)
	  {
		 
	      temp=name.substring(i,i+3);
		  for(int j=0;j<temp.length();j++)
		   {
		      if(isVowel(temp.charAt(j)))
			  {
			  count++;
			  }
		   }
		   
		   max=Math.max(max,count);
		  
	  }
	 
	 
	 System.out.println(max);
	  return max;

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
