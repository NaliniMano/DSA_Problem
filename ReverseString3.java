package hwprogram;

import java.util.Arrays;

import org.junit.Test;

public class ReverseString3 {

	/**


	**/


	@Test //positive
	public void example1(){

	String s="Hello World";
	findReverseString(s);

	}
//	@Test //edge
	public void example2(){

	String s="Hello Worl'd";
	findReverseString(s);


	}
	//@Test //negative
	public void example3(){
	String s="S";
	findReverseString(s);

	}

	/**

	Brute force

	1. split string and store in String array
	2. traverse through the string array
	3.  Reverse string using in build method
	4.  return the output array


	Two Pointer
	1. Split string and store in array
	2. set two pointer p1=0,p2=size of the string;
	3. loop through until p1 < = p2
	4. return reversed string


	***/

	public String findReverseString(String s)
	{
	   String[] st =s.split(" ");
	 
	 
	   int p1=0,p2;
	   String output="";
	   char temp;
	   for(int i=0;i<st.length;i++)
	   {
	     
	     char[] ch=st[i].toCharArray();
		 p1=0;
		 p2=st[i].length()-1;
	     while(p1<p2)
		  {
	    		
				temp = ch[p1];
				ch[p1] = ch[p2];
				ch[p2] = temp;

			p1++;
			p2--;
		  }
	    
	    output=output+new String(ch) +" ";
	    
	   }
	   System.out.println(output.trim());
	    return output.trim();

	}
}
