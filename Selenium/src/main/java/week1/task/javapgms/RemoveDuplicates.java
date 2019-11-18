package week1.task.javapgms;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String args[])
	{
		int a[]= {1,2,1,22,33,23,34,44,33,34,22,1,34,44};
		Arrays.sort(a);
		removeDup(a,a.length);
	}
	
	public static void removeDup(int[] arr,int length)
	{
		int count=0;
		int[] temp=new int[length];
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]!=arr[i+1])
			{
				temp[count]=arr[i];
				count++;
			}
		}
		
		temp[count]=arr[length-1];
		
		for(int j=0;j<=count;j++)
		{
			System.out.print(temp[j]+" ");
		}
	}

}
