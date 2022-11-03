package hashmap;

import java.util.HashMap;
import java.util.HashSet;

import org.junit.Test;

public class MorseCodeWord {
	/**
	 * https://leetcode.com/problems/unique-morse-code-words/description/
	 * 
	 * 
	 */
    @Test
	public void example1()
	{
		String[] word={"gin","zen","gig","msg"};
		findMorseCodeWord(word);
	}
    
    @Test
	public void example2()
	{
		String[] word={"a"};
		findMorseCodeWord(word);
	}
    /**
     * 1. add  morse code for 26 alphabet
     * 2. loop through the array
     * 3. convert the string to morsecode and store in hashset
     * 4. return the size of hashset
     * 
     * 
     * @param word
     */

	private void findMorseCodeWord(String[] word) {
		// TODO Auto-generated method stub
		HashSet<String>  hs =new HashSet();
		for(int i=0;i< word.length;i++)
		{
			String k=createcode(word[i]);
			hs.add(k);
		}
		System.out.println(hs.size());
	}
	
	public String createcode(String s) {
		String output="";
		HashMap<Character,String> hm =new HashMap();
		hm.put('a',".-");
		hm.put('b',"-...");
		hm.put('c',"-.-.");
		hm.put('d',"-..");
		hm.put('e',".");
		hm.put('f',"..-.");
		hm.put('g',"--.");
		hm.put('h',"....");
		hm.put('i',"..");
		hm.put('j',".---");
		hm.put('k',"-.-");
		hm.put('l',".-..");
		hm.put('m',"--");
		hm.put('n',"-.");
		hm.put('o',"---");
		hm.put('p',".--.");
		hm.put('q',"--.-");
		hm.put('r',".-.");
		hm.put('s',"...");
		hm.put('t',"-");
		hm.put('u',"..-");
		hm.put('v',"...-");
		hm.put('w',".--");
		hm.put('x',"-..-");
		hm.put('y',"-.--");
		hm.put('z',"--..");
		
		for(int i=0;i<s.length();i++)
		{
			output+=hm.get(s.charAt(i));
		}
		return output;
		
	}
}
