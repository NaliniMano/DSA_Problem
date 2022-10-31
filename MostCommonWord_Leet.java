package hashmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

import org.junit.Test;

public class MostCommonWord_Leet {
	
	
	//Input: paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.", banned = ["hit"]

	 @Test
	public void example()
	{
		String para="Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned={"hit"};
		findmostcommon(para,banned);
		
		
	}
	 
	 @Test
	 public void example2()
		{
			String para="Bob";
			String[] banned={"j"};
			findmostcommon(para,banned);
			
			
		}
	 
	 @Test
	 public void example3()
		{
			String para="Bob 123  then 123 to 567 123 123 567 567";
			String[] banned={"Bob"};
			findmostcommon(para,banned);
			
			
		}

	private void findmostcommon(String para, String[] banned) {
		// TODO Auto-generated method stub
		 String output="";
	        HashMap<String,Integer> hmap =new HashMap();
	     String[] p = para.toLowerCase().replaceAll("[^a-zA-Z0-9\\s+]", "").split("\\ |\\s+|\\!|\\?|\\'|,|\\;|\\.");
         System.out.println(Arrays.toString(p));
	        for(int i=0;i<p.length; i++)
	              { 
	                  hmap.put(p[i], hmap.getOrDefault(p[i],0)+1);
	                  
	              }
	            
	        for (int j=0;j<banned.length;j++)
	        {
	        	hmap.remove(banned[j]);
	        }
	        System.out.println(hmap);
	        
	      int maxValueInMap = (Collections.max(hmap.values()));
	        //System.out.println(maxValueInMap);
	                //for (Entry<Integer, Integer> entry :

	          for (Entry<String, Integer> entry :
	               hmap.entrySet()) {
	            if(entry.getValue()==maxValueInMap)
	            {
	                output=entry.getKey();
	            }
	        }
	    
	       System.out.println(output);
	}

}
