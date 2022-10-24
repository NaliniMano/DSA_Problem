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
	findmaxnoofvowelsubstring_slid_window(name,k);
	}

	@Test //postive
	public void example2()
	{
	String name ="bcdfghk";
	int k=3;
	findmaxnoofvowelsubstring_brute(name,k);
	findmaxnoofvowelsubstring_slid_window(name,k);
	}
	
	@Test //postive
	public void example3()
	{
	String name ="e";
	int k=1;
	findmaxnoofvowelsubstring_brute(name,k);
	findmaxnoofvowelsubstring_slid_window(name,k);
	}
	
	@Test //postive
	public void example4()
	{
	String name ="aaaaabbbbbbbccccccccciiiiiiii";
	int k=10;
	findmaxnoofvowelsubstring_brute(name,k);
	findmaxnoofvowelsubstring_slid_window(name,k);
	}
	/**
	bruteforce:
	1. loop throgh length of array
	2. find the substring and count vowels  
	3. compare and return the maximum

//workaattech
	**/
	public int findmaxnoofvowelsubstring_brute(String name,int k)
	{
	 int max=Integer.MIN_VALUE;
	 String temp = "";
	 int count=0;
	 for(int i=0;i<name.length()-k;i++)
	  {
		 
	      temp=name.substring(i,i+k);
	 
		  for(int j=0;j<temp.length();j++)
		   {
		      if(isVowel(temp.charAt(j)))
			  {
			  count++;
			  }
		      
		      
		   }
	  

		  max=Math.max(max,count);
		  count=0; 
		  
		  
	  }
	 
	 
	  return max;

	}
	
	/**
	 * traverse to k element in name string and count number of vowels and set to maximum
	 * using loop traverse from k to length of string
	 * add element to the end of window
	 * remove the first element from the window
	 * count the vowels and find maximum
	 * repeat until end of array
	 * return max value
	 * 
	 * 
	 */
	public int findmaxnoofvowelsubstring_slid_window(String name,int k)
	
	{
		
		int start=0,max=Integer.MIN_VALUE,count=0;
		String temp="";
		for(int i=0;i<k;i++)
		{
		 if(isVowel(name.charAt(i))) count++;
		}
		
		max=Math.max(max, count);
		
		//start++;
		for(int j=k;j<name.length();j++)	
		{
			temp=name.substring(start,k+1);
					if(isVowel(name.charAt(start))) count--;
			            if(isVowel(temp.charAt(temp.length()-1))) count++;
           
			start++;
			k++;
			max=Math.max(max, count);

		}
		System.out.println("max="+max);
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
