package week8.sorting;

import org.junit.Test;

public class FindSquareroot_BinarySearch {
	
	@Test
	public void example1()
	{
		int x= 4;
		findSqrt(x);
	}
	
	@Test
	public void example2()
	{
		int x= 0;
		findSqrt(x);
	}
	
	@Test
	public void example3()
	{
		int x= 8;
		findSqrt(x);	
	}
	/**
		1. Declare left=0,right=given number
		2. iterate left less than right
		3. find the mid value
		4, if  mid ^2  less than given number 	left ->mid+1
		5. if mid^2 greater than given number right->mid-1
		6. if mid equal given number return mid
		7. return the min of left and right
			
      **/
	private int findSqrt(int x) {
		// TODO Auto-generated method stub
	    if(x < 2) return x;
	    
	          long left=1L,right=x;
	 
	        while(left <= right)
	            
	        {
	          long  mid=(left+right)/2;
	            
	            if(mid * mid < x)    left=mid+1;
	            else if(mid*mid > x) right=mid-1;
	            else
	                return (int)mid;
	        }
	    
	       int min=(int)Math.min(left,right);
	      return (int)min; 
	    
	}

}
