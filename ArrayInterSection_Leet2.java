package hwprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArrayInterSection_Leet2 {
	/*
	 * Question here !!
	 * arrayInter-ssection -prob2
	 * https://leetcode.com/problems/intersection-of-two-arrays-ii/

	 */

	@Test // +ve
	public void example1() {
		int[] num1= {4,9,5};
		int[] num2= {9,4,9,8,4};
		findInterSection(num1,num2);
		findInterSection_twopointer(num1,num2);
	}
	
	@Test // edge
	public void example2() {
		int[] num1= {1,2,3,2};
		int[] num2= {3,1};
		findInterSection(num1,num2);
		findInterSection_twopointer(num1,num2);
	}

	@Test // negative
	public void example3() {
		int[] num1= {2};
		int[] num2= {3};
		findInterSection(num1,num2);
		findInterSection_twopointer(num1,num2);
	}

	/**
	 * 
	 * 1. find size of output array
     2.  use outer   & inner loop   and compare and store the result in output array
	 * 
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	
	
	private int[] findInterSection(int[] nums1, int[] nums2) {
		int count=0;
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		   List<Integer> li =new ArrayList<Integer>();
			 for(int i=0; i< nums1.length ;i++)
			 {
			  for(int j= 0;j< nums2.length;j++)
			    {
				 if(nums1[i] == nums2[j])
				  {
				    System.out.println(nums1[i]);
					
				    li.add(nums1[i]);
				
					
				  }
				}
			 }
		        System.out.println(li);
		        int[] output1=new int[li.size()];
				 for(int k=0;k<li.size();k++)
				 {
					  output1[k]=li.get(k).intValue();
				 }
				 
		        return output1;
		    }
	

	
	public int[] findInterSection_twopointer(int[] nums1, int[] nums2) {
		 int count=0;   
	        Arrays.sort(nums1);
	        Arrays.sort(nums2);
	        
	        int left=0,right=0;
	        List<Integer> li =new ArrayList<Integer>();
	        while(left<nums1.length && right <nums2.length)
	        {
	            if(nums1[left]==nums2[right])
	            {
	               
	             li.add(nums1[left]);
	                
	                left++;
	                right++;
	            }else if(nums1[left] < nums2[right])
	            {
	                left++;
	            }else
	            {
	                right++;
	            }
	        }
	        int[] output =new int[li.size()];
	        for(int i=0;i< li.size();i++)
	        {
	            output[i]=li.get(i).intValue();
	        }
	        return output;
	}

		

}
