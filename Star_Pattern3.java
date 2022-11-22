package patternprograms;

import org.junit.Test;

public class Star_Pattern3 {
	
	/*Star Pattern 3

	* 

	* * 

	* * * 

	* * * * 

	* * * * * 

	* * * * 

	* * * 

	* * 

	*   */
	
	
	@Test
	public void pattern()
	{
		int row=10;
		for(int i=0;i<row;i++)
		{
		     if(i<=5)
		     {
			for(int j=0;j<i;j++)
			{
				System.out.print("*");
				if(j>=5)
				{
					
				}
			}
		     }else
		     {
		    	 for(int k=row-i-1;k>=0;k--)
		    	 {
		    		 System.out.print("*");
		    	 }
		     }
		     System.out.println();
		}
	}
	

}
