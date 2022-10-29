/**

Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
**/


public void example1()
{
	 int[] nums={2,7,11,15}
	  int target=9;
	  findtwosum(nums,target);
}

public void example2()
{
	 int[] nums={-1,0}
	  int target=-1;
	  findtwosum(nums,target);
}

public void example3()
{
	 int[] nums={1,3,9,5,6}
	  int target=49;
	  findtwosum(nums,target);
}


/*
1) use outer and inner loop to traver through element
2) find the sum of outer element with inner element
3) check if the sum match with target if match return the index


**/

public void findtwosum(int[] nums,int target)
{
	 int sum=0;
	 int[] output =new int[2];
	for(int i=0;i<nums.length;i++)
	{
		for(intj=i+1;j<nums.length;i++)
		{
			sum=nums[i]+nums[j];
			if(sum == target){
			System.out.println(i+ ,+j);
			output[0]=i;
			output[j]=j;
			}
		}
    }		
	return output;
}
/**
1. Declare two pointer left =0 and right = last index
2. loop through until left greater than right
3. find the sum of element from left to right increment left and decrement right
4. check sum match with target
    return the index
	if sum less than target increment left
	else decrement right;

**/

public void findtwosum_twopointer(int[] nums,int target)
{
	int left= 0,right=nums.length-1,sum=0;
	 int[] output =new int[2];
	while(left<right>
	{
		 sum =nums[left]+nums[right];
		 if(sum == target)
		 {
			 output[0]=left;
			output[j]=right;
		 }else if(sum < target) left++;
		else
        right;		
	}
	return output
}