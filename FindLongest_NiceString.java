package slidding_wind;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindLongest_NiceString {
	
	/**
	 * https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
	 * 
	 */
	@Test
	public void example1()
	{
		String s="YazaAay";
		findNiceString(s);
	}

	
	@Test
	public void example2()
	{
		String s="bB";
		findNiceString(s);
	}
	
	@Test
	public void example3()
	{
		String s="c";
		findNiceString(s);
	}
	/**
	 * 1) Checking the character have ocurrance of upper/lower cases 
	 *    if no occurence replace the postion of character with *
	 *    split the string and store 
	 *    verify the character uppercase /lower case occurance 
	 *    return the substring having occurance
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 */
	
	
	private void findNiceString(String s) {
		// TODO Auto-generated method stub
		int k;
		for(int i=0;i<s.length();i++)
		{
			if(Character.isLowerCase(s.charAt(i)))
					{
				k=s.indexOf(Character.toUpperCase(s.charAt(i)));
					}
			else
			{
				k=s.indexOf(Character.toLowerCase(s.charAt(i)));
			}
			
			if(k<0)
				s=s.replace(s.charAt(i), ' ');
		}
       System.out.println(s);
       String[] temp=s.split(" ");
    
       String var="";
       StringBuffer sb =new StringBuffer();
       List<String> li =new ArrayList<String>();
       
       for(int j=0;j<temp.length;j++)
       {
    	   var=temp[j].trim();
    	   
    	   
    	   for(int p=0;p<temp[j].length();p++)
    	   {
    		  
    		   if(Character.isLowerCase(var.charAt(p)))
				{
			k=var.indexOf(Character.toUpperCase(var.charAt(p)));
				}
		else
		{
			k=var.indexOf(Character.toLowerCase(var.charAt(p)));
		}
    		  
		 if(k>=0)
		 {
			 sb.append(var.charAt(p));
		 }
			 
    	   }
    	   if(!sb.isEmpty())li.add(sb.toString()); 
       }
       
       
       System.out.println(li);
	}

}
