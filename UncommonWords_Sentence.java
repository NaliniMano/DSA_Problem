package week7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class UncommonWords_Sentence {
	
	@Test
	public void example1()
	{
		String s1="This is book";
		String s2="This is ball";
		findUncommonwords(s1,s2);
	}
	
	//@Test
	public void example2()
	{
		String s1="apple apple";
		String s2="banana";
		findUncommonwords(s1,s2);
	}

	/**
	 * 1. store the word  in  string array
	 * 2. fill the  2 map with word and its occurance
	 * 3. iterate through the map 
	 *       a) find the occurance of word =1
	 *       b) also check if the word does not present in another map then add to list
	 *             
	 * 4.  return the list
	 * 
	 * 
	 * @param s1
	 * @param s2
	 * @return 
	 */
	private String[] findUncommonwords(String s1, String s2) {
		
		
		// TODO Auto-generated method stub
		HashMap<String,Integer> hmap1 =new HashMap();
		HashMap<String,Integer> hmap2 =new HashMap();
		 List<String> output= new ArrayList<String>();
		

	    
	    String[] st1= s1.split(" ");
		for(int i=0;i<st1.length;i++)
		{
			hmap1.put(st1[i], hmap1.getOrDefault(st1[i], 0)+1);
		}
		
		String[] st2= s2.split(" ");
		for(int i=0;i<st2.length;i++)
		{
			hmap2.put(st2[i], hmap2.getOrDefault(st2[i], 0)+1);
		}
		
		for (Entry<String, Integer> entry : hmap1.entrySet()) {
			 if(entry.getValue()==1 && !hmap2.containsKey(entry.getKey()))
			 {
				 output.add(entry.getKey());
			 }
		}
		
		for (Entry<String, Integer> entry : hmap2.entrySet()) {
			 if(entry.getValue()==1 && !hmap1.containsKey(entry.getKey()))
			 {
				 output.add(entry.getKey());
			 }
		}
		
		String[] resultArr = new String[output.size()];
        for(int i = 0; i < output.size(); i++){
            resultArr[i] = output.get(i);
        }

        
        System.out.println(output);
		
        return resultArr;

     	}

	private  List<String> findoccurance(String s1)
	{

		HashMap<String ,Integer> hmap =new HashMap();
		List<String> li =new ArrayList<String>();
         //   String[] leastoccurance= new String[hmap.size];
		String[] s= s1.split(" ");
		for(int i=0;i<s.length;i++)
		{
			hmap.put(s[i], hmap.getOrDefault(s[i], 0)+1);
		}
		
	
		for (Entry<String, Integer> entry : hmap.entrySet()) {
		 if(entry.getValue()==1)
		 {
			 li.add(entry.getKey());
		 }
			
		}
		
		
		return li;
}
}
