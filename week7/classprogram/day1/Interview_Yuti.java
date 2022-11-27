package week7.class_day1;

import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class Interview_Yuti {
	@Test
	public void example1()
	 {
	 String s = "aaabbccaad";
	  findmodified(s);
	  }
	  
	  
	public void example2()
	 {
	 String s = "";
	  findmodified(s);
	  }
	  
	  public void example3()
	 {
	 String s = "ab$asdasd";
	  findmodified(s);
	  }
	  
	  /**
	  1. Declare hashmap
	  2. iterate throguh the hashmap add the character with occurance
	  3. add to output s
	  4. clear the map
	  
	  
	  
	  
	  
	  ***/
	  
	  public String findmodified(String s)
	   {
		//  aaabbccaad
	     HashMap<Character,Integer> hm =new HashMap();
		 char[] c=s.toCharArray();
		 String output="";
		 for(int i=0;i<c.length-1;i++)
		  {
		    if(c[i] == c[i+1])
			{
		    hm.put(c[i],hm.getOrDefault(c[i],1)+1);
			
			}else
			{
				System.out.println(hm +" "+c[i]+hm.get(c[i]));
			  output=output+c[i]+hm.get(c[i]);
			  hm.clear();
			}
			
		  }
		 System.out.println(output);
	     return output;
	   }

}
