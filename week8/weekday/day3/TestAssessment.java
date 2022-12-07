package hkassessment2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestAssessment {
	
	
	@Test
	public void example1()
	{
	String[] words= {"aa","ab","abab","aabb"};
	findDups(words);
	}
	
	private void findDups(String[] words) {
		// TODO Auto-generated method stub
		List<Integer> li =new ArrayList();
		int[] output= new int[words.length];
		System.out.println(Arrays.toString(output));
		boolean bflag=false;
		for(int i=0;i<words.length;i++)
		{
			char[] ch =words[i].toCharArray();
			for(int j=0;j < ch.length-1;j++)
			{
				if(ch[j] == ch[j+1])
				{
					output[i]=1;
				    break;
				}
				
				
			}  
			System.out.print(bflag);
			
		}
	//	System.out.println(li);
		System.out.println(Arrays.toString(output));
	}

	@Test
	public void example2()
	{
		
		String input ="The quick brown fox jumps over the lazy dog";
		findPanagram(input);
	}
	
	private void findPanagram(String input) {
		// TODO Auto-generated method stub
		input=input.replace(" ","").toLowerCase();
		char[] ch =input.toCharArray();
		int count=0;
		boolean bflag =false;
		List<Integer> li =new ArrayList();
		int[] sarr = new int[26];
		for(int i=0;i<ch.length;i++)
		{
			
			    sarr[ch[i]-'a']++;
				//li.add(ch[i]-'a');
			
			
		}
		
		for(int i:sarr)
		{
			if(i==0)
			{
				System.out.println("Not Panagram");
				break;
			}
				
		}
	
	}

	@Test
	public void example3()
	
	{
		
	}

}
