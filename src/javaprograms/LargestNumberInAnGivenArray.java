package javaprograms;

public class LargestNumberInAnGivenArray {
	
	public static void main(String args[])
	{
		int[] a = {19,71,5000,-100,21,34,666};
		
		//a.length=7, 0 to 6
		
		int max=a[0];
		
		for(int i=0;i<a.length;i++)  //i=0, i =1 .... i=6
		{
			for(int j=i+1;j<a.length;j++) //j=1 to 6 , j=2 to 6 ...j!
			{
				if(a[i]>a[j] && a[i]>max)
				{
					max=a[i];
				}
			}
		}
		
		if(a[a.length-1]>max) //{19,71,5,-100,21,34,666}
		{
			max=a[a.length-1];
		}
	
		System.out.println(max);
	}

}
