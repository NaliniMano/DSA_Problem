package hashmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.junit.Test;

public class FindCommonCharac {
	
/**
 * https://leetcode.com/problems/find-common-characters/
 * 
 * 	
 */
	//@Test
	public void example1()
	{
		String[] s = {"bella","label","roller"};
		commonChars(s);
		
	}

	
	@Test
	public void example2()
	{
		String[] s = {"cool","lock","cook"};
		commonChars(s);
		
	}
	
	
	
	
	
	public List<String> commonChars(String[] words) {

		List<String> matchList = new ArrayList<String>();
		HashMap<Character, Integer> ncount = new HashMap<Character, Integer>();
		for (int i = 0; i < words[0].length(); i++) {
			ncount.put(words[0].charAt(i), ncount.getOrDefault(words[0].charAt(i), 0) + 1);
		}

		for (int i = 1; i < words.length; i++) {
			HashMap<Character, Integer> updcount = new HashMap<Character, Integer>();
			for (int j = 0; j < words[i].length(); j++) {
				if (ncount.containsKey(words[i].charAt(j))) {
					updcount.put(words[i].charAt(j),
							// because previous word may contain min character("lock","cook")
							Math.min(ncount.get(words[i].charAt(j)), updcount.getOrDefault(words[i].charAt(j), 0) + 1));
				}

			}
			ncount = updcount;
		}

		for (Entry<Character, Integer> entry : ncount.entrySet()) {
			for (int i = 0; i < entry.getValue(); i++)
				matchList.add(String.valueOf(entry.getKey()));
		}

		System.out.println(matchList);
		return matchList;

	}
	/**
	 * 1. add first string in the list 
	 * 2. iterate the given string and compare element 
	 * 3. remove the element not matching
	 * 4. return the list
	 * 
	 * 
	 * @param s
	 */
private void findMatchPair(String[] s) {
	Arrays.sort(s);
	// TODO Auto-generated method stub
	ArrayList<String> li =new ArrayList();
	ArrayList<String> li2 =new ArrayList();
	char[] first  = s[0].toLowerCase().toCharArray();
    for(int k=0;k<first.length;k++)
    {
      li.add(Character.toString(first[k]));	
    }
	

	for(int i=1;i<s.length;i++)
	{
		char[] str  = s[i].toLowerCase().toCharArray();

		 for(int t=0;t<str.length;t++)
         {
        	 
        	 if(li.contains(Character.toString(str[t])))
        	
        	 {
        		 li2.add(Character.toString(str[t]));
             }
         }
		 li.retainAll(li2);
		System.out.println(li);
        li2.clear();
	}
	
	
	
System.out.println(li);
	
}

}
