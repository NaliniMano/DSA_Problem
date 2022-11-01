package hashmap;

import java.util.HashSet;

import org.junit.Test;

public class ValidEmail_Leet {
	/***
	 * https://leetcode.com/problems/unique-email-addresses/
	 * 
	 * 
	 * 
	 */
	@Test
	public void example1()
	{
		String[] emails= {"test.email+alex+bob@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		findValidEmail(emails);
	}
	
	/**
	 * 1) split the string with delimiter "@" store in two variable local and domain
	 * 2)  check if local contains +  and ignore character after that
	 * 3)  if local contains . replace with empty character
	 * 4)  finally append the local and domain name and store in Set
	 * 5) return the size of the set
	 * 
	 * 
	 * 
	 * @param emails
	 */

	private int findValidEmail(String[] emails) {
		// TODO Auto-generated method stub
		HashSet<String> hs=new HashSet();
		for(int i=0;i<emails.length;i++)
		{
			String[] em=emails[i].split("@");
			String domain=em[1];
			String local =em[0];
			local=removechars(local);
			hs.add(local+"@"+domain);
		
		}
		return hs.size();
			
	}
	
	public String removechars(String s)
	{ 
		if(s.contains("+"))
		{
			int k =s.indexOf("+");
			s=s.substring(0,k);
		}
		
		s=s.replace(".","");
		return s;
	}

}
