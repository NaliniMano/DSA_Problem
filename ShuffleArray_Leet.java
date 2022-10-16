

import java.util.Arrays;
import org.junit.Test;

public class ShuffleArray_Leet {
	

	/*
	 * Question here !!
	 * 
	 */

	@Test // +ve
	public void example1() {
    int[] nums= {2,5,1,3,4,7};
    int n=3;
    doshufflearray(nums,n);
	}

	

	@Test // edge
	public void example2() {
		int[] nums= {2,5,4,3,7,8,9};
		int n=4;
	    doshufflearray(nums,n);

	}

	@Test // negative
	public void example3() {
		int[] nums= {1};
		int n=1;
	    doshufflearray(nums,n);

	}

	/* 
	 * Brute force !!
	 * Psuedo code here:
	 * 1.  if length of input array less than 2  return same array
	 * 2.  Create array X, y with size n
	 *     Create output array size equal to input 
	 * 3.  traverse through input array for 0 to n
	 *      add  those element to array  X
	 * 4.  traver through  input array n till last index
	 *      add those element to array  Y
	 * 5.  traver throgh the output array
	 *      add element  of X and Y
	 * 
	 * 
	 * 
	 */

	private void doshufflearray(int[] nums,int n) {
		// TODO Auto-generated method stub
		
		int[] x= new int[n];
		int[] y=new int[n];
		int[] output=new int[nums.length];
	
		int count=0,m=0,p=0;
		Arrays.fill(x, 0);
		Arrays.fill(y,0);
		
		if(nums.length<2) {
		System.out.println("no shuffle");
	     }else
	     {
	    	 for(int i=0;i<nums.length;i++)
	    	 {
	    		 if(count<n)
	    		 {
	    		x[m]=nums[i];m++;
	    		 }else
	    		 {
	    		y[p]=nums[i];p++;
	    		 }
	    		 count++;
	    	 }
	    	 
	    	 int a=0,b=0;
	    	 for(int j=0;j<output.length;j++)
	    	 {
	    		 if(j%2==0)
	    		 {
	    		 output[j]=x[a];
	    		 a++;
	    		 }else
	    		 {
	    		  output[j]=y[b];
	    		  b++;
	    		 }
	    	 }
	    	 
	    	 System.out.println(Arrays.toString(output));
	    	 
	    	 //System.out.println(Arrays.toString(x));
	    	 //System.out.println(Arrays.toString(y));
	     }
		

}
}
