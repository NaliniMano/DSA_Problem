package day7;

import org.junit.Test;

public class Maximum_No_ofVowels {
	
	@Test
	public void example1()
	{
		String s = "abciiidef";
		int k=3;
		findMaxVowels(s,k);
	}
	
	/**
	 * Slidding window
	 * 1 ) iterate through first k element 
	 *        check its vowel , increment counter
	 * 2) iterate from k to length of array
	 * 3)  add each character to temp string
	 * 4 ) if current character is vowel add the counter
	 * 5)  remove the first character  if its vowel decrement the counter 
	 * 6)  find max for each substring
	 * 7) return the mac
	 *     
	 * 
	 *  
	 * 
	 * @param s
	 * @param k
	 */

	private int findMaxVowels(String name, int k) {
		// TODO Auto-generated method stub
		
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
			//System.out.println(temp);
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
