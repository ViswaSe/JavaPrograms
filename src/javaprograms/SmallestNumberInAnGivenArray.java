package javaprograms;

public class SmallestNumberInAnGivenArray {
	
	public static void main(String args[])
	{
		int[] a = {19,34,5,-10,21,6,2,1,8,17,0,-2};
		
		int min = a[0];  //min=19
		
		for(int i=0;i<a.length;i++)       //i=0, a[0]=19
		{
			for(int j=i+1;j<a.length;j++) //j=1 to 7 , a[1,2,3,4..]
			{
				if(a[i]<a[j] && a[i]<min)
				{
					min=a[i];  //min = 1
				}
			}
		}
		
		if(min>a[a.length-1])
		{
			min=a[a.length-1];
		}
		
		System.out.println(min);
	}

}
