package hashmap;

import java.util.HashMap;

import org.junit.Test;

public class Isomorphic_Strings_Leet {
	
	//@Test
	public void example1()
	{
		String s ="egg";
		String t= "add";
		findIsomorphicStr(s,t);
	}
	
	@Test
	public void example2()
	{
		String s ="foo";
		String t= "cat";
		boolean x =findIsomorphicStr(s,t);
		System.out.println(x);
	}
	/* Psuedo code
	 * 1) Create 2 Map
	 * 2) Map the string as key to the pattern as value
	 * 3) Map the pattern as key to the string as key
	 * 4) Compare both
	 * 		a) If there is no entry on both --> Create entry for both
	 * 		b) If there is an entry in one of these --> Compare both ; if either one does not match --> return false !!
	 * 
	 * smap    tmap
	 * k  v    K  V
	 * e  a    a  e
	 * g  b    d  

       f  c    
	 * 0  a
	 */

	private boolean findIsomorphicStr(String s, String t) {
		// TODO Auto-generated method stub
		HashMap<Character,Character> smap =new HashMap();
		HashMap<Character,Character> tmap =new HashMap();
		
		if(s.length()!=t.length()) { return false;}
		for(int i=0;i<s.length();i++)
		{
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			if(!smap.containsKey(c2) && !tmap.containsKey(c1))
			{
				smap.put(c1, c2);
				tmap.put(c2,c1);
				
			}else if(!smap.containsKey(c2) && tmap.containsKey(c1)) return false;
			else if(smap.containsKey(c2) && !tmap.containsKey(c1)) return false;
		}
		System.out.println(smap);
		System.out.println(tmap);
		return true;
		
	}

	
}
