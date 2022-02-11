package assignment.feb10;

import java.util.Arrays;

public class MissingElementInAnArray {
	
	public static void main(String args[])
	{
		int arr[] = {1,2,3,4,7,5,9,8};
		
		Arrays.sort(arr);
		
		int iterator=0;
		
		for(int i=0;i<arr.length;i++)
		{
			iterator=i+1;
			if(iterator==arr[i])
				continue;
			else
				iterator=i+1;
				break;
		}
		
		System.out.println(iterator);
	}

}
