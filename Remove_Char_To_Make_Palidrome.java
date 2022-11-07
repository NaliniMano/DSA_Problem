package day7;

import org.junit.Test;

public class Remove_Char_To_Make_Palidrome {
	
	//@Test
	public void example1()
	{
		String s="maadagam";
		System.out.println(validPalindrome(s));
		
	}
	
	@Test
	public void example2()
	{
		String s="abc";
		//validPalindrome(s);
		System.out.println(validPalindrome(s));
		
	}
	
	@Test
	public void example3()
	{
		String s="abcdfba";
		//validPalindrome(s);
		System.out.println(validPalindrome(s));
		
	}
	
	/**
	 * 1) Declare two pointer left ->0,right->length-1
	 * 2) loop through until left cross right
	 * 3) check if the  left char not match with right
	 * 4)  increment  left 
	 * 
	 * 
	 * 
	 * 
	 * @param s
	 * @return
	 */

	private boolean validPalindrome(String s) {
		// TODO Auto-generated method stub
		
		 int left =0,right=s.length()-1;
	        
	        while(left<right){
	            
	            if(s.charAt(left)!=s.charAt(right)){
	            return (isValid(s,left+1,right) || isValid(s,left,right-1));
	            }
	            left++;
	            right--;
	        }
	       return true;
	}
	       
	   private boolean isValid(String s, int left, int right){
	           
	           while(left<right){
	               if(s.charAt(left)!=s.charAt(right)) return false;
	               left++;
	               right--;
	           }
	           
	           
	           return true;
	       }

		
	}


