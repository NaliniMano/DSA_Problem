package week9;

import org.junit.Test;

public class HeightChecker {
	
	@Test
	public void example()
	{
		int[] height= {};
		findHeightChecker(height);
	}

	private void findHeightChecker(int[] height) {
		// TODO Auto-generated method stub
		int[] expected = new int[height.length];
        for(int k=0;k<height.length;k++)
        {
            expected[k]=height[k];
        }
    
         int[] sortarr=doSort_SelectionSort(height);
        
       
        
        int left =0,right=0,count=0;
        while(left< expected.length && right < sortarr.length)
        {
            
            if(expected[left]!=sortarr[right])
            {
                count++;
            }
            
            left++;
            right++;
        }
     
    
       
	}
	
	 public int[] doSort_SelectionSort(int[] height) {
			// TODO Auto-generated method stub
			
			int pivot=0, i;
			for( i=0;i<height.length-1;i++)
			{
			   if(height[i]>height[i+1])
			   {
				   int temp = height[i];
				   height[i]=height[i+1];
				   height[i+1]=temp;
			   }
			   
			   pivot=i;
				for(int j=pivot;j>0;j--)
				{
					if(height[j]<height[j-1])
					{
					int temp2 = height[j-1];
					height[j-1]=height[j];
					height[j]=temp2;
					}
				}
			}
			
			return height;
		}

}
