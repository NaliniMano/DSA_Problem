package hwprogram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class LongPressed_LeetCode {
	
	/*
	 * Question here !!
	 * 
	 */

	//@Test // +ve
	public void example1() {
		 String name = "alex";
		 String typed = "aaleex";
		 isLongPressedName(name,typed);
		 
  
	}

	
	@Test // edge
		public void example21() {
		
		
		//"leelee"
		//"lleeelee"
		 String name = "leelee";
		 String typed = "lleeelee";
		 isLongPressedName(name,typed);
		}
	
	/***
	 * intailize boolean variable result= false
	 * use outer and inner loop 
	 *  compare char
	 *   if matches set result to true
	 *   return result
	 * ----------------------------
	 * 
	 * create map m1 and store the char of name
	 * create map m2 and store the char of typed
	 * travese through hashmap and compare the key & vlaues
	 *  if matche update result =true
	 * 
	 */
	private void isLongPressedName(String name, String typed) {
		// TODO Auto-generated method stub
		
		boolean result=false;
	    Map<Character,Integer> m1=new HashMap<Character,Integer>();
	    Map<Character,Integer> m2=new HashMap<Character,Integer>();
	    int count=1;
	    
	    for(int i=0;i<name.length();i++)
	    {

	      if(m1.containsKey(name.charAt(i)))
	    	{
		  
	  	       m1.put(name.charAt(i), m1.get(name.charAt(i))+1);
	    	
	    	}else
	    	{
	    		m1.put(name.charAt(i),count);
	    	}
	
	    }
	   
	    for(int i=0;i<typed.length();i++)
	    {

	     if(m2.containsKey(typed.charAt(i)))
	    	{
		  
	  	     m2.put(typed.charAt(i), m2.get(typed.charAt(i))+1);
	    		
	    	}else
	    	{
	    		m2.put(typed.charAt(i),count);
	    	}
	
	    }
	    
		
	
		for(int i=0;i<name.length();i++)
		{
			if(m1.get(name.charAt(i))< m2.get(name.charAt(i)))
			{
				result=false;
			}else
			{
				result=true;
			}
		}
		//System.out.println("Final"+result);
	}

	 public boolean isLongPressedName_twopointer(String name, String typed) {
	      boolean flag = false;
			int p1= 0;
			int p2 =0;
	        if(name.charAt(0)!=typed.charAt(0)){return flag;}
			while (p1<name.length() && p2<typed.length()) {
				if (name.charAt(p1)==typed.charAt(p2)) {
	                  
					p1++;
	                p2++;
	               
	                
				}else{
	                if(typed.charAt(p2)==name.charAt(p1-1))
	                 {
	                    p2++;
	                  }
	               else
	                 {
	                   return false;
	                 }
					
		          }
				
		}
	       
	        if(name.length()==p1 && typed.length()==p2) 
	        return true;
	        else if(p1 < name.length() && p2 ==typed.length())
	            return false;
	        else
	        {
	            while(p2 < typed.length())
	            {
	                 if(typed.charAt(p2)==typed.charAt(p2-1))
	                   p2++;
	                else return false;
	                    
	            }
	        }
	        
	        return true;
	    }
}
