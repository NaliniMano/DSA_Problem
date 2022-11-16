package day7;

import java.util.Arrays;

import org.junit.Test;

public class DIString {
	
	@Test
	public void example1()
	{
		String s="IDID";
		diStringMatch(s);
	}

	private void diStringMatch(String s) {
		// TODO Auto-generated method stub
        int[] output =new int[s.length()+1];
        int p1=0,p2=output.length-1;
        
        for(int i=0;i<s.length();i++)
        {
          if(s.charAt(i)=='I')  
          {
              output[i]=p1;
              p1++;
                  
          }else
          {
              output[i]=p2;
              p2--;
          }
        }
        output[output.length-1]=p1;
        System.out.println(Arrays.toString(output));
	
	}

}
