package com.devops;

public class Maxnumarray {
	public int checkmax(int[] arr1)
	{
		int max=arr1[0];
		for(int i=0;i< arr1.length;i++)
		{
			if(max<arr1[i])
			{
				max=arr1[i];
			}
		}
		return max; 
	}

}
