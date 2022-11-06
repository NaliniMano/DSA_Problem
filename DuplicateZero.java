package day7;

import java.util.Arrays;

import org.junit.Test;

public class DuplicateZero {
	@Test
	public void example1()
	{
		int[] arr= {1,0,2,3,0,4,5,0};
		duplicateZeros(arr);
	}
	
	/**
	 * 1) iterate through the given array
	 * 2) declare counter
	 * 3 ) when current element not equal to zero  increment count
	 *     if current element == 0 then incrment counter to 2 
	 *  4) iterate the output array and store element into input array
	 * 
	 * 
	 * 
	 * @param arr
	 */
	 public void duplicateZeros(int[] arr) {
	       int[] output =new int[arr.length];
	        int count=0;
	        for(int i=0;i<arr.length;i++ )
	        {
	           if(count<arr.length)
	           {
	            if(arr[i]!=0)
	            { 
	                output[count++]=arr[i];
	                
	             }else
	            {
	                output[i+1]=0;
	                count=count+2;
	            }
	            } 
	        }
	        
	        
	        for(int j=0;j<output.length;j++)
	        {
	            
	            arr[j]=output[j];
	        }
	        
	        System.out.println(Arrays.toString(arr));
	      // arr=Arrays.copyOf(output, output.length);
	    }
}
