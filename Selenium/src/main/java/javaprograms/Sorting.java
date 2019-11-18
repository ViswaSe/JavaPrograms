package javaprograms;

public class Sorting {
	
	int n;
	int min_index;
	
	public int[] sort(int[] arr)
	{
		n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			min_index=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_index])
				{
					min_index=j;
				}
			}
			
			int temp=arr[min_index];
			arr[min_index]=arr[i];
			arr[i]=temp;
		}
		
		return arr;
	}
	
	public void printArray(int[] res)
	{
		for(int i=0;i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	
	public static void main(String args[])
	{
		Sorting obj=new Sorting();
		
		int[] arr= {10,2,5,6,34,21,22,1};
		int[] res=obj.sort(arr);
		obj.printArray(res);
	}

}
